package com.dojo.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dojo.languages.models.Language;
import com.dojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRep;
	
	public LanguageService(LanguageRepository rep) {
		this.langRep = rep;
	}
	public List<Language> allLanguages(){
		return this.langRep.findAll();
	}
	public Language findLanguage(Long id) {
		return this.langRep.findById(id).orElse(null);
	}
	public Language createLanguage(Language nLang) {
		return this.langRep.save(nLang);
	}
	public Language updateLanguage(Language uLang) {
		return this.langRep.save(uLang);
	}
	public void deleteLanguage(Long id) {
		this.langRep.deleteById(id);
	}
}
