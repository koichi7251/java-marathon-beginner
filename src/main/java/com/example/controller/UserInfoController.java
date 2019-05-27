package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/user-info")
public class UserInfoController {
	@RequestMapping("")
	public String index() {
		return "input-user-info";
	}

	@RequestMapping("/output")
	public String output(UserForm form, Model model) {
		User user = new User();
		BeanUtils.copyProperties(form, user);
		model.addAttribute("user", user);
		return "output-user-info";
	}

}
