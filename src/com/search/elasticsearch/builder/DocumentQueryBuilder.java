/**
 * 
 */
package com.search.elasticsearch.builder;

import java.util.Objects;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import com.amazonaws.util.StringUtils;
import com.search.elasticsearch.model.DocumentSearchRequestModel;

/**
 * @author 643439
 *
 */
public class DocumentQueryBuilder {

	public static void buildKYCDocQuery(BoolQueryBuilder boolQueryBuilder,
			DocumentSearchRequestModel searchRequestModel) {
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getCif())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("cif", searchRequestModel.getCif()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getLastName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("lastName", searchRequestModel.getLastName()));
		}
		if (Objects.nonNull(searchRequestModel.getDob())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("dob", searchRequestModel.getDob()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getDocumentName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("doc", searchRequestModel.getDocumentName()));
		}
	}

	public static void buildSDDocQuery(BoolQueryBuilder boolQueryBuilder,
			DocumentSearchRequestModel searchRequestModel) {
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getCif())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("cif", searchRequestModel.getCif()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getAccountOld())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("acct_old", searchRequestModel.getAccountOld()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getTransitOld())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("trans_old", searchRequestModel.getTransitOld()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getLastName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("lastName", searchRequestModel.getLastName()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getFirstName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("firstName", searchRequestModel.getFirstName()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getDocumentName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("doc", searchRequestModel.getDocumentName()));
		}
		if (Objects.nonNull(searchRequestModel.getDob())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("dob", searchRequestModel.getDob()));
		}
	}

	public static void buildLendingColdOtherDocsQuery(BoolQueryBuilder boolQueryBuilder,
			DocumentSearchRequestModel searchRequestModel) {
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getCif())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("cif", searchRequestModel.getCif()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getLastName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("lastName", searchRequestModel.getLastName()));
		}
		if (Objects.nonNull(searchRequestModel.getDob())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("dob", searchRequestModel.getDob()));
		}
		if (Objects.nonNull(searchRequestModel.getAppactOld())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("appact_old", searchRequestModel.getAppactOld()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getTransitOld())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("trans_old", searchRequestModel.getTransitOld()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getProductName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("rqtyp", searchRequestModel.getProductName()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getDocumentType())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("doctyp", searchRequestModel.getDocumentType()));
		}
	}

	public static void buildCreditCardQuery(BoolQueryBuilder boolQueryBuilder,
			DocumentSearchRequestModel searchRequestModel) {
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getAccountOld())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("acct_old", searchRequestModel.getAccountOld()));
		}
		if (Objects.nonNull(searchRequestModel.getStatementDate())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("stmtdate", searchRequestModel.getStatementDate()));
		}
		if (Objects.nonNull(searchRequestModel.getPayDate())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("paydate", searchRequestModel.getPayDate()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getClientName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("cname", searchRequestModel.getClientName()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getTransitOld())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("trans_old", searchRequestModel.getTransitOld()));
		}
	}

	public static void buildRadarReportQuery(BoolQueryBuilder boolQueryBuilder,
			DocumentSearchRequestModel searchRequestModel) {
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getReportId())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("reportId", searchRequestModel.getReportId()));
		}
		if (!StringUtils.isNullOrEmpty(searchRequestModel.getReportName())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("reportName", searchRequestModel.getReportName()));
		}
		if (Objects.nonNull(searchRequestModel.getRunDate())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("runDate", searchRequestModel.getRunDate()));
		}
		if (Objects.nonNull(searchRequestModel.getSourceCountry())) {
			boolQueryBuilder.must(QueryBuilders.termQuery("src_country", searchRequestModel.getSourceCountry()));
		}
	}

}
