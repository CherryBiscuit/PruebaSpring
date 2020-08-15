package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/getQuote")
public class MyDemoController {

	//El metodo randomquote va a responder a los requests que lleguen a getQuote.html 
	//http://localhost:8080/springMVC/getQuote.html
	//no le pongo el html, porque ya le indique en el web.xml que iba a responder a requests .html en el servlet mapping
	@RequestMapping(method = RequestMethod.GET)
	public String getRandomQuote(ModelMap model) {
		
		//todos los atributos del modelo, van a poder ser accedidos desde la vista. Es decir, envío el modelo a la vista
		//y con "${atributo}" van a poder acceder a estos atributos 
		//model.addAttribute("randomQuote","To be or not to be");
		String quote="To be or not to be";
		model.addAttribute("randomQuotes", quote);
		
		//el return sirve para luego, elegir la vista a donde se van a enviar los resultados
		return "quote";
	}
	
}
