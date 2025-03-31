package dev.instituicao.CadastroAlunosCursos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.instituicao.CadastroAlunosCursos.Alunos.AlunoModel;
import dev.instituicao.CadastroAlunosCursos.Service.AlunoService;

		
@RestController
@RequestMapping("/alunos")
public class AlunoController {

	private final AlunoService alunoService;
	
	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	@GetMapping
	public List<AlunoModel> listarAlunos() {
		return alunoService.listarAlunos();
	}
	@PostMapping
	public AlunoModel criarAluno(@RequestBody AlunoModel aluno) {
		return alunoService.salvarAluno(aluno);
	}
	
	
}
