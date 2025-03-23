package dev.instituicao.CadastroAlunosCursos.Cursos;

import java.util.List;

import dev.instituicao.CadastroAlunosCursos.Alunos.AlunoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //todo o código será uma entidade com atributos bem definidos, OU SEJA, UMA CLASSE EM UMA ENTIDADE 
@Table(name ="Table_de_cursos")
@Data // -> subtitui os getter e setters
@NoArgsConstructor
@AllArgsConstructor 
public class CursoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //longa quantia de id's, OBS: O JAVA EM SÍ ADICIONA OS ID'S AUTOMATICAMENTE
	private String nomeCurso; 
	private int quantiaSemestres;
	private int semestreAtual;
	
	@OneToMany(mappedBy = "cursos")
	private List <AlunoModel> alunos;
	
	
}
