package dev.instituicao.CadastroAlunosCursos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.instituicao.CadastroAlunosCursos.Cursos.CursoModel;
import dev.instituicao.CadastroAlunosCursos.Service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	private final CursoService cursoService;
	
	public CursoController(CursoService cursoService) {
		this.cursoService = cursoService;
	}
	
	@GetMapping
	public List<CursoModel> listarCursos() {
		return cursoService.listarCursos();
	}
	
	@PostMapping
	public CursoModel criarCurso(@RequestBody CursoModel curso) {
		 System.out.println("Recebido: " + curso); // Log para verificar os valores do objeto curso
		return cursoService.salvarCurso(curso);
	}
	
	
}
