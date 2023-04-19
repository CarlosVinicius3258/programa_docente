package com.ufma.programa_docente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufma.programa_docente.entities.Orientacao;

public interface OrientacaoRepository extends JpaRepository<Orientacao, Integer> {
    
}
