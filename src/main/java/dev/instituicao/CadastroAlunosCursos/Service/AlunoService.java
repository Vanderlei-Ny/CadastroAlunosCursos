package dev.instituicao.CadastroAlunosCursos.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import dev.instituicao.CadastroAlunosCursos.Alunos.AlunoModel;
import dev.instituicao.CadastroAlunosCursos.repository.AlunoRepository;

@Service
public class AlunoService {

	public final AlunoRepository alunoRepository;
	
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	public List<AlunoModel> listarAlunos() {
		return alunoRepository.findAll();
	}
	
	public AlunoModel salvarAluno(AlunoModel aluno) {
		return alunoRepository.save(aluno);
	}
			

}
