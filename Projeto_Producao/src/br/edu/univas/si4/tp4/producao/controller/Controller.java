package br.edu.univas.si4.tp4.producao.controller;

import br.edu.univas.si4.tp4.producao.view.TelaPrincipalFrame;
import br.edu.univas.si4.tp4.producao.view.ordemProducao.IncluirOrdemProducaoFrame;
import br.edu.univas.si4.tp4.producao.view.ordemProducao.OrdemProducaoFrame;
import br.edu.univas.si4.tp4.producao.view.produtos.CadastrarProdutosFrame;
import br.edu.univas.si4.tp4.producao.view.produtos.CadastrarProdutosPanel;
import br.edu.univas.si4.tp4.producao.view.produtos.ProdutosFrame;

public class Controller {
	
	private TelaPrincipalFrame mainFrame;
	private ProdutosFrame produtosFrame;
	private CadastrarProdutosFrame cadastrarProdutos;
	private OrdemProducaoFrame ordemProducaoFrame;
	private IncluirOrdemProducaoFrame incluirOrdemProducao;

	public Controller(){
		mainFrame = new TelaPrincipalFrame(this);
	}
	
	public void initialize(){
		mainFrame.setVisible(true);
	}
	
	public void Produtos(){
		produtosFrame = new ProdutosFrame(this);
	}

	public void cadastrarProdutos() {
		cadastrarProdutos = new CadastrarProdutosFrame();
		cadastrarProdutos.setVisible(true);
	}

	public void OrdemProducao() {
		ordemProducaoFrame = new OrdemProducaoFrame(this);
		ordemProducaoFrame.setVisible(true);
	}
	
	public void IncluirOrdemProducao(){
		incluirOrdemProducao = new IncluirOrdemProducaoFrame(this);
		incluirOrdemProducao.setVisible(true);
	}

}
