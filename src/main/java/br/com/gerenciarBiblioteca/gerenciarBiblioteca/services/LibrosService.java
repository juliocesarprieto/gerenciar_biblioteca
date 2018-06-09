package br.com.gerenciarBiblioteca.gerenciarBiblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciarBiblioteca.gerenciarBiblioteca.models.Libros;
import br.com.gerenciarBiblioteca.gerenciarBiblioteca.repositories.LibrosRepository;

@RestController
@RequestMapping("/api/libros")
public class LibrosService {
	
	@Autowired
	private LibrosRepository librosRepository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody List<Libros> findAll(){
		
		List<Libros> libros = librosRepository.findAll();
		return libros;
	}

}
