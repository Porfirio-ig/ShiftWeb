package br.com.fiap.shiftweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/helloWeb")
public class HelloApiCotroller {

	@GetMapping("/hello")
	public String hello() {
		return "hello Api";
		
	}
	
	@GetMapping("hello2")
	public String hello2() {
		return "hello 2-Api";
	} 
}

