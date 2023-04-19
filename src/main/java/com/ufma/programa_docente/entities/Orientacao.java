package com.ufma.programa_docente.entities;

import java.util.Set;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orientacao")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Orientacao {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id_orientacao")
    private Integer id_orientacao;
    //@Column(name="id_docente")
    //private Integer id_docente;
    @Column(name="tipo")
    private String tipo;
    @Column(name="discente")
    private String discente;
    @Column(name="titulo")
    private String titulo;
    @Column(name="ano")
    private Integer ano;
    @Column(name="modalidade")
    private String modalidade;
    @Column(name="instituicao")
    private String instituicao;
    @Column(name="curso")
    private String curso;
    @Column(name="status")
    private String status;

    @ManyToMany
    @JoinTable(
        name= "orientacao_tecnica",
        joinColumns = @JoinColumn(name="id_tecnica"),
        inverseJoinColumns = @JoinColumn(name="id_orientacao")
    )
    Set<Tecnica> tecnicas;

    @ManyToMany
    @JoinTable(
        name="orientacao_producao",
        joinColumns = @JoinColumn(name="id_producao"),
        inverseJoinColumns = @JoinColumn(name="id_orientacao")
    )
    Set<Producao> producoes;

    @ManyToOne
    @JoinColumn(name = "id_docente")
    private Docente docente;

}
