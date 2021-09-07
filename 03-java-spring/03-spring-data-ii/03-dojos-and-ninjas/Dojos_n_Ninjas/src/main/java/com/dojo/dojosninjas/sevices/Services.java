package com.dojo.dojosninjas.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.dojosninjas.models.Dojos;
import com.dojo.dojosninjas.models.Ninjas;
import com.dojo.dojosninjas.repositories.DojoRepository;
import com.dojo.dojosninjas.repositories.NinjaRepository;

@Service
public class Services {
	@Autowired
	private NinjaRepository ninjaRepository;
	@Autowired
	private DojoRepository dojoRepository;

	public List<Dojos> allDojos() {
		return this.dojoRepository.findAll();
	}
	
	public Dojos createDojo(Dojos dojo) {
		return this.dojoRepository.save(dojo);
	}
	
	public Ninjas createNinja(Ninjas ninja) {
		return this.ninjaRepository.save(ninja);
	}
	
	public Dojos getDojo (Long id) {
		return this.dojoRepository.findById(id).orElse(null);
	}
}
