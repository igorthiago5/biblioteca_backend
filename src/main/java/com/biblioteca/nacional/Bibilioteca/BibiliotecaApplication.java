package com.biblioteca.nacional.Bibilioteca;

import com.biblioteca.nacional.Bibilioteca.acesso_enum.AcessoUsuarios;
import com.biblioteca.nacional.Bibilioteca.entities.TipoAcesso;
import com.biblioteca.nacional.Bibilioteca.repositorys.TipoAcessoRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BibiliotecaApplication {
	private AcessoUsuarios acessoUsuarios;
	public static void main(String[] args) {
		SpringApplication.run(BibiliotecaApplication.class, args);
	}
	@Bean
	public  ApplicationRunner run(TipoAcessoRepository repository){
		return args -> {
			TipoAcesso a1 = new TipoAcesso(AcessoUsuarios.USUARIO.getNome());

			TipoAcesso a2 = new TipoAcesso(AcessoUsuarios.CLIENTE.getNome());

			TipoAcesso a3 = new TipoAcesso(AcessoUsuarios.MASTER.getNome());

			repository.save(a1);
			repository.save(a2);
			repository.save(a3);
		};

	}

}
