package br.edu.univas.si4.tp4.producao.view.relatorios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerRelatorio;

public class FiltroRelatorioPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5839268089570649811L;

	private ArrayList<ButtonsListenerRelatorio> listenerGerar = new ArrayList<>();
	
	private JLabel NomePesquisaLabel;
	//private JTextField CampoPesquisaField;
	private JButton btGerarRelatorio;
	private String nome;
	
	public FiltroRelatorioPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getNomePesquisaLabel());
		//add(getCampoPesquisaField());
		add(getBtGerarRelatorio());	
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public JLabel getNomePesquisaLabel() {
		if(NomePesquisaLabel == null){
			NomePesquisaLabel = new JLabel();
			NomePesquisaLabel.setText("Relatório de Itens Produzidos");
		}
		return NomePesquisaLabel;
	}

	/*public JTextField getCampoPesquisaField() {
		if(CampoPesquisaField == null){
			CampoPesquisaField = new JTextField();
			CampoPesquisaField.setColumns(30);
		}
		return CampoPesquisaField;
	}*/

	private JButton getBtGerarRelatorio() {
		if(btGerarRelatorio == null){
			btGerarRelatorio = new JButton();
			btGerarRelatorio.setText("Gerar Relatório");
			btGerarRelatorio.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					gerarRelatorioClicked();
					
				}
			});
		}
		return btGerarRelatorio;
	}
	
	public void addButtonsListenerRelatorio(ButtonsListenerRelatorio listener){
		listenerGerar.add(listener);
	}
	
	public void gerarRelatorioClicked(){
		for(ButtonsListenerRelatorio listener : listenerGerar){
			listener.gerarRelatorio();
		}
			
	}
	
	
	
	
	
}
