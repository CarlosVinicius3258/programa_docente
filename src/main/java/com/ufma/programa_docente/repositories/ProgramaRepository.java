package com.ufma.programa_docente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufma.programa_docente.entities.Programa;

public interface ProgramaRepository extends JpaRepository<Programa, Integer> {
    
}
