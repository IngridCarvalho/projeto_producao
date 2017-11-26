package br.edu.univas.si4.tp4.producao.view.relatorios;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class ListaProdutosRelatorioPanel extends JPanel{
	
	private static final long serialVersionUID = -409659743202470855L;
	
	private JTable tabelaProdutos;
	private JScrollPane listaProdutosScrollPane;
	
	public ListaProdutosRelatorioPanel(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new FlowLayout());
		add(getTabelaProdutos());
		add(getListaProdutosScrollPane());
	}
	
	Object [] colunasProdutos = {"Código", "Nome", "Quantidade Produzida", "Custo Unitário", "Total Custo"};
	
	Object [][] dados = {
			{1, "bolo de chocolate", 10, 5.0, 50.0}
			};
	
	
	public JTable getTabelaProdutos() {
		if(tabelaProdutos == null){
			tabelaProdutos = new JTable(dados, colunasProdutos);
		}
		return tabelaProdutos;
	}

	public JScrollPane getListaProdutosScrollPane() {
		if(listaProdutosScrollPane == null){
			listaProdutosScrollPane = new JScrollPane(tabelaProdutos);
			listaProdutosScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			listaProdutosScrollPane.setPreferredSize(new Dimension(670, 400));
			
		}
		return listaProdutosScrollPane;
	}

}
