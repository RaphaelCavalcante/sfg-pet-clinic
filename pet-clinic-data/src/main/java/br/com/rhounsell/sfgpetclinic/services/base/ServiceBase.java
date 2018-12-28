package br.com.rhounsell.sfgpetclinic.services.base;

import java.util.Set;

public interface ServiceBase <T, ID>{
	T findById(ID id);
	T save(T owner);
	Set<T> findAll();
}
