package com.biblioteca.nacional.Bibilioteca.controllers;

import com.biblioteca.nacional.Bibilioteca.entities.Genero;
import com.biblioteca.nacional.Bibilioteca.entities.Livro;
import com.biblioteca.nacional.Bibilioteca.msg.MensagensJson;
import com.biblioteca.nacional.Bibilioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
public class CadastroLivroRest {
    @Autowired
    LivroService service;

    private String json = "";

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> addLivro(@RequestBody Livro livro){
        try{
            service.salvarLivro(livro);
            json = MensagensJson.mensagemSucessoJson();
        }catch (Exception e){
            System.out.println(e.getMessage());
            json = MensagensJson.mensagemErroJson(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body(json);
    }

}
