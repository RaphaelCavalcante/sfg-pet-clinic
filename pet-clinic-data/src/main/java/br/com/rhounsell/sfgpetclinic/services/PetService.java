package br.com.rhounsell.sfgpetclinic.services;

import java.util.Set;

import br.com.rhounsell.sfgpetclinic.model.Pet;

public interface PetService {
	Pet findById(Long id);
	Pet save(Pet owner);
	Set<Pet> findAll();
}
