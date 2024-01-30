package com.safeway.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Empresa {

	@Id
    private String cnpj;
    private String nome;
    private double saldo;
    private double taxa;
	public void setCnpj(String cnpj2) {
	
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
    
}
