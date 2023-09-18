package com.proconsul.service;

import com.proconsul.dto.DipendenteDTO;
import com.proconsul.entity.Dipendente;
import com.proconsul.exception.DipendenteNonTrovatoException;

public interface LoginDipendenteService {

	public Dipendente trovaDipendentePerCodiceFiscale (DipendenteDTO dipendenteDTO) throws DipendenteNonTrovatoException;
}
