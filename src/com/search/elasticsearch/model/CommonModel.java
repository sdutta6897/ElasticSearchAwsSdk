package com.search.elasticsearch.model;

/**
 * @author 643439
 *
 */
public class CommonModel {

	private Long docstoreId;
	
	private SourceCountry sourceCountry;
	
	private DocType docType;
	
	private String customerId;
	
	private String customerIdType;
	
	private String docFileName;
	
	private String docFileLocation;
	
	private String deleteFlag;
	
	private String lastUpdatedUserId;
	
	private String insertedTimeStamp;

	private String lastUpdatedTimeStamp;
	
	private MetaDataModel docstoreMetaData;

	/**
	 * @return the docstoreId
	 */
	public Long getDocstoreId() {
		return docstoreId;
	}

	/**
	 * @param docstoreId the docstoreId to set
	 */
	public void setDocstoreId(Long docstoreId) {
		this.docstoreId = docstoreId;
	}

	/**
	 * @return the sourceCountry
	 */
	public SourceCountry getSourceCountry() {
		return sourceCountry;
	}

	/**
	 * @param sourceCountry the sourceCountry to set
	 */
	public void setSourceCountry(SourceCountry sourceCountry) {
		this.sourceCountry = sourceCountry;
	}

	/**
	 * @return the docType
	 */
	public DocType getDocType() {
		return docType;
	}

	/**
	 * @param docType the docType to set
	 */
	public void setDocType(DocType docType) {
		this.docType = docType;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the customerIdType
	 */
	public String getCustomerIdType() {
		return customerIdType;
	}

	/**
	 * @param customerIdType the customerIdType to set
	 */
	public void setCustomerIdType(String customerIdType) {
		this.customerIdType = customerIdType;
	}

	/**
	 * @return the docFileName
	 */
	public String getDocFileName() {
		return docFileName;
	}

	/**
	 * @param docFileName the docFileName to set
	 */
	public void setDocFileName(String docFileName) {
		this.docFileName = docFileName;
	}

	/**
	 * @return the docFileLocation
	 */
	public String getDocFileLocation() {
		return docFileLocation;
	}

	/**
	 * @param docFileLocation the docFileLocation to set
	 */
	public void setDocFileLocation(String docFileLocation) {
		this.docFileLocation = docFileLocation;
	}

	/**
	 * @return the deleteFlag
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * @param deleteFlag the deleteFlag to set
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * @return the lastUpdatedUserId
	 */
	public String getLastUpdatedUserId() {
		return lastUpdatedUserId;
	}

	/**
	 * @param lastUpdatedUserId the lastUpdatedUserId to set
	 */
	public void setLastUpdatedUserId(String lastUpdatedUserId) {
		this.lastUpdatedUserId = lastUpdatedUserId;
	}

	/**
	 * @return the insertedTimeStamp
	 */
	public String getInsertedTimeStamp() {
		return insertedTimeStamp;
	}

	/**
	 * @param insertedTimeStamp the insertedTimeStamp to set
	 */
	public void setInsertedTimeStamp(String insertedTimeStamp) {
		this.insertedTimeStamp = insertedTimeStamp;
	}

	/**
	 * @return the lastUpdatedTimeStamp
	 */
	public String getLastUpdatedTimeStamp() {
		return lastUpdatedTimeStamp;
	}

	/**
	 * @param lastUpdatedTimeStamp the lastUpdatedTimeStamp to set
	 */
	public void setLastUpdatedTimeStamp(String lastUpdatedTimeStamp) {
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
	}

	/**
	 * @return the docstoreMetaData
	 */
	public MetaDataModel getDocstoreMetaData() {
		return docstoreMetaData;
	}

	/**
	 * @param docstoreMetaData the docstoreMetaData to set
	 */
	public void setDocstoreMetaData(MetaDataModel docstoreMetaData) {
		this.docstoreMetaData = docstoreMetaData;
	}
	
}
