package dev.instituicao.CadastroAlunosCursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.instituicao.CadastroAlunosCursos.model.CursoModel;	

	@Repository
	public interface CursoRepository extends JpaRepository<CursoModel, Long> {
	}


