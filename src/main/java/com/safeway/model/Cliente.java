package com.safeway.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Cliente {

	@Id
    private String cpf;
    private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
