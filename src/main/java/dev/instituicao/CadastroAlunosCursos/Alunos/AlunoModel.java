package dev.instituicao.CadastroAlunosCursos.Alunos;

import dev.instituicao.CadastroAlunosCursos.Cursos.CursoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Transforma toda essa classe em uma endidade do pacote.
@Table(name = "Tabela_de_alunos")
@Data // --> cria os Getters e Setters
@NoArgsConstructor // --> deixa a classe sem os parametros dentro do método construtor
@AllArgsConstructor // --> faz a sobrecarga com os parametros -> Fica invisivel, mas existe!
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

}
