package com.ufma.programa_docente.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufma.programa_docente.entities.Docente;
import com.ufma.programa_docente.services.DocenteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/docentes")
public class DocenteResource {

    @Autowired
    private DocenteService docenteDAO;

    @GetMapping
    public ResponseEntity<List<Docente>> findAll() {
        List<Docente> list = docenteDAO.findAll();

        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Docente> findById(@PathVariable("id") Integer id){
        Docente docente = docenteDAO.findById(id);
        return ResponseEntity.ok().body(docente);
    }
    


    
}
