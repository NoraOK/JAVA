package com.noraokeeffe.dojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.noraokeeffe.dojosNinjas.models.Dojo;
import com.noraokeeffe.dojosNinjas.repositories.DojoRepo;

@Service
public class DojoService {
	private final DojoRepo dojoRepo;
	
	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Dojo getDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
			if(optionalDojo.isPresent()) {
				return optionalDojo.get();
			}else {
				return null;
			}
		
	}
}
