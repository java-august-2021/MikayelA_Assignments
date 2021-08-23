package com.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloHuman {
	@RequestMapping ("/")
	public String index(@RequestParam(value="fName", required=false, defaultValue="Human") String name, Model model) {

		model.addAttribute("fName", name);
//		viewModel.addAttribute("fName", name);
		return "index.jsp";

	}
}
