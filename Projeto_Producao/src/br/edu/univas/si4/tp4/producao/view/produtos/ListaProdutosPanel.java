package br.edu.univas.si4.tp4.producao.view.produtos;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.si4.tp4.producao.model.ProdutoDAO;
import br.edu.univas.si4.tp4.producao.model.ProdutoException;
import br.edu.univas.si4.tp4.producao.model.ProdutoTO;

public class ListaProdutosPanel extends JPanel{
	
	private static final long serialVersionUID = -4605241641736507551L;
	
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	private JTable tabelaProdutos;
	private JScrollPane listaProdutosScrollPane;

	ProdutoDAO areaDAO = new ProdutoDAO();

	
	public ListaProdutosPanel(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new FlowLayout());
		add(getTabelaProdutos());
		add(getListaProdutosScrollPane());
	}
	
	
    public JTable getTabelaProdutos() {
	if(tabelaProdutos == null){
		DefaultTableModel modelo = new DefaultTableModel(null, new String[] {"Código", "Nome", "Qtd"});
		tabelaProdutos = new JTable(modelo);
		    Object[] dados = new Object[3];
		    try{
		    	ArrayList<ProdutoTO> listaProdutos = produtoDAO.listarProdutos();
		    	for(ProdutoTO to : listaProdutos){
					dados[0] = to.getCodigo();
				    dados[1] = to.getNome();
				    dados[2] = to.getQtd();
				    modelo.addRow(dados);
				}
			}catch(ProdutoException e){
				System.out.println("Erro consultando área de pesquisa.");
				e.printStackTrace();
			}
		}
			
			return tabelaProdutos;
		}
	    
	public JScrollPane getListaProdutosScrollPane() {
		if(listaProdutosScrollPane == null){
			listaProdutosScrollPane = new JScrollPane(tabelaProdutos);
			listaProdutosScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			listaProdutosScrollPane.setPreferredSize(new Dimension(670, 355));
			
		}
		return listaProdutosScrollPane;
	}

	
}
