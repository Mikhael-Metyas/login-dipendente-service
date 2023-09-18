package com.proconsul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proconsul.dto.DipendenteDTO;
import com.proconsul.entity.Dipendente;
import com.proconsul.exception.DipendenteNonTrovatoException;
import com.proconsul.repository.LoginDipendenteRepository;

@Service
public class LoginDipendenteServiceImpl implements LoginDipendenteService {

	@Autowired
	private LoginDipendenteRepository loginDipendenteRepository;
	@Override
	public Dipendente trovaDipendentePerCodiceFiscale(DipendenteDTO dipendenteDTO) throws DipendenteNonTrovatoException {
		
		return loginDipendenteRepository.findById(dipendenteDTO.getCodiceFiscale()).orElseThrow(()->new DipendenteNonTrovatoException("Dipendete non Trovato"));
	}

}
