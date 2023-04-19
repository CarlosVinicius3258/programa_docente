package com.ufma.programa_docente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufma.programa_docente.entities.Tecnica;

public interface TecnicaRepository extends JpaRepository<Tecnica, Integer> {
    
}
