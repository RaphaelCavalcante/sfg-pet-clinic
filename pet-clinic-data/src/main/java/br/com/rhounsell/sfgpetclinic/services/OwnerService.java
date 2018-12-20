package br.com.rhounsell.sfgpetclinic.services;

import java.util.Set;

import br.com.rhounsell.sfgpetclinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
