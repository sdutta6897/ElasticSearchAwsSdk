package com.search.elasticsearch.model;

public enum DocType {

	CUSTOMER("CUSTOMER CIF"),
	DEPOSIT("DEPOSIT"),
	LENDING("LENDING"),
	KYCDOCS("KYC DOCUMENTS"),
	SDDOCS("SIG ACCOUNT DOCUMENTS"),
	COLDDOC("COLDDOCS"),
	LENDINGDOC("LENDING DOCS"),
	OTHERDOC("OTHER DOCS"),
	COLDREPORTS("COLD REPORTS"),
	CREDIT_CARD_E_STATEMENTS("Statements/eStatements(Deposits and Credit Cards)"),
	RADARREPORTS("RADAR REPORTS");
	
	private String value;
	
	DocType(String s) {
		
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

}
