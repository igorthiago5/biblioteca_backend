package com.biblioteca.nacional.Bibilioteca.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_acesso")
public class TipoAcesso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_acesso;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "data_cadastro",nullable = false)
    private LocalDateTime data_cadastro;

    public TipoAcesso(){
        this.data_cadastro = LocalDateTime.now();
    }
    public TipoAcesso(String nome){
        this.data_cadastro = LocalDateTime.now();
        this.nome = nome;
    }

    public Long getId_acesso() {
        return id_acesso;
    }

    public void setId_acesso(Long id_acesso) {
        this.id_acesso = id_acesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}
