package dev.instituicao.CadastroAlunosCursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import dev.instituicao.CadastroAlunosCursos.model.CursoModel;
import dev.instituicao.CadastroAlunosCursos.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	public List<CursoModel> listarCursos() {
		return cursoRepository.findAll();
	}
	
	public CursoModel criarCurso(CursoModel curso) {
		return cursoRepository.save(curso);
	}

	public void deletarCurso(Long id) {
		cursoRepository.deleteById(id);
	}
	
	
}
