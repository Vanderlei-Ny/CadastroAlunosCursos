package dev.instituicao.CadastroAlunosCursos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping //rotas para um determinado destino
@RestController //diz ao sistema que esse é o controlador
public class Controller {

	int Calculando;
	
	@GetMapping("/abrobinha") //Puxa as informações
	public String boasVindas() {
		return "Hello SpringBoot!";
	}
	
	

}
