package com.ufma.programa_docente.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "docente")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Docente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "id_docente")
    private Integer id_docente;

    @Column(name = "id_lattes")
    private String id_lattes;

    @Column(name = "nome")
    private String name;
    
    @Column(name = "dt_atual")
    private Date data;

    @ManyToMany(mappedBy = "docentes")
    Set<Programa> programas;

    @ManyToMany
    @JoinTable(
        name= "docente_tecnica",
        joinColumns = @JoinColumn(name= "id_tecnica"),
        inverseJoinColumns = @JoinColumn(name= "id_docente")
    )
    Set<Tecnica> tecnicas;
    
    @ManyToMany
    @JoinTable(
        name= "docente_producao",
        joinColumns = @JoinColumn(name= "id_producao"),
        inverseJoinColumns = @JoinColumn(name= "id_docente")
    )
    Set<Producao> producoes;


    @OneToMany(mappedBy = "docente")
    private List<Orientacao> orientacoes;
}
