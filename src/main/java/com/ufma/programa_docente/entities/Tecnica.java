package com.ufma.programa_docente.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tecnica")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tecnica {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id_tecnica")
    private Integer id_tecnica;
    @Column(name="tipo")
    private String tipo;
    @Column(name="titulo")
    private String titulo;
    @Column(name="ano")
    private Integer ano;
    @Column(name="financiadora")
    private String financiadora;
    @Column(name="outras_informacoes")
    private String outras_informacoes;
    @Column(name="qtd_grad")
    private Integer qtd_grad;
    @Column(name="qtd_mestrado")
    private Integer qtd_mestrado;
    @Column(name="qtd_doutorado")
    private Integer qtd_doutorado;


    @ManyToMany(mappedBy = "tecnicas")
    Set<Docente> docentes;

    @ManyToMany(mappedBy = "tecnicas")
    Set<Orientacao> orientacoes;
    
}
