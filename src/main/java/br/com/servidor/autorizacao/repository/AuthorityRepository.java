package br.com.servidor.autorizacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.servidor.autorizacao.domain.Authorities;
import br.com.servidor.autorizacao.model.Authority;


public interface AuthorityRepository extends JpaRepository<Authorities, String>{
	
	Authority findByName(String name);
	
}