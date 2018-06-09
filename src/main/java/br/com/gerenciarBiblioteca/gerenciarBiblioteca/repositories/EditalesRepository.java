package br.com.gerenciarBiblioteca.gerenciarBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gerenciarBiblioteca.gerenciarBiblioteca.models.Editales;

@Repository
public interface EditalesRepository extends JpaRepository<Editales, Integer> {

}
