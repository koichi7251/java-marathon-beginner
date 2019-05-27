package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calc-value")
public class CalcValue {

	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "input-value";
	}

	@RequestMapping("/result")
	public String result(Integer num1, Integer num2) {
		Integer answer = num1 * num2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", answer);
		return "output-value";
	}
	
	
	
	@RequestMapping("/value1")
	public String value1() {
		return "output-value";
	}
	
	@RequestMapping("/value2")
	public String value2() {
		return "output-value2";
	}
}
