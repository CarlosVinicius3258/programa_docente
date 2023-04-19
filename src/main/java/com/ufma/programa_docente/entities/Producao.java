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
@Table(name = "producao")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Producao {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_producao")
    private Integer id_producao;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "issn_ou_sigla")
    private String issn_ou_sigla;

    @Column(name = "nome_local")
    private String nome_local;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "qualis")
    private String qualis;

    @Column(name = "percentile_ou_h5")
    private float percentile_ou_h5;

    @Column(name = "qtd_grad")
    private Integer qtd_grad;

    @Column(name = "qtd_mestrado")
    private Integer qtd_mestrado;

    @Column(name = "qtd_doutorado")
    private Integer qtd_doutorado;


    @ManyToMany(mappedBy = "producoes")
    Set<Docente> docentes;

    @ManyToMany(mappedBy = "producoes")
    Set<Orientacao> orientacoes;
}
