package com.spring.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoController {
	

	@RequestMapping ("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping ("/result")
	public String result(@RequestParam("name") String userName, 
			@RequestParam("location") String pointLocation,
			@RequestParam("language") String favLanguage,
			@RequestParam("comment") String someComment,
			Model viewModel) {
		viewModel.addAttribute("name", userName);
		viewModel.addAttribute("location", pointLocation);
		viewModel.addAttribute("language", favLanguage);
		viewModel.addAttribute("comment", someComment);
		return "result.jsp";

	}
}
