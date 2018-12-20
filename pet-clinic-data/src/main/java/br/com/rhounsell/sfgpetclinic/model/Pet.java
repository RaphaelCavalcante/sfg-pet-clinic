package br.com.rhounsell.sfgpetclinic.model;

import java.time.LocalDate;

import br.com.rhounsell.sfgpetclinic.model.base.BaseModel;

public class Pet extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
