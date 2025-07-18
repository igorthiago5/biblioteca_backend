package com.biblioteca.nacional.Bibilioteca.controllers;

import com.biblioteca.nacional.Bibilioteca.dto.GeneroDTO;
import com.biblioteca.nacional.Bibilioteca.entities.Genero;
import com.biblioteca.nacional.Bibilioteca.msg.MensagensJson;
import com.biblioteca.nacional.Bibilioteca.repositorys.GeneroRepository;
import com.biblioteca.nacional.Bibilioteca.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/genero")
public class GeneroRest {
    private String json;
    @Autowired
    GeneroService service;

    @Autowired
    GeneroRepository generoRepository;

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> addGenero(@RequestBody Genero genero){
        try{
            service.salvarGenero(genero);
            json  = MensagensJson.mensagemSucessoJson();
        }catch (Exception e){
            System.out.println(e.getMessage());
            json = MensagensJson.mensagemErroJson(e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.OK).body(json);
    }
    @CrossOrigin
    @GetMapping("/list_genero")
    public ResponseEntity<?> getListGenero(){
        List<GeneroDTO> listGenero = generoRepository.findAll()
                .stream()
                .map(g-> new GeneroDTO(g.getIdGenero(),g.getNome()))
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(listGenero);
    }
}
