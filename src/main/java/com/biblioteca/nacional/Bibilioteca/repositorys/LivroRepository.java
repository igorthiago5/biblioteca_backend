package com.biblioteca.nacional.Bibilioteca.repositorys;

import com.biblioteca.nacional.Bibilioteca.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Long> {
}
