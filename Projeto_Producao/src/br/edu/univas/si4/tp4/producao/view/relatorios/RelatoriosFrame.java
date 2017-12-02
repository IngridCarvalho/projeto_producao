package br.edu.univas.si4.tp4.producao.view.relatorios;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerRelatorio;

public class RelatoriosFrame extends JFrame{
	
	private FiltroRelatorioPanel filtroRelatorio;
	private ListaProdutosRelatorioPanel listaProdutosRelatorioPanel;
	private JPanel centerPanel;
	
	public RelatoriosFrame(){
		super("Relatórios");
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

	private FiltroRelatorioPanel getFiltroRelatorio() {
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

	private ListaProdutosRelatorioPanel getListaProdutosRelatorioPanel() {
		if(listaProdutosRelatorioPanel == null){
			listaProdutosRelatorioPanel = new ListaProdutosRelatorioPanel();
			getCenterPanel().removeAll();
			getCenterPanel().revalidate();
		}
		return listaProdutosRelatorioPanel;
	}


	private JPanel getCenterPanel() {
		if(centerPanel == null){
			centerPanel = new JPanel();
		}
		return centerPanel;
	}

	public void gerarRelatorioClicked() {
		add(getListaProdutosRelatorioPanel(), BorderLayout.CENTER);
	}
	
	
}
