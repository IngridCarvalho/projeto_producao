package br.edu.univas.si4.tp4.producao.view;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class ListaOrdemProducaoPanel extends JPanel{

	private static final long serialVersionUID = 3748329632832034881L;
	
	private JTable tabelaOrdemProducao;
	private JScrollPane tabelaOrdemProducaoScroll;
	
	public ListaOrdemProducaoPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getTabelaOrdemProducao());
		add(getTabelaOrdemProducaoScroll());
	}
	
	Object [] colunasProdutos = {"Código", "Descrição", "Data", "Situação"};
	
	Object [][] dados = {
			{3, "Produção semana 1", "10/11/2017", "Pendente"}
			};

	private JTable getTabelaOrdemProducao() {
		if(tabelaOrdemProducao == null){
			tabelaOrdemProducao = new JTable(dados, colunasProdutos);
		}
		return tabelaOrdemProducao;
	}

	private JScrollPane getTabelaOrdemProducaoScroll() {
		if(tabelaOrdemProducaoScroll == null){
			tabelaOrdemProducaoScroll = new JScrollPane(tabelaOrdemProducao);
			tabelaOrdemProducaoScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			tabelaOrdemProducaoScroll.setPreferredSize(new Dimension(550, 250));
		}
		return tabelaOrdemProducaoScroll;
	}
}
