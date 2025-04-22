package dev.instituicao.CadastroAlunosCursos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity //Transforma toda essa classe em uma endidade do pacote.
@Table(name = "alunos")
@Getter
@Setter
@NoArgsConstructor // --> deixa a classe sem os parametros dentro do método construtor
@AllArgsConstructor // --> faz a sobrecarga com os parametros -> Fica invisivel, mas existe!
public class AlunoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //CRIA - SE UMA ESTRATÉGIA PARA A CONTAGEM DO ID SER COM NÚMERO INTEIROS
	private Long id; //NOVIDADE! lONG É  USADO PARA INT, PORÉM DE MANEIRA LONGA, MUITOS CADASTROS POR EX. A GENTE SÓ DECLARA, O JAVA INCREMENTA
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;

	@Column(name = "idade")
	private int idade;
	
	@Column(name = "semestre_atual")
	private int semestreAtual;
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private CursoModel curso;


}
