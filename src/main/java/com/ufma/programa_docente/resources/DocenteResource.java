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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public ResponseEntity<Docente> save(@RequestBody Docente docente) {
        docente = docenteDAO. save(docente);
        return ResponseEntity.ok().body(docente);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Docente> findById(@PathVariable("id") Integer id){
        Docente docente = docenteDAO.findById(id);
        return ResponseEntity.ok().body(docente);
    }
    


    
}
