package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.si4.tp4.producao.model.DBException;
import br.edu.univas.si4.tp4.producao.model.ItensOrdemTO;
import br.edu.univas.si4.tp4.producao.model.OrdemProducaoDAO;
import br.edu.univas.si4.tp4.producao.model.ListaOrdemTO;

public class ListaOrdemProducaoPanel extends JPanel{

	private static final long serialVersionUID = 3748329632832034881L;
	
	private JTable tabelaOrdemProducao;
	private JScrollPane tabelaOrdemProducaoScroll;
	private OrdemProducaoDAO ordemProducaoDAO = new OrdemProducaoDAO();
	
	public ListaOrdemProducaoPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getTabelaOrdemProducao());
		add(getTabelaOrdemProducaoScroll());
	}


	private JTable getTabelaOrdemProducao() {
		Vector<String> columnNames = new Vector<>();
		columnNames.add("Código");
		columnNames.add("Descrição");
		columnNames.add("Data");
		columnNames.add("Situação");
		
		if(tabelaOrdemProducao == null){
			
			tabelaOrdemProducao = new JTable(null, columnNames);
			tabelaOrdemProducao.setFillsViewportHeight(true);
			
			tabelaOrdemProducao = new JTable(null, columnNames);
			
			listaOrdens();

		}
		return tabelaOrdemProducao;
	}
	
	public void listaOrdens(){
		DefaultTableModel dtm = (DefaultTableModel) tabelaOrdemProducao.getModel();
		dtm.setRowCount(0);
		Object[] dados = new Object[4];
	    try{
	    	
	   	ArrayList<ListaOrdemTO> listaOrdens = ordemProducaoDAO.listaOrdens();
	   	
	    	for(ListaOrdemTO to : listaOrdens){
	    		String status;
	    	   	if(to.getSituacao() == true){
	    	   		status = "Pendente";
	    	   	} else{
	    	   		status = "Finalizado";
	    	   	}
				dados[0] = to.getNumero();
			    dados[1] = to.getDescricao();
			    dados[2] = to.getData();
			    dados[3] = status;
			    dtm.addRow(dados);
			}
		}catch(DBException e){
			System.out.println("Erro consultando área de pesquisa." + e);
			e.printStackTrace();
		}
	}

	private JScrollPane getTabelaOrdemProducaoScroll() {
		if(tabelaOrdemProducaoScroll == null){
			tabelaOrdemProducaoScroll = new JScrollPane(tabelaOrdemProducao);
			tabelaOrdemProducaoScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			tabelaOrdemProducaoScroll.setPreferredSize(new Dimension(620, 350));
		}
		return tabelaOrdemProducaoScroll;
	}
}
