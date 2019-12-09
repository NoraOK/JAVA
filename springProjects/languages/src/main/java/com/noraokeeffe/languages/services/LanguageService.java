package com.noraokeeffe.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.noraokeeffe.languages.models.Language;
import com.noraokeeffe.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private final LanguageRepository langRepo;
	
	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	public List<Language> allLangs(){
		return langRepo.findAll();
	}
	public Language createLang(Language lang) {
		return langRepo.save(lang);
	}
	public Language updateLange(Language lang) {
		return langRepo.save(lang);
	}
	public Language findLang(Long id) {
		Optional<Language> optionalLang = langRepo.findById(id);
		if(optionalLang.isPresent()) {
			return optionalLang.get();
		}else {
			return null;
		}
	}
	public Language updateLang(Long id, String name, String creator, String currVer) {
		Language langRepo = findLang(id);
		langRepo.setName(name);
		langRepo.setCreator(creator);
		langRepo.setCurrentVersion(currVer);
		return langRepo;
	}
	public void deleteLang(Long id) {
		Language lang = findLang(id);
		langRepo.delete(lang);
	}

}
