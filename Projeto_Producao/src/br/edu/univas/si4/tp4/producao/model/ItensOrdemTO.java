package br.edu.univas.si4.tp4.producao.model;

public class ItensOrdemTO {
	private int codigo;
	private String nome;
	private int qtd;
	private float custo_unitario;
	private float custo_total;
	
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
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public float getCusto_unitario() {
		return custo_unitario;
	}
	public void setCusto_unitario(float custo_unitario) {
		this.custo_unitario = custo_unitario;
	}
	public float getCusto_total() {
		return custo_total;
	}
	public void setCusto_total(float custo_total) {
		this.custo_total = custo_total;
	}
	
	

}
