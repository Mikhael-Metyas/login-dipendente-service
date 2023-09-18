package com.proconsul.dto;

import java.io.Serializable;

public class DipendenteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String codiceFiscale;
	
	protected DipendenteDTO() {}


	public DipendenteDTO(String codiceFiscale) {
		super();
		this.codiceFiscale = codiceFiscale;
	}


	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
}
