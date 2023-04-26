package br.com.olival.apicadastros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastrosController {

	@GetMapping("/teste")
	public String cadastros() {
		return "teste de cadastro";
	}
	
}
