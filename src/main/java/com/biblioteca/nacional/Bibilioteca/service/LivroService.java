package com.biblioteca.nacional.Bibilioteca.service;

import com.biblioteca.nacional.Bibilioteca.entities.Livro;
import com.biblioteca.nacional.Bibilioteca.repositorys.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    LivroRepository livroRepository;

    public Livro salvarLivro(Livro livro){
        return livroRepository.save(livro);
    }
}
