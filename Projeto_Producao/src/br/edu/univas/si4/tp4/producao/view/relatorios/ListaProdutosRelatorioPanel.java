package br.edu.univas.si4.tp4.producao.view.relatorios;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Date;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.si4.tp4.producao.model.ItensOrdemTO;
import br.edu.univas.si4.tp4.producao.model.ProdutoDAO;
import br.edu.univas.si4.tp4.producao.model.DBException;

public class ListaProdutosRelatorioPanel extends JPanel{
	
	private static final long serialVersionUID = -409659743202470855L;
	
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
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

	public JTable getTabelaProdutos(){
		Vector<String> columnNames = new Vector<>();
		columnNames.add("Código");
		columnNames.add("Nome");
		columnNames.add("Quantidade");
		columnNames.add("Custo");
		columnNames.add("Custo Total");
		
		if(tabelaProdutos == null){
			
			tabelaProdutos = new JTable(null, columnNames);
			tabelaProdutos.setFillsViewportHeight(true);
			
			listaProdutosFiltro();
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

	
	
	public void listaProdutosFiltro(){	
		
		DefaultTableModel dtm = (DefaultTableModel) tabelaProdutos.getModel();
		dtm.setRowCount(0);
		Object[] dados = new Object[5];
	    try{
	    	
	   	ArrayList<ItensOrdemTO> listaProdutos = produtoDAO.relatorioProdutos();
	    	for(ItensOrdemTO to : listaProdutos){
				dados[0] = to.getCodigo();
			    dados[1] = to.getNome();
			    dados[2] = to.getQtd();
			    dados[3] = to.getCusto_unitario();
			    dados[4] = to.getCusto_total();
			    dtm.addRow(dados);
			}
		}catch(DBException e){
			System.out.println("Erro consultando área de pesquisa.");
			e.printStackTrace();
		}
	}
}
