package dev.instituicao.CadastroAlunosCursos.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //todo o código será uma entidade com atributos bem definidos, OU SEJA, UMA CLASSE EM UMA ENTIDADE 
@Table(name ="cursos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
public class CursoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //longa quantia de id's, OBS: O JAVA EM SÍ ADICIONA OS ID'S AUTOMATICAMENTE
	
	@Column(name = "nome_curso")
	private String nomeCurso; 
	 
	@Column(name = "quantia_semestres")
	private int quantiaSemestres;
	
	@Override
	public String toString() {
	    return "CursoModel{" +
	            "id=" + id +
	            ", nomeCurso='" + nomeCurso + '\'' +
	            ", quantiaSemestres=" + quantiaSemestres +
	            '}';
	}
	
	@OneToMany(mappedBy = "curso")
	@JsonIgnore
	private List<AlunoModel> alunos;



	
}
