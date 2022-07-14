package com.xmen.model;

import java.util.Arrays;

public class DnaModel {

	private String[] dna;

	public String[] getDna() {
		return dna;
	}

	public void setDna(String[] dna) {
		this.dna = dna;
	}

	@Override
	public String toString() {
		return "DnaModel [dna=" + Arrays.toString(dna) + "]";
	}
	
	
}
