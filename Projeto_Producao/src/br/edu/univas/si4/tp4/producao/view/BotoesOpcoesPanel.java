package br.edu.univas.si4.tp4.producao.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;

public class BotoesOpcoesPanel extends JPanel{

	private static final long serialVersionUID = -7307145026614227892L;
	
	private JButton btIncluir;
	private JButton btAlterar;
	private JButton btExcluir;
	
	private ArrayList<ButtonsListenerOpcoesProdutos> listenersOpcoes = new ArrayList<>();
	
	public BotoesOpcoesPanel(){
		initialize();
	}
		
	public void initialize(){
		add(getBtCadastrar());
		add(getBtAlterar());
		add(getBtExcluir());
	}

	public JButton getBtCadastrar() {
		if(btIncluir == null){
			btIncluir = new JButton();
			btIncluir.setText("Incluir");
			btIncluir.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					incluirClicked();
				}
			});
		}
		return btIncluir;
	}

	public JButton getBtAlterar() {
		if(btAlterar == null){
			btAlterar = new JButton();
			btAlterar.setText("Alterar");
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
	
	private void incluirClicked(){
		for(ButtonsListenerOpcoesProdutos listener : listenersOpcoes){
			listener.incluirPerformed();
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
