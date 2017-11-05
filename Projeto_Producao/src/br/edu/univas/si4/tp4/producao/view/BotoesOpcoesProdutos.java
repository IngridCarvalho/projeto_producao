package br.edu.univas.si4.tp4.producao.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.univas.si4.tp4.producao.controller.ButtonsListenerOpcoesProdutos;

public class BotoesOpcoesProdutos extends JPanel{

	private static final long serialVersionUID = -7307145026614227892L;
	
	private JButton btCadastrar;
	private JButton btAlterar;
	private JButton btExcluir;
	
	private ArrayList<ButtonsListenerOpcoesProdutos> listenersOpcoes = new ArrayList<>();
	
	public BotoesOpcoesProdutos(){
		initialize();
	}
		
	public void initialize(){
		add(getBtCadastrar());
		add(getBtAlterar());
		add(getBtExcluir());
	}

	public JButton getBtCadastrar() {
		if(btCadastrar == null){
			btCadastrar = new JButton();
			btCadastrar.setText("Cadastrar");
			btCadastrar.setPreferredSize(new Dimension(100, 30));
			btCadastrar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cadastrarClicked();
				}
			});
		}
		return btCadastrar;
	}

	public JButton getBtAlterar() {
		if(btAlterar == null){
			btAlterar = new JButton();
			btAlterar.setText("Alterar");
			btAlterar.setPreferredSize(new Dimension(100, 30));
			btAlterar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					alterarClicked();
				}
			});
		}
		return btAlterar;
	}

	public JButton getBtExcluir() {
		if(btExcluir == null){
			btExcluir = new JButton();
			btExcluir.setText("Excluir");
			btExcluir.setPreferredSize(new Dimension(100, 30));
			btExcluir.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					excluirClicked();
					
				}
			});
		}
		return btExcluir;
	}
	
	public void addButtonsListenerProdutos(ButtonsListenerOpcoesProdutos listener){
		listenersOpcoes.add(listener);
		
	}
	
	private void cadastrarClicked(){
		for(ButtonsListenerOpcoesProdutos listener : listenersOpcoes){
			listener.cadastrarPerformed();
		}
	}
	
	private void alterarClicked(){
		for(ButtonsListenerOpcoesProdutos listener : listenersOpcoes){
			listener.alterarPerformed();
		}
	}
		
	private void excluirClicked(){
		for(ButtonsListenerOpcoesProdutos listener : listenersOpcoes){
			listener.excluirPerformed();
		}
	}
}
