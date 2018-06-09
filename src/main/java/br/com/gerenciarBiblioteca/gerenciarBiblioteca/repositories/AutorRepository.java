package br.com.gerenciarBiblioteca.gerenciarBiblioteca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gerenciarBiblioteca.gerenciarBiblioteca.models.Autores;

@Repository
public interface AutorRepository extends JpaRepository<Autores, Integer>{
	
	List<Autores> findAll();

}
