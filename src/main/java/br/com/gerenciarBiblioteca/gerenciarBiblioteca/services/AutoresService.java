package br.com.gerenciarBiblioteca.gerenciarBiblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciarBiblioteca.gerenciarBiblioteca.models.Autores;
import br.com.gerenciarBiblioteca.gerenciarBiblioteca.repositories.AutorRepository;

@RestController
@RequestMapping("/api/autores")
public class AutoresService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	
	@GetMapping(produces = "application/json")
	public @ResponseBody List<Autores> findAll(){
		
		List<Autores> autores = autorRepository.findAll();
		
		return autores;
	}

}
