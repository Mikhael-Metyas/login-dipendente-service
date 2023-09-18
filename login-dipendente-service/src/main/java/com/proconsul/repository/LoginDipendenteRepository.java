package com.proconsul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proconsul.entity.Dipendente;

public interface LoginDipendenteRepository extends JpaRepository<Dipendente, String> {

}
