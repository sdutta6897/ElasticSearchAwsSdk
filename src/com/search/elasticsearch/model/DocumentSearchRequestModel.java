/**
 * 
 */
package com.search.elasticsearch.model;

import java.util.Date;

/**
 * @author 643439
 *
 */
public class DocumentSearchRequestModel {
	
	private int pageIndex;
	
	private int pageSize;

	private DocType docType;
	
	private SourceCountry sourceCountry;
	
	private String accountOld;
	
	private String accountNew;
	
	private String transitOld;
	
	private String transitNew;
	
	private String cif;
	
	private String lastName;
	
	private String firstName;
	
	private Date dob;
	
	private String productName;
	
	private String productType;
	
	private String documentName;
	
	private String documentType;
	
	private String appactOld;
	
	private String appactNew;
	
	private Date statementDate;
	
	private Date payDate;
	
	private String clientName;
	
	private String reportId;
	
	private String reportName;
	
	private Date runDate;

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
	 * @return the accountOld
	 */
	public String getAccountOld() {
		return accountOld;
	}

	/**
	 * @param accountOld the accountOld to set
	 */
	public void setAccountOld(String accountOld) {
		this.accountOld = accountOld;
	}

	/**
	 * @return the accountNew
	 */
	public String getAccountNew() {
		return accountNew;
	}

	/**
	 * @param accountNew the accountNew to set
	 */
	public void setAccountNew(String accountNew) {
		this.accountNew = accountNew;
	}

	/**
	 * @return the transitOld
	 */
	public String getTransitOld() {
		return transitOld;
	}

	/**
	 * @param transitOld the transitOld to set
	 */
	public void setTransitOld(String transitOld) {
		this.transitOld = transitOld;
	}

	/**
	 * @return the transitNew
	 */
	public String getTransitNew() {
		return transitNew;
	}

	/**
	 * @param transitNew the transitNew to set
	 */
	public void setTransitNew(String transitNew) {
		this.transitNew = transitNew;
	}

	/**
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the documentName
	 */
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * @param documentName the documentName to set
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	/**
	 * @return the documentType
	 */
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	/**
	 * @return the appactOld
	 */
	public String getAppactOld() {
		return appactOld;
	}

	/**
	 * @param appactOld the appactOld to set
	 */
	public void setAppactOld(String appactOld) {
		this.appactOld = appactOld;
	}

	/**
	 * @return the appactNew
	 */
	public String getAppactNew() {
		return appactNew;
	}

	/**
	 * @param appactNew the appactNew to set
	 */
	public void setAppactNew(String appactNew) {
		this.appactNew = appactNew;
	}

	/**
	 * @return the statementDate
	 */
	public Date getStatementDate() {
		return statementDate;
	}

	/**
	 * @param statementDate the statementDate to set
	 */
	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
	}

	/**
	 * @return the payDate
	 */
	public Date getPayDate() {
		return payDate;
	}

	/**
	 * @param payDate the payDate to set
	 */
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the reportId
	 */
	public String getReportId() {
		return reportId;
	}

	/**
	 * @param reportId the reportId to set
	 */
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	/**
	 * @return the reportName
	 */
	public String getReportName() {
		return reportName;
	}

	/**
	 * @param reportName the reportName to set
	 */
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	/**
	 * @return the runDate
	 */
	public Date getRunDate() {
		return runDate;
	}

	/**
	 * @param runDate the runDate to set
	 */
	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	/**
	 * @return the pageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * @param pageIndex the pageIndex to set
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
