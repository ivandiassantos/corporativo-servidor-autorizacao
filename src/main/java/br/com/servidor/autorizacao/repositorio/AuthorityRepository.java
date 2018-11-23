package br.com.servidor.autorizacao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.servidor.autorizacao.modelo.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}