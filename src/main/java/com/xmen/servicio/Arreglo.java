package com.xmen.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Arreglo implements IArreglo {

	@Autowired
	private Operacion reclutar = new Operacion();	
	
	@Override
	public boolean isMutant(String[] dna) {
		boolean exito = true;
		
		if(reclutar.conteoSecuencia(dna) < 2) {
			exito=false;
		}

		return exito;
	}

}
