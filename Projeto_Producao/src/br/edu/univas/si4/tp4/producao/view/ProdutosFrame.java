package br.edu.univas.si4.tp4.producao.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.controller.ButtonsListenerOpcoesProdutos;
import br.edu.univas.si4.tp4.producao.controller.Controller;

public class ProdutosFrame extends JFrame{

	private static final long serialVersionUID = 2393978203579456409L;
	
	private Controller controllerProdutos;
	
	private BuscaProdutos buscaProdutos;
	private ListaProdutos listaProdutos;
	private BotoesOpcoesProdutos botoesProdutos;
	
	public ProdutosFrame(Controller controller){
		super("Produtos");
		controllerProdutos = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 500);
		setResizable(false);
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getBuscaProdutos(), BorderLayout.NORTH);
		add(getListaProdutos(), BorderLayout.CENTER);
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

	public BotoesOpcoesProdutos getBotoesProdutos() {
		if(botoesProdutos == null){
			botoesProdutos = new BotoesOpcoesProdutos();
			botoesProdutos.addButtonsListenerProdutos(new ButtonsListenerOpcoesProdutos() {
				
				@Override
				public void cadastrarPerformed() {
					cadastrarClicked();
					
				}
				@Override
				public void alterarPerformed() {
					alterarClicked();
					
				}
				
				@Override
				public void excluirPerformed() {
					excluirClicked();
					
				}
			});
		}
		return botoesProdutos;
	}
	
	public void cadastrarClicked(){
		controllerProdutos.cadastrarProdutos();
	}
	
	public void alterarClicked(){
		JOptionPane.showMessageDialog(this, "Alterar");
	}
	public void excluirClicked(){
		JOptionPane.showMessageDialog(this, "Excluido com Sucesso");
	}
}
