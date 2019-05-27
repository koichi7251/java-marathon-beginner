package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/input")
public class nameReceiveController {

	@RequestMapping("")
	public String index() {
		return "input-name";
	}

	@RequestMapping("/result")
	public String result(String name, Model model) {
		model.addAttribute("name", name);
		return "output-name";
	}
}
