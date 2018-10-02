package com.german.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value="/")
public class FormularioController {

	@GetMapping
	public String initUserForm() {
		return "form";
	}

}
