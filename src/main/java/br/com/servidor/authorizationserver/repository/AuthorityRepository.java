package br.com.servidor.authorizationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.authorizationserver.model.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}