package com.ufma.programa_docente.repositories;

import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ufma.programa_docente.entities.Docente;
import com.ufma.programa_docente.repositories.DocenteRepository;

@SpringBootTest
public class DocenteRepositoryTest {
    @Autowired
    private DocenteRepository repository;

    @Test
    public void shouldSaveDocente(){
        //context
        Docente docente = Docente.builder().name("César").data(new Date()).build();

        //action
        Docente saved = repository.save(docente);

        //Verification
        Assertions.assertNotNull(saved);
        Assertions.assertEquals(docente.getName(), saved.getName());
        Assertions.assertEquals(docente.getId_docente(), saved.getId_docente());
        Assertions.assertEquals(docente.getId_lattes(), saved.getId_lattes());
        Assertions.assertEquals(docente.getData(), saved.getData());
        Assertions.assertEquals(docente.getOrientacoes(), saved.getOrientacoes());
        Assertions.assertEquals(docente.getProducoes(), saved.getProducoes());
        Assertions.assertEquals(docente.getProgramas(), saved.getProgramas());

    }

    @Test
    public void shouldUpdateDocente() {
        //context
        Docente docente = Docente.builder().name("César").data(new Date()).build();

        //action
        Docente saved = repository.save(docente);
        Docente docenteToUpdate = Docente.builder().id_docente(saved.getId_docente()).name("Carlos").data(new Date())
                .build();
        Docente updated = repository.save(docenteToUpdate);

        //Verification
        Assertions.assertNotNull(saved);
        Assertions.assertNotNull(updated);
        Assertions.assertEquals(saved.getId_docente(), updated.getId_docente());
        Assertions.assertNotEquals(saved.getName(), updated.getName());

    }

    @Test
    public void shouldRemoveDocente() {
        //context 
        Docente docente = Docente.builder().name("César").data(new Date()).build();

        //action
        Docente saved = repository.save(docente);
        repository.delete((saved));

        Optional optionalFromDb = repository.findById(saved.getId_docente());
        Docente docenteFromDb = (Docente) optionalFromDb.orElse(null);


        //verification
        Assertions.assertNull(docenteFromDb);

    }
    
}
