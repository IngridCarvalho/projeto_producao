package br.edu.univas.si4.tp4.producao.view.produtos;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import br.edu.univas.si4.tp4.producao.view.BotoesOpcoesPanel;

public class ListaComponentesPanel extends JPanel{
	
	private JLabel componentesLabel;
	private JTable tabelaComponentes;
	private JScrollPane tabelaComponentesScrollPane; 
	private BotoesOpcoesPanel opcoesPanel;
	
	public ListaComponentesPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getComponentesLabel());
		add(getTabelaComponentes());
		add(getTabelaComponentesScrollPane());
		add(getOpcoesPanel(), BorderLayout.PAGE_END);
		
	}
	
	Object [] colunasProdutos = {"Código", "Nome", "Quantidade", "Custo"};
	
	Object [][] dados = {
			{4, "Farinha de trigo", 0.5, 3.5},
			{5, "Manteiga", 0.3, 3},
			{6, "Chocolate em pó", 0.2, 6}
			};
	
	private JLabel getComponentesLabel() {
		if(componentesLabel == null){
			componentesLabel = new JLabel();
			componentesLabel.setText("Componentes do Produto:");
		}
		return componentesLabel;
	}

	private JTable getTabelaComponentes() {
		if(tabelaComponentes == null){
			tabelaComponentes = new JTable(dados, colunasProdutos);
		}
		return tabelaComponentes;
	}

	private JScrollPane getTabelaComponentesScrollPane() {
		if(tabelaComponentesScrollPane == null){
			tabelaComponentesScrollPane = new JScrollPane(tabelaComponentes);
			tabelaComponentesScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			tabelaComponentesScrollPane.setPreferredSize(new Dimension(550, 250));
		}
		return tabelaComponentesScrollPane;
	}

	private BotoesOpcoesPanel getOpcoesPanel() {
		if(opcoesPanel == null){
			opcoesPanel = new BotoesOpcoesPanel();
			//TODO: IMPLEMENTAR BOTOES
		}
		return opcoesPanel;
	}

}
