package com.biblioteca.nacional.Bibilioteca.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLivro;
    @Column(name = "nome",length = 255,nullable = false)
    private String nome;
    @Column(name = "autor",length = 255,nullable = false)
    private String autor;
    @Column(name = "isbn",length = 255,nullable = false)
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;
    @Column(name = "data_criacao",length = 255)
    private LocalDateTime data_criacao;

    public Livro(){
        this.data_criacao = LocalDateTime.now();
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }
}
