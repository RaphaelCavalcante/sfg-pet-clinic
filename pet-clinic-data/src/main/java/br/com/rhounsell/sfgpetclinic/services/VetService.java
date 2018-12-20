package br.com.rhounsell.sfgpetclinic.services;

import java.util.Set;

import br.com.rhounsell.sfgpetclinic.model.Vet;

public interface VetService {
	Vet findByLastName(String lastName);
	Vet findById(Long id);
	Vet save(Vet owner);
	Set<Vet> findAll();
}
