package br.edu.univas.si4.tp4.producao.view.relatorios;

import java.awt.BorderLayout;
import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.edu.univas.si4.tp4.producao.controller.Controller;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerRelatorio;

public class RelatoriosFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3861414587597519533L;
	
	private FiltroRelatorioPanel filtroRelatorio;
	private ListaProdutosRelatorioPanel listaProdutosRelatorioPanel;
	private JPanel centerPanel;
	private Controller controller;
	
	public RelatoriosFrame(Controller controller){
		super("Relatórios");
		this.controller = controller;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(700, 500);
		setResizable(false);
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getFiltroRelatorio(), BorderLayout.NORTH);
		add(getCenterPanel(), BorderLayout.CENTER);
		setVisible(true);
	}

	public FiltroRelatorioPanel getFiltroRelatorio() {
		if(filtroRelatorio == null){
			filtroRelatorio = new FiltroRelatorioPanel();
			filtroRelatorio.addButtonsListenerRelatorio(new ButtonsListenerRelatorio() {
				
				@Override
				public void gerarRelatorio() {
					gerarRelatorioClicked();
					
				}
			});
		}
		return filtroRelatorio;
	}

	public ListaProdutosRelatorioPanel getListaProdutosRelatorioPanel() {
		if(listaProdutosRelatorioPanel == null){
			listaProdutosRelatorioPanel = new ListaProdutosRelatorioPanel();
			getCenterPanel().removeAll();
			getCenterPanel().revalidate();
		}
		return listaProdutosRelatorioPanel;
	}
	
	public void setListaProdutosRelatorioPanel(ListaProdutosRelatorioPanel listaProdutosRelatorioPanel) {
		this.listaProdutosRelatorioPanel = listaProdutosRelatorioPanel;
	}

	public JPanel getCenterPanel() {
		if(centerPanel == null){
			centerPanel = new JPanel();
		}
		return centerPanel;
	}

	public void gerarRelatorioClicked() {
		//datas();
		controller.gerarRelatorio();
		//add(getListaProdutosRelatorioPanel(), BorderLayout.CENTER);
	}
	
	
}
