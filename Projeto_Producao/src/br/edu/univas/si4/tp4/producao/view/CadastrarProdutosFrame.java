package br.edu.univas.si4.tp4.producao.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.controller.ButtonsListenerCadastro;

public class CadastrarProdutosFrame extends JFrame{

	private static final long serialVersionUID = -7209682915698445748L;
	
	private CadastrarProdutos cadastroProdutos;
	private BotoesCadastro botoesCadastro;
	
	public CadastrarProdutosFrame(){
		super("Cadastro de Produto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 500);
		setResizable(false);
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getCadastroProdutos(), BorderLayout.NORTH);
		add(getBotoesCadastro(), BorderLayout.PAGE_END);
	}

	private CadastrarProdutos getCadastroProdutos() {
		if(cadastroProdutos == null){
			cadastroProdutos = new CadastrarProdutos();
		}
		return cadastroProdutos;
	}

	private BotoesCadastro getBotoesCadastro() {
		if(botoesCadastro == null){
			botoesCadastro = new BotoesCadastro();
			botoesCadastro.addButtonsListener(new ButtonsListenerCadastro() {
				
				@Override
				public void confirmarPerfomed() {
					confirmarClicked();
					
				}
				
				@Override
				public void cancelarPerformed() {
					cancelarClicked();
					
				}
			});
		}
		return botoesCadastro;
	}
	
	public void confirmarClicked(){
		JOptionPane.showMessageDialog(this, "Salvo com sucesso");
	}
	
	public void cancelarClicked(){
		System.exit(0);
	}

}
