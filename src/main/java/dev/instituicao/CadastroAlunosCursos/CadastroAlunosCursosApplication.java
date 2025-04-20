package dev.instituicao.CadastroAlunosCursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.instituicao.CadastroAlunosCursos.controller", 
        "dev.instituicao.CadastroAlunosCursos.service", 
        "dev.instituicao.CadastroAlunosCursos.repository"})
public class CadastroAlunosCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroAlunosCursosApplication.class, args);
	}

}
