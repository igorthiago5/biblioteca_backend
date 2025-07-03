package com.biblioteca.nacional.Bibilioteca.controllers;

import com.biblioteca.nacional.Bibilioteca.entities.Genero;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genero")
public class GeneroRest {
    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> addGenero(@RequestBody Genero genero){
        return ResponseEntity.status(HttpStatus.OK).body(genero);
    }
}
