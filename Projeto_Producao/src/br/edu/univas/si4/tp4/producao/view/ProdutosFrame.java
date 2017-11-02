package br.edu.univas.si4.tp4.producao.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ProdutosFrame extends JFrame{

	private static final long serialVersionUID = 2393978203579456409L;
	private BuscaProdutos buscaProdutos;
	private ListaProdutos listaProdutos;
	private BotoesProdutos botoesProdutos;
	
	public ProdutosFrame(){
		super("Produtos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 600);
		setResizable(false);
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getBuscaProdutos(), BorderLayout.NORTH);
		add(getBotoesProdutos(), BorderLayout.PAGE_END);
		setVisible(true);
	}

	public BuscaProdutos getBuscaProdutos() {
		if(buscaProdutos == null){
			buscaProdutos = new BuscaProdutos();
		}
		return buscaProdutos;
	}
	
	public ListaProdutos getListaProdutos(){
		if(listaProdutos == null){
			listaProdutos = new ListaProdutos();
		}
		return listaProdutos;
	}

	public BotoesProdutos getBotoesProdutos() {
		if(botoesProdutos == null){
			botoesProdutos = new BotoesProdutos();
		}
		return botoesProdutos;
	}
}
