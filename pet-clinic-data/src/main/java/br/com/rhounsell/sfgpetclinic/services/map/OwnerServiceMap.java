package br.com.rhounsell.sfgpetclinic.services.map;

import java.util.Set;

import br.com.rhounsell.sfgpetclinic.model.Owner;
import br.com.rhounsell.sfgpetclinic.services.base.PersonServiceBase;
import br.com.rhounsell.sfgpetclinic.services.map.base.MapServiceBase;

public class OwnerServiceMap extends MapServiceBase<Owner, Long> implements PersonServiceBase <Owner, Long>{

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findByLastName(String lastName) {
		return this.findByLastName(lastName);
	}
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
