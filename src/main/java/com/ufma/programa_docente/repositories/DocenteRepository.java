package com.ufma.programa_docente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufma.programa_docente.entities.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {
    
}
