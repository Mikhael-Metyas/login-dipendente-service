package com.proconsul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proconsul.dto.DipendenteDTO;
import com.proconsul.entity.Dipendente;
import com.proconsul.exception.DipendenteNonTrovatoException;
import com.proconsul.service.LoginDipendenteService;


@RestController
@RequestMapping("/rest/api/dipendenti")
public class LoginDipendenteController {

	@Autowired 
	private LoginDipendenteService loginDipendenteService;
	
	
	@PostMapping("/login-dipendente")
	
	public Dipendente trovaDipendentePerCodiceFiscale (@RequestBody DipendenteDTO dipendenteDTO) throws DipendenteNonTrovatoException{
		
		return loginDipendenteService.trovaDipendentePerCodiceFiscale(dipendenteDTO);
	}
	
}
