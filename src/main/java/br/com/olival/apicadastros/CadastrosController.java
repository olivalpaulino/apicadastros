package br.com.olival.apicadastros;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastrosController {

	@GetMapping("/")
	public String cadastros() {
		return "teste de cadastro";
	}
	
}
