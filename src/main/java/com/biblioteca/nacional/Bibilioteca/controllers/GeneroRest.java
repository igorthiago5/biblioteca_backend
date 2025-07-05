package com.biblioteca.nacional.Bibilioteca.controllers;

import com.biblioteca.nacional.Bibilioteca.entities.Genero;
import com.biblioteca.nacional.Bibilioteca.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genero")
public class GeneroRest {
    private String json;
    @Autowired
    GeneroService service;

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> addGenero(@RequestBody Genero genero){
        try{
            service.salvarGenero(genero);
            json  = """
                    {
                       "result":true
                    }
                    """;
        }catch (Exception e){
            System.out.println(e.getMessage());
            json = """
                    {
                        "result":false,
                        "erro":%s
                    }
                    """.formatted(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body(json);
    }
}
