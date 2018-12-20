package br.com.rhounsell.sfgpetclinic.services.base;

import java.util.Set;

public interface ServiceBase <T>{
	T findById(Long id);
	T save(T owner);
	Set<T> findAll();
}
