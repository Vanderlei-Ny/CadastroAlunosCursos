package dev.instituicao.CadastroAlunosCursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.instituicao.CadastroAlunosCursos.model.AlunoModel;

	@Repository
	public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
	}


