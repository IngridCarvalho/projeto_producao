package br.edu.univas.si4.tp4.producao.view.relatorios;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.si4.tp4.producao.model.ItensOrdemTO;
import br.edu.univas.si4.tp4.producao.model.ProdutoDAO;
import br.edu.univas.si4.tp4.producao.model.ProdutoException;
import br.edu.univas.si4.tp4.producao.model.ProdutoTO;

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
	
	public JTable getTabelaProdutos() {
		if(tabelaProdutos == null){
			DefaultTableModel modelo = new DefaultTableModel(null, new String[] {"C�digo", "Qtd", "Nome", "Custo", "Custo Total"});
			tabelaProdutos = new JTable(modelo);
			    Object[] dados = new Object[3];
			    try{
			    	ArrayList<ItensOrdemTO> listaProdutos = produtoDAO.relatorio();
			    	for(ItensOrdemTO to : listaProdutos){
						dados[0] = to.getCodigo();
					    dados[1] = to.getNome();
					    dados[2] = to.getQtd();
					    dados[3] = to.getCusto_unitario();
					    dados[4] = to.getCusto_total();
					    modelo.addRow(dados);
					}
				}catch(ProdutoException e){
					System.out.println("Erro consultando �rea de pesquisa.");
					e.printStackTrace();
				}
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
