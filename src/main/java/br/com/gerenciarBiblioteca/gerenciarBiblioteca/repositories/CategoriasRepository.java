package br.com.gerenciarBiblioteca.gerenciarBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gerenciarBiblioteca.gerenciarBiblioteca.models.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer>{

}
