package com.noraokeeffe.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.noraokeeffe.relationships.models.Person;
import com.noraokeeffe.relationships.repositories.PersonRepo;


@Service
public class PersonService {
	private final PersonRepo personRepo;
	
	public PersonService(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}
	
	public Person createPerson(Person person) {
		return personRepo.save(person);
	}
    public Person findPerson(Long id) {
        Optional<Person> optionalPerson = personRepo.findById(id);
        if(optionalPerson.isPresent()) {
            return optionalPerson.get();
        } else {
            return null;
        }
    }
////READS all persons//////////////////////////////////////////////////////////////////
    public List<Person> allPersons() {
        return personRepo.findAll();
    }
}
