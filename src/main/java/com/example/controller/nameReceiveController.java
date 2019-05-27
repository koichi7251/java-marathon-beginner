package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/input")
public class nameReceiveController {

	@RequestMapping("")
	public String index() {
		return "result";
	}

	@RequestMapping("/result")
	public String result() {
		return "output-name";
	}
}
