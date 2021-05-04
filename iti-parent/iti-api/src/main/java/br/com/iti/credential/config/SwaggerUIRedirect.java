package br.com.iti.credential.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerUIRedirect {
	
	@RequestMapping(value = "/")
	public String index() {
		return "redirect:swagger-ui.html";
	}

}
