package br.edu.univas.si4.tp4.producao.controller;

import br.edu.univas.si4.tp4.producao.view.MainFrame;
import br.edu.univas.si4.tp4.producao.view.ProdutosFrame;

public class Controller {
	
	private MainFrame mainFrame;
	private ProdutosFrame produtosFrame;
	
	public Controller(){
		mainFrame = new MainFrame(this);
	}
	
	public void initialize(){
		mainFrame.setVisible(true);
	}
	
	public void Produtos(){
		produtosFrame = new ProdutosFrame();
	}
	
}
