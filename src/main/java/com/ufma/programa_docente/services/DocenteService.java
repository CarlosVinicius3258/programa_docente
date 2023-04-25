package com.ufma.programa_docente.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ufma.programa_docente.entities.Docente;
import com.ufma.programa_docente.repositories.DocenteRepository;

@Service
public class DocenteService {
    @Autowired
    private DocenteRepository docenteDAO;

    @Transactional(readOnly = true)
    public List<Docente> findAll(){
        List<Docente> docentes = docenteDAO.findAll();
        return docentes;
    };

    @Transactional(readOnly = true)
    public Docente findById(Integer id) {
        Optional<Docente> docenteOptional = docenteDAO.findById(id);
        Docente docente = docenteOptional.get();
        return docente;
    }

    @Transactional(readOnly = false)
    public Docente save(Docente docente) {
        docente = docenteDAO.save(docente);
        return docente;
    }

    
}
