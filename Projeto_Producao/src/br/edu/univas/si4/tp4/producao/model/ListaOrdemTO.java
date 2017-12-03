package br.edu.univas.si4.tp4.producao.model;

import java.util.Date;

public class ListaOrdemTO {
	
	private int numero;
	private String descricao;
	private Date data;
	private Boolean Situacao;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Boolean getSituacao() {
		return Situacao;
	}
	public void setSituacao(Boolean situacao) {
		Situacao = situacao;
	}
	
	
}
