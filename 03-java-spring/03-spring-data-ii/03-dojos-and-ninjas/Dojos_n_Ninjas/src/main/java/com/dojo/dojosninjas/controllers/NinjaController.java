package com.dojo.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dojo.dojosninjas.models.Dojos;
import com.dojo.dojosninjas.models.Ninjas;
import com.dojo.dojosninjas.sevices.Services;

@Controller
@RequestMapping("/ninjas")

public class NinjaController {
	@Autowired
	private Services serv;
	
	@GetMapping("/new")
	public String newNinja (@ModelAttribute ("ninja") Ninjas ninjas, Model viewModel) {
		List<Dojos> allDojos = this.serv.allDojos();
		viewModel.addAttribute("allDojos", allDojos);
		return "ninja.jsp";
	}
	
	@PostMapping ("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninjas ninjas, Model viewModel, BindingResult result) {
		if (result.hasErrors()) {
			List<Dojos> allDojos = this.serv.allDojos();
			viewModel.addAttribute("allDojos", allDojos);
			return "ninja.jsp";
		}
		
		this.serv.createNinja(ninjas);
		return "redirect:/dojo/" + ninjas.getDojo().getId();
	}
}
