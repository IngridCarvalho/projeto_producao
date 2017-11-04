package br.edu.univas.si4.tp4.producao.model;

public class Produtos {
	
	private int codigo;
	private String nome;
	private float qtd;
	
	public Produtos(int codigo, String nome, int qtd){
		this.codigo = codigo;
		this.nome = nome;
		this.qtd = qtd;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getQtd() {
		return qtd;
	}

	public void setQtd(float qtd) {
		this.qtd = qtd;
	}
	
	
}
