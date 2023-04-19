package com.ufma.programa_docente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufma.programa_docente.entities.Producao;

public interface ProducaoRepository extends JpaRepository<Producao, Integer> {
    
}
