package br.edu.univas.si4.tp4.producao.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.si4.tp4.producao.controller.ButtonsListenerCadastro;

public class BotoesCadastro extends JPanel {
	
	private JButton btConfirmar;
	private JButton btCancelar;
	
	private ArrayList<ButtonsListenerCadastro> listeners = new ArrayList<>();
	
	public BotoesCadastro(){
		initialize();
	}
	
	public void initialize(){
		add(getBtConfirmar());
		add(getBtCancelar());
	}

	public JButton getBtConfirmar() {
			if(btConfirmar == null){
				btConfirmar = new JButton();
				btConfirmar.setText("Confirmar");
				btConfirmar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						confirmarClicked();
						
					}
				});
			}
			return btConfirmar;
		}
		public JButton getBtCancelar() {
			if(btCancelar == null){
				btCancelar = new JButton();
				btCancelar.setText("Cancelar");
				btCancelar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cancelarClicked();
					}
				});
			}
			return btCancelar;
		}
		
	public void addButtonsListener(ButtonsListenerCadastro listener){
			listeners.add(listener);
	}
	
	private void confirmarClicked(){
		for(ButtonsListenerCadastro listener : listeners){
			listener.confirmarPerfomed();
		}
	}
	
	private void cancelarClicked(){
		for(ButtonsListenerCadastro listener : listeners){
			listener.cancelarPerformed();
		}
	}
}
