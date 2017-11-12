package br.edu.univas.si4.tp4.producao.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.controller.Controller;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;

public class ProdutosFrame extends JFrame{

	private static final long serialVersionUID = 2393978203579456409L;
	
	private Controller controllerProdutos;
	
	private BuscaProdutosPanel buscaProdutos;
	private ListaProdutosPanel listaProdutos;
	private BotoesOpcoesPanel botoesProdutos;
	
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

	public BuscaProdutosPanel getBuscaProdutos() {
		if(buscaProdutos == null){
			buscaProdutos = new BuscaProdutosPanel();
			//TODO: implementar botao de busca
		}
		return buscaProdutos;
	}
	
	public ListaProdutosPanel getListaProdutos(){
		if(listaProdutos == null){
			listaProdutos = new ListaProdutosPanel();
		}
		return listaProdutos;
	}

	public BotoesOpcoesPanel getBotoesProdutos() {
		if(botoesProdutos == null){
			botoesProdutos = new BotoesOpcoesPanel();
			botoesProdutos.addButtonsListenerProdutos(new ButtonsListenerOpcoesProdutos() {
				
				@Override
				public void incluirPerformed() {
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
