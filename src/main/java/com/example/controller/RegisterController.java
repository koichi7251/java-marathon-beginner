package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "buygoods";
	}

	@RequestMapping("/result")
	public String result(Integer goods1, Integer goods2, Integer goods3) {
		Integer withoutTax = goods1 + goods2 + goods3;
		Integer includeTax = (int) (withoutTax * 1.08);
		application.setAttribute("withoutTax", withoutTax);
		application.setAttribute("includeTax", includeTax);
		return "totalprice";
	}
}
