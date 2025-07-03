package com.biblioteca.nacional.Bibilioteca.entities;

import jakarta.persistence.*;
import javafx.scene.input.DataFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "tb_genero")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGenero;

    @Column(name = "nome",length = 100)
    private String nome;

    @Column(name = "data_criacao")
    private LocalDateTime data_criacao;

    public Genero(){

        this.data_criacao = LocalDateTime.now();
    }
    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }
}
