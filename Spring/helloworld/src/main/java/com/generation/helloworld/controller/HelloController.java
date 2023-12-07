package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<h1>Hello, World!</h1>" +
			       "<a href='http://localhost:8080/hello/bsm'><b>BSM</b></a>" +
			       "<br>" +
			       "<a href='http://localhost:8080/hello/objetivos'><b>Objetivos</b></a>";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "<ul>" +
		        "<li>Orientação ao futuro</li>" +
		        "<li>Mentalidade de Crescimento</li>" +
		        "<li>Persistência</li>" +
		        "<li>Responsabilidade Pessoal</li>" +
		        "<li>Comunicação</li>" +
		        "<li>Proatividade</li>" +
		        "<li>Orientação ao detalhe</li>" +
		        "<li>Trabalho em equipe</li>" +
		        "</ul>";
	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "<ul>" +
		        "<li>Dominar a estrutura básica do HTML</li>" +
		        "<li>Criar links e âncoras</li>" +
		        "<li>Formatar texto e conteúdo</li>" +
		        "</ul>";
	}
}
