package br.edu.univas.si4.tp4.producao.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListaProdutos extends JPanel{
	
	private static final long serialVersionUID = -4605241641736507551L;
	
	private JTable tabelaProdutos;
	private JScrollPane listaProdutosScrollPane;
	
	public ListaProdutos(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new FlowLayout());
		add(getTabelaProdutos());
		add(getListaProdutosScrollPane());
	}
	
	Object [] colunasProdutos = {"Código", "Nome", "Quantidade"};
	
	Object [][] dados = {
			{1, "Pão", 10}
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
			listaProdutosScrollPane.setPreferredSize(new Dimension(670, 450));
			
		}
		return listaProdutosScrollPane;
	}

	
}
