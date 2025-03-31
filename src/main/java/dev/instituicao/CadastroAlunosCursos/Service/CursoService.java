package dev.instituicao.CadastroAlunosCursos.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import dev.instituicao.CadastroAlunosCursos.Cursos.CursoModel;
import dev.instituicao.CadastroAlunosCursos.repository.CursoRepository;

@Service
public class CursoService {

	private final CursoRepository cursoRepository;
	
	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}
	
	public List<CursoModel> listarCursos() {
		return cursoRepository.findAll();
	}
	
	public CursoModel salvarCurso(CursoModel curso) {
		return cursoRepository.save(curso);
	}
	
}
