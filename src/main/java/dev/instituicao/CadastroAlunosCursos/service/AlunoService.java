package dev.instituicao.CadastroAlunosCursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.instituicao.CadastroAlunosCursos.model.AlunoModel;
import dev.instituicao.CadastroAlunosCursos.repository.AlunoRepository;

@Service
public class AlunoService {

	private final AlunoRepository alunoRepo;
	
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepo = alunoRepository;
	}
	
    public List<AlunoModel> listarAlunos() {
        return alunoRepo.findAll();
    }

    public AlunoModel criarAluno(AlunoModel aluno) {  // Certifique-se de que este método existe
        return alunoRepo.save(aluno);
    }

    public void deletarAluno(Long id) {
    	alunoRepo.deleteById(id);
    }
}
