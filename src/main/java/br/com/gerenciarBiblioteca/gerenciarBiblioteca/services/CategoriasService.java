package br.com.gerenciarBiblioteca.gerenciarBiblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciarBiblioteca.gerenciarBiblioteca.models.Categorias;
import br.com.gerenciarBiblioteca.gerenciarBiblioteca.repositories.CategoriasRepository;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasService {
	
	@Autowired
	private CategoriasRepository categoriasRepository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody List<Categorias> findAll(){
		
		List<Categorias> categorias = categoriasRepository.findAll();		
		return categorias;
	}

}
