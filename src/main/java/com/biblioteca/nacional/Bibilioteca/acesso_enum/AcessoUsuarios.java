package com.biblioteca.nacional.Bibilioteca.acesso_enum;

public enum AcessoUsuarios {
    USUARIO("usuario"),CLIENTE("cliente"),MASTER("master");
    private String nome;
    AcessoUsuarios(String nome){
        this.nome = nome;
    }
    AcessoUsuarios(){}
    public String getNome(){
       return this.nome;
    }
}
