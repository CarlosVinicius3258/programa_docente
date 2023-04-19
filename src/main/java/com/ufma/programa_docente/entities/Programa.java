package com.ufma.programa_docente.entities;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "programa")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Programa {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="id_programa")
    private Integer id_programa;
    @Column(name = "nome")
    private String name;


    @ManyToMany
    @JoinTable(
        name = "programa_docente",
        joinColumns = @JoinColumn(name="id_docente"),
        inverseJoinColumns = @JoinColumn(name="id_programa"))

        Set<Docente> docentes;
    

    
}
