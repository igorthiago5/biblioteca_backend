package com.biblioteca.nacional.Bibilioteca.service;

import com.biblioteca.nacional.Bibilioteca.entities.Genero;
import com.biblioteca.nacional.Bibilioteca.repositorys.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {
    @Autowired
    GeneroRepository generoRepository;

    public Genero salvarGenero(Genero genero){
        return generoRepository.save(genero);
    }
}
