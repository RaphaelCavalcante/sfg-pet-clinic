package br.com.rhounsell.sfgpetclinic.services.base;

public interface PersonServiceBase <T> extends ServiceBase<T, Long>{
	T findByLastName(String lastName);
}
