package com.biblioteca.nacional.Bibilioteca.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class CadastroLivroRest {


    @GetMapping
    public ResponseEntity<?> addLivro(){
        return ResponseEntity.status(HttpStatus.OK).body("Tudo ok");
    }
}
