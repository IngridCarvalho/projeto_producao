package br.edu.univas.si4.tp4.producao.controller;

import br.edu.univas.si4.tp4.producao.view.MainFrame;
import br.edu.univas.si4.tp4.producao.view.ProdutosFrame;
import br.edu.univas.si4.tp4.producao.view.CadastrarProdutos;
import br.edu.univas.si4.tp4.producao.view.CadastrarProdutosFrame;

public class Controller {
	
	private MainFrame mainFrame;
	private ProdutosFrame produtosFrame;
	private CadastrarProdutosFrame cadastrarProdutos;

	public Controller(){
		mainFrame = new MainFrame(this);
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

}
