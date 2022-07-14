package com.xmen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xmen.model.DnaModel;
import com.xmen.servicio.IArreglo;

@Controller
@RequestMapping("/app")
public class XmenController {
	
	@Autowired
	private IArreglo iarreglo;
	
	@PostMapping(value ="/mutant")
	public ResponseEntity<?>  ArrayXmen(@RequestBody DnaModel dna) {
		if(iarreglo.isMutant(dna.getDna())) {
			return new ResponseEntity("Es mutante", HttpStatus.OK);
		}else {
			return new ResponseEntity("No es mutante", HttpStatus.OK);
		}
		
		
	}	
	
}
