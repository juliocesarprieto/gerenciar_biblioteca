package br.com.gerenciarBiblioteca.gerenciarBiblioteca.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table( name = "autor")
public class Autor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer idAutor;
	private String nomeAutor;
	
	public Autor() {}

	public Autor(Integer idAutor, String nomeAutor) {
		super();
		this.idAutor = idAutor;
		this.nomeAutor = nomeAutor;
	}

	//Getters and Setters
	public Integer getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
}
