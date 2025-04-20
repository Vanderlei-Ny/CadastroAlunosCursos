package dev.instituicao.CadastroAlunosCursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.instituicao.CadastroAlunosCursos.model.AlunoModel;
import dev.instituicao.CadastroAlunosCursos.repository.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoModel> listarAlunos() {
        return alunoRepository.findAll();
    }

    public AlunoModel criarAluno(AlunoModel aluno) {  // Certifique-se de que este método existe
        return alunoRepository.save(aluno);
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }
}
