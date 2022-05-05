package com.dio.santander.bankline.api.model;

public class Correntista {
	private Integer id;
	private String cpg;
	private String nome;
	
    private Conta conta;
    public Conta getConta() {
		return conta;
	}
    public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpg() {
		return cpg;
	}
	public void setCpg(String cpg) {
		this.cpg = cpg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
