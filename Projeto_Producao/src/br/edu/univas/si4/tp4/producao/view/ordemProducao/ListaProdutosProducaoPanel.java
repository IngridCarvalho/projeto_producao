package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;


public class ListaProdutosProducaoPanel extends JPanel{

	private static final long serialVersionUID = -3809676872906480997L;
	
	private JTable tabelaProdutosProducao;
	private JScrollPane tabelaProdutosProducaoScroll;
	
	public ListaProdutosProducaoPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getTabelaProdutosProducao());
		add(getTabelaProdutosProducaoScroll());
	}
	
	Object [] colunasProdutos = {"Código", "Nome", "Quantidade", "Custo", "Total"};
	
	Object [][] dados = {
			
			};


	private JTable getTabelaProdutosProducao() {
		if(tabelaProdutosProducao == null){
			tabelaProdutosProducao = new JTable(dados, colunasProdutos);
		}
		return tabelaProdutosProducao;
	}

	private JScrollPane getTabelaProdutosProducaoScroll() {
		if(tabelaProdutosProducaoScroll == null){
			tabelaProdutosProducaoScroll = new JScrollPane(tabelaProdutosProducao);
			tabelaProdutosProducaoScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			tabelaProdutosProducaoScroll.setPreferredSize(new Dimension(670, 150));
		}
		return tabelaProdutosProducaoScroll;
	}

}
