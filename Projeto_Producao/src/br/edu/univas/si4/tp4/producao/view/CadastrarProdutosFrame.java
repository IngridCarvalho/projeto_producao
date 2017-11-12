package br.edu.univas.si4.tp4.producao.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerCadastro;

public class CadastrarProdutosFrame extends JFrame{

	private static final long serialVersionUID = -7209682915698445748L;
	
	private CadastrarProdutosPanel cadastroProdutos;
	private ListaComponentesPanel listaComponentes;
	private BotoesCadastroPanel botoesCadastro;
	
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
		add(getListaComponentes(), BorderLayout.CENTER);
		add(getBotoesCadastro(), BorderLayout.PAGE_END);
	}

	private CadastrarProdutosPanel getCadastroProdutos() {
		if(cadastroProdutos == null){
			cadastroProdutos = new CadastrarProdutosPanel();
		}
		return cadastroProdutos;
	}

	private ListaComponentesPanel getListaComponentes() {
		if(listaComponentes == null){
			listaComponentes = new ListaComponentesPanel();
		}
		return listaComponentes;
	}

	private BotoesCadastroPanel getBotoesCadastro() {
		if(botoesCadastro == null){
			botoesCadastro = new BotoesCadastroPanel();
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
