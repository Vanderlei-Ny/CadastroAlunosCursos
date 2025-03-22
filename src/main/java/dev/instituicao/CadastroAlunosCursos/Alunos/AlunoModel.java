package dev.instituicao.CadastroAlunosCursos.Alunos;

import dev.instituicao.CadastroAlunosCursos.Cursos.CursoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity //transformo toda essa classe em uma endidade do pacote.
@Table(name = "Tabela_de_alunos")
public class AlunoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //CRIA - SE UMA ESTRATÉGIA PARA A CONTAGEM DO ID SER COM NÚMERO INTEIROS
	private Long id; //NOVIDADE! lONG É  USADO PARA INT, PORÉM DE MANEIRA LONGA, MUITOS CADASTROS POR EX. A GENTE SÓ DECLARA, O JAVA INCREMENTA
	private String nome;
	private String email;
	private int idade;
	private int semestreAtual;
	
	@ManyToOne // --> um aluno para um curso
	@JoinColumn(name = "Cursos_id")
	private CursoModel cursos;
	
	public AlunoModel() {
		
	}
	
	public AlunoModel(String nome, String email, int idade, int semestreAtual) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.semestreAtual = semestreAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSemestreAtual() {
		return semestreAtual;
	}

	public void setSemestreAtual(int semestreAtual) {
		this.semestreAtual = semestreAtual;
	}
	
	
	

}
