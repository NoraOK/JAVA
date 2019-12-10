package com.noraokeeffe.dojosNinjas.services;

import org.springframework.stereotype.Service;

import com.noraokeeffe.dojosNinjas.models.Ninja;
import com.noraokeeffe.dojosNinjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	private final NinjaRepo ninjaRepo;
	
	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
}
