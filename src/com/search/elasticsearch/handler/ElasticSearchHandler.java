/**
 * 
 */
package com.search.elasticsearch.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;

import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.search.elasticsearch.builder.DocumentQueryBuilder;
import com.search.elasticsearch.model.DocType;
import com.search.elasticsearch.model.DocumentMetadataModel;
import com.search.elasticsearch.model.DocumentSearchRequestModel;

/**
 * @author 643439
 *
 */
public class ElasticSearchHandler {

	private static final String serviceName = "es";
	private static final String region = "us-east-1";
	private static final String aesEndpoint = "https://search-orientalbank-test-ziebsgmxgz7t7gxjbqha7izypm.us-east-1.es.amazonaws.com";
	private static final String indexName = "lex_nested_chat_logs";

	static final AWSCredentialsProvider credentialsProvider = new DefaultAWSCredentialsProviderChain();

	public static void main(String[] args) throws IOException {
		List<DocumentMetadataModel> metaDatas = new ArrayList<>();
		RestHighLevelClient restClient = createClient();
		
		//To test with existing index in elastic search
		readAllDocuments(restClient);
		searchDocument(restClient);
		
		//Actual code
		DocumentSearchRequestModel searchRequestModel = new DocumentSearchRequestModel();
		populateDummySearchRequest(searchRequestModel);
		SearchRequest searchRequest = buildSearchRequest(searchRequestModel);
		SearchResponse searchResponse = restClient.search(searchRequest, RequestOptions.DEFAULT);
		for (SearchHit searchHit : searchResponse.getHits().getHits()) {
			DocumentMetadataModel metaData = new ObjectMapper().readValue(searchHit.getSourceAsString(), DocumentMetadataModel.class);
			metaDatas.add(metaData);
		}
	}

	private static void searchDocument(RestHighLevelClient restClient) throws IOException {
		SearchRequest searchRequest = new SearchRequest(indexName);
		QueryBuilder matchQueryBuilder = QueryBuilders.matchQuery("userId", "mediumBot1605213499234");
		SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
		sourceBuilder.query(matchQueryBuilder);
		searchRequest.source(sourceBuilder);
		SearchResponse searchResponse = restClient.search(searchRequest, RequestOptions.DEFAULT);
		for(SearchHit searchHit : searchResponse.getHits().getHits()){
        	System.out.println(searchHit.getSourceAsString());
        }
	}

	private static void readAllDocuments(RestHighLevelClient restClient) throws IOException {
		SearchRequest searchRequest = new SearchRequest(indexName);
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        searchRequest.source(searchSourceBuilder);
        searchSourceBuilder.size(5);
        SearchResponse searchResponse = restClient.search(searchRequest, RequestOptions.DEFAULT);
        
        //To fetch the total records
        Long totalRecords = searchResponse.getHits().getTotalHits();
        for(SearchHit searchHit : searchResponse.getHits().getHits()){
        	System.out.println(searchHit.getSourceAsString());
        }
	}

	private static SearchRequest buildSearchRequest(DocumentSearchRequestModel searchRequestModel) {
		SearchRequest searchRequest = new SearchRequest("document");
		SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
		BoolQueryBuilder boolQueryBuilder = null;
		// TODO: Confirm on docType to be taken from MetaData or CommonModel. Also to
		// verify if KYCDOCS or KYC Documents
		if (Objects.nonNull(searchRequestModel.getDocType())) {
			boolQueryBuilder = QueryBuilders.boolQuery()
					.must(QueryBuilders.termQuery("docType", searchRequestModel.getDocType()));

			switch (searchRequestModel.getDocType()) {
			case KYCDOCS:
				DocumentQueryBuilder.buildKYCDocQuery(boolQueryBuilder, searchRequestModel);
				break;
			case SDDOCS:
				DocumentQueryBuilder.buildSDDocQuery(boolQueryBuilder, searchRequestModel);
				break;
			case LENDINGDOC:
			case COLDDOC:
			case OTHERDOC:
				DocumentQueryBuilder.buildLendingColdOtherDocsQuery(boolQueryBuilder, searchRequestModel);
				break;
			case CREDIT_CARD_E_STATEMENTS:
				DocumentQueryBuilder.buildCreditCardQuery(boolQueryBuilder, searchRequestModel);
				break;
			case RADARREPORTS:
				DocumentQueryBuilder.buildRadarReportQuery(boolQueryBuilder, searchRequestModel);
				break;
			default:
				break;
			}
		} else {
			//If doctype is missing, return all entries from index
			boolQueryBuilder = QueryBuilders.boolQuery().must(QueryBuilders.matchAllQuery());
		}
		sourceBuilder.query(boolQueryBuilder);
		
		//To sort and to set the pagination
		sourceBuilder.sort(new FieldSortBuilder("timestamp").order(SortOrder.DESC));
		//From is not the page no, its offset. Hence page no * page size
		sourceBuilder.from(searchRequestModel.getPageIndex() * searchRequestModel.getPageSize());
		sourceBuilder.size(searchRequestModel.getPageSize());
		searchRequest.source(sourceBuilder);
		return searchRequest;
	}

	private static RestHighLevelClient createClient() {
		AWS4Signer signer = new AWS4Signer();
		signer.setServiceName(serviceName);
		signer.setRegionName(region);
		HttpRequestInterceptor interceptor = new AWSRequestSigningApacheInterceptor(serviceName, signer,
				credentialsProvider);
		return new RestHighLevelClient(RestClient.builder(HttpHost.create(aesEndpoint))
				.setHttpClientConfigCallback(hacb -> hacb.addInterceptorLast(interceptor)));
	}
	
	private static void populateDummySearchRequest(DocumentSearchRequestModel searchRequestModel) {
		searchRequestModel.setDocType(DocType.KYCDOCS);
		searchRequestModel.setCif("850000000007117");
	}
}
