package br.com.rhounsell.sfgpetclinic.services.base;

@SuppressWarnings("hiding")
public interface PersonServiceBase <T, Long> extends ServiceBase<T, Long>{
	T findByLastName(String lastName);
}
