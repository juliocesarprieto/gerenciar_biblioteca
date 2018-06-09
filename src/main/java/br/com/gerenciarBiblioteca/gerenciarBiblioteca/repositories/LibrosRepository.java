package br.com.gerenciarBiblioteca.gerenciarBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gerenciarBiblioteca.gerenciarBiblioteca.models.Libros;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer>{
	
	
}
