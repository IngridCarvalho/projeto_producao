package br.edu.univas.si4.tp4.producao.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si4.tp4.producao.controller.Controller;

public class IncluirOrdemProducaoFrame extends JFrame{
	
	private static final long serialVersionUID = -656793209816442646L;

	private Controller controller;
	
	private BuscarProdutosOrdemProducaoPanel buscaProdutos;
	private ListaProdutosProducaoPanel listaProdutos;
	
	public IncluirOrdemProducaoFrame(Controller controller){
		super("Incluir Ordem de Produção");
		this.controller = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 500);
		setResizable(false);
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getBuscaProdutos(), BorderLayout.NORTH);
		add(getListaProdutos(), BorderLayout.CENTER);
	}

	private BuscarProdutosOrdemProducaoPanel getBuscaProdutos() {
		if(buscaProdutos == null){
			buscaProdutos = new BuscarProdutosOrdemProducaoPanel();
		}
		return buscaProdutos;
	}

	private ListaProdutosProducaoPanel getListaProdutos() {
		if(listaProdutos == null){
			listaProdutos = new ListaProdutosProducaoPanel();
		}
		return listaProdutos;
	}
	
	//TODO: IMPLEMENTAR BOTOES DE GRAVAÇÃO
}
