package br.edu.univas.si4.tp4.producao.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.univas.si4.tp4.producao.controller.Controller;

public class BotoesProdutos extends JPanel{

	private static final long serialVersionUID = -7307145026614227892L;
	
	private JButton btCadastrar;
	private JButton btAlterar;
	private JButton btExcluir;
	private JButton btComposicao;
	
	public BotoesProdutos(){
		initialize();
	}
		
	public void initialize(){
		setLayout(new GridLayout(1, 4, 10, 10));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		add(getBtCadastrar());
		add(getBtAlterar());
		add(getBtExcluir());
		add(getBtComposicao());
	}

	public JButton getBtCadastrar() {
		if(btCadastrar == null){
			btCadastrar = new JButton();
			btCadastrar.setText("Cadastrar");
		}
		return btCadastrar;
	}

	public JButton getBtAlterar() {
		if(btAlterar == null){
			btAlterar = new JButton();
			btAlterar.setText("Alterar");
		}
		return btAlterar;
	}

	public JButton getBtExcluir() {
		if(btExcluir == null){
			btExcluir = new JButton();
			btExcluir.setText("Excluir");
		}
		return btExcluir;
	}

	public JButton getBtComposicao() {
		if(btComposicao == null){
			btComposicao = new JButton();
			btComposicao.setText("Composição");
		}
		return btComposicao;
	}
	
}
