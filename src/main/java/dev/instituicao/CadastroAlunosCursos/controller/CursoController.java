package dev.instituicao.CadastroAlunosCursos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.instituicao.CadastroAlunosCursos.model.CursoModel;
import dev.instituicao.CadastroAlunosCursos.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/listarCursos")
	public List<CursoModel> listarCursos() {
		return cursoService.listarCursos();
	}
	
	@PostMapping("/criarCurso")
	public CursoModel criarCurso(@RequestBody CursoModel curso) {
	    System.out.println("Curso recebido: " + curso);
	    return cursoService.criarCurso(curso);
	}

	
	@DeleteMapping("/{id}")
	public void deletarCurso(@PathVariable Long id) {
		cursoService.deletarCurso(id);
	}
	


	
	
	
	
	
}
