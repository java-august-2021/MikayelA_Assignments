package com.dojo.dojosninjas.controllers;

import javax.validation.Valid;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dojo.dojosninjas.models.Dojos;
import com.dojo.dojosninjas.sevices.Services;

@RequestMapping("/dojo")
@Controller
public class DojoController {
	@Autowired
	private Services serv;
	
	@GetMapping("/new")
	public String createDojo (@ModelAttribute("dojo") Dojos dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping ("/createDojo")
	public String createD(@Valid @ModelAttribute("dojo") Dojos dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "dojo.jsp";
		}
		this.serv.createDojo(dojo);
		return "redirect:/ninja/new";
	}
	
	@GetMapping("/{id}")
	public String showDojo (Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("dojo", this.serv.getDojo(id));
		return "details.jsp";
	}
}
