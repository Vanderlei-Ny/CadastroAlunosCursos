package dev.instituicao.CadastroAlunosCursos;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity //todo o código será uma entidade com atributos bem definidos, OU SEJA, UMA CLASSE EM UMA ENTIDADE 
@Table(name ="Curso")
public class CursoModel {

	Long id; //longa quantia de id's, OBS: O JAVA EM SÍ ADICIONA OS ID'S AUTOMATICAMENTE
	String nomeCurso; 
	int quantiaSemestres;
	int semestreAtual;
	
	
	public CursoModel() {
		
	}
	
	public CursoModel (String nomeCurso, int quantiaSemestres, int semestreAtual) {
		this.nomeCurso = nomeCurso;
		this.quantiaSemestres = quantiaSemestres;
		this.semestreAtual = semestreAtual;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getQuantiaSemestres() {
		return quantiaSemestres;
	}

	public void setQuantiaSemestre(int quantiaSemestre) {
		this.quantiaSemestres = quantiaSemestre;
	}

	public int getSemestreAtual() {
		return semestreAtual;
	}

	public void setSemestreAtual(int semestreAtual) {
		this.semestreAtual = semestreAtual;
	}
	
	
}
