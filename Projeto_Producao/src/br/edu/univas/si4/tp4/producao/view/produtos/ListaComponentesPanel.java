package br.edu.univas.si4.tp4.producao.view.produtos;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;
import br.edu.univas.si4.tp4.producao.view.BotoesOpcoesPanel;

public class ListaComponentesPanel extends JPanel{
	
	private JLabel componentesLabel;
	private JTable tabelaComponentes;
	private JScrollPane tabelaComponentesScrollPane; 
	private BotoesOpcoesPanel opcoesPanel;
	
	public ListaComponentesPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getComponentesLabel());
		add(getTabelaComponentes());
		add(getTabelaComponentesScrollPane());
		add(getOpcoesPanel(), BorderLayout.PAGE_END);
		
	}
	
	Object [] colunasProdutos = {"C�digo", "Nome", "Quantidade", "Custo"};
	
	Object [][] dados = {};
	
	private JLabel getComponentesLabel() {
		if(componentesLabel == null){
			componentesLabel = new JLabel();
			componentesLabel.setText("Componentes do Produto:");
		}
		return componentesLabel;
	}

	private JTable getTabelaComponentes() {
		if(tabelaComponentes == null){
			tabelaComponentes = new JTable(dados, colunasProdutos);
		}
		return tabelaComponentes;
	}

	private JScrollPane getTabelaComponentesScrollPane() {
		if(tabelaComponentesScrollPane == null){
			tabelaComponentesScrollPane = new JScrollPane(tabelaComponentes);
			tabelaComponentesScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			tabelaComponentesScrollPane.setPreferredSize(new Dimension(550, 220));
		}
		return tabelaComponentesScrollPane;
	}

	private BotoesOpcoesPanel getOpcoesPanel() {
		if(opcoesPanel == null){
			opcoesPanel = new BotoesOpcoesPanel();
			opcoesPanel.addButtonsListenerProdutos(new ButtonsListenerOpcoesProdutos() {
				
				@Override
				public void incluirPerformed() {
					incluirComponenteClicked();
					
				}
				
				@Override
				public void excluirPerformed() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void alterarPerformed() {
					// TODO Auto-generated method stub
					
				}
			});
		}
		return opcoesPanel;
	}

	public void incluirComponenteClicked() {
		JOptionPane.showMessageDialog(this, "Implementa��o Futura");
	}

}
