package com.maboglia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BibliotecaController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/libro")
	public String titolo(@RequestParam("titolo") String titolo, Model model) {
		model.addAttribute("titolo", titolo);
		return "libro";
	}
	
	
}
