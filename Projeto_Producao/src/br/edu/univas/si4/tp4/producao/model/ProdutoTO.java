package br.edu.univas.si4.tp4.producao.model;

public class ProdutoTO {
	
	private int codigo;
	private String nome;
	private float qtd;
	private float preco_custo;
	private float preco_venda;
	private int tipo_produto;
	
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
	public float getPreco_custo() {
		return preco_custo;
	}
	public void setPreco_custo(float preco_custo) {
		this.preco_custo = preco_custo;
	}
	public float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public int getTipo_produto() {
		return tipo_produto;
	}
	public void setTipo_produto(int tipo_produto) {
		this.tipo_produto = tipo_produto;
	}
	
	
	
	
	

}
