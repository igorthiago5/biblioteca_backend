package com.biblioteca.nacional.Bibilioteca.repositorys;

import com.biblioteca.nacional.Bibilioteca.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
