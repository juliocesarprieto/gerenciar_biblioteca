package br.com.gerenciarBiblioteca.gerenciarBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gerenciarBiblioteca.gerenciarBiblioteca.models.Comentarios;

@Repository
public interface ComentariosRepository extends JpaRepository<Comentarios, Integer>{

}
