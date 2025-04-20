package dev.instituicao.CadastroAlunosCursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.instituicao.CadastroAlunosCursos.model.AlunoModel;
import dev.instituicao.CadastroAlunosCursos.service.AlunoService;

@Controller
@RestController
@RequestMapping("/alunos")
public class AlunoController {

	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<AlunoModel> listarAlunos() {
		return alunoService.listarAlunos();
	}
	@PostMapping("/criarAluno")
	public AlunoModel criarAluno(@RequestBody AlunoModel aluno) {
		return alunoService.criarAluno(aluno);
	}
	
	@DeleteMapping("/{id}")
	public void deletarAluno(@PathVariable Long id) {
		alunoService.deletarAluno(id);
	}
	
	
}
