package com.search.elasticsearch.model;

public enum SourceCountry {

	PR("Peurto Rico"),
	VI("Virgin Islands"),
	NA("Not applicable");
	
	private String value;
	
	SourceCountry (String s) {
		
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

}
