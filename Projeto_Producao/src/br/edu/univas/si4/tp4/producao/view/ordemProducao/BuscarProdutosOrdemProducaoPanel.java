package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerBuscar;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;
import br.edu.univas.si4.tp4.producao.view.BotoesOpcoesPanel;


public class BuscarProdutosOrdemProducaoPanel extends JPanel{
	
	private static final long serialVersionUID = -6620702498375111873L;
	
	private ArrayList<ButtonsListenerBuscar> listenerBuscar = new ArrayList<>();
	
	private JLabel pesquisaProdutoLabel;
	private JTextField pesquisaProdutoField;
	private JButton btBuscar;
	private JLabel qtdLabel;
	private JTextField qtdField;
	private BotoesOpcoesPanel botoesOpcoes;
	
	private GridBagConstraints pesquisaProdutosLabelConstraints;
	private GridBagConstraints pesquisaProdutosFieldConstraints;
	private GridBagConstraints btBuscarConstraints;
	private GridBagConstraints qtdLabelConstraints;
	private GridBagConstraints qtdFieldConstraints;
	private GridBagConstraints botoesOpcoesConstraints;
	
	public BuscarProdutosOrdemProducaoPanel(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		add(getPesquisaProdutoLabel(), getPesquisaProdutosLabelConstraints());
		add(getPesquisaProdutoField(), getPesquisaProdutosFieldConstraints());
		add(getBtBuscar(), getBtBuscarConstraints());
		add(getQtdLabel(), getQtdLabelConstraints());
		add(getQtdField(), getQtdFieldConstraints());
		add(getBotoesOpcoes(), getBotoesOpcoesConstraints());
	}

	private JLabel getPesquisaProdutoLabel() {
		if(pesquisaProdutoLabel == null){
			pesquisaProdutoLabel = new JLabel();
			pesquisaProdutoLabel.setText("Código ou nome do item:");
		}
		return pesquisaProdutoLabel;
	}

	private JTextField getPesquisaProdutoField() {
		if(pesquisaProdutoField == null){
			pesquisaProdutoField = new JTextField();
			pesquisaProdutoField.setColumns(36);
		}
		return pesquisaProdutoField;
	}

	private JButton getBtBuscar() {
		if(btBuscar == null){
			btBuscar = new JButton();
			btBuscar.setText("Buscar");
			btBuscar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					buscarClicked();
				}
			});
		}
		return btBuscar;
	}

	private JLabel getQtdLabel() {
		if(qtdLabel == null){
			qtdLabel = new JLabel();
			qtdLabel.setText("Quantidade a produzir:");
		}
		return qtdLabel;
	}

	private JTextField getQtdField() {
		if(qtdField == null){
			qtdField = new JTextField();
			qtdField.setColumns(10);
		}
		return qtdField;
	}

	private BotoesOpcoesPanel getBotoesOpcoes() {
		if(botoesOpcoes == null){
			botoesOpcoes = new BotoesOpcoesPanel();
			botoesOpcoes.addButtonsListenerProdutos(new ButtonsListenerOpcoesProdutos() {
				
				@Override
				public void incluirPerformed() {
					incluirClicked();
					
				}
				
				@Override
				public void excluirPerformed() {
					excluirClicked();
					
				}
				
				@Override
				public void alterarPerformed() {
					alterarClicked();
					
				}
			});
		}
		return botoesOpcoes;
	}

	private GridBagConstraints getPesquisaProdutosLabelConstraints() {
		if(pesquisaProdutosLabelConstraints == null){
			pesquisaProdutosLabelConstraints = new GridBagConstraints();
			pesquisaProdutosLabelConstraints.gridx = 0;
			pesquisaProdutosLabelConstraints.gridy = 0;
			pesquisaProdutosLabelConstraints.insets = new Insets(15, 15, 5, 5);
		}
		return pesquisaProdutosLabelConstraints;
	}

	private GridBagConstraints getPesquisaProdutosFieldConstraints() {
		if(pesquisaProdutosFieldConstraints == null){
			pesquisaProdutosFieldConstraints = new GridBagConstraints();
			pesquisaProdutosFieldConstraints.gridx = 1;
			pesquisaProdutosFieldConstraints.gridy = 0;
			pesquisaProdutosFieldConstraints.insets = new Insets(15, 15, 5, 15);
		}
		return pesquisaProdutosFieldConstraints;
	}

	private GridBagConstraints getBtBuscarConstraints() {
		if(btBuscarConstraints == null){
			 btBuscarConstraints = new GridBagConstraints();
			 btBuscarConstraints.gridx = 3;
			 btBuscarConstraints.gridy = 0;
			 btBuscarConstraints.insets = new Insets(15, 15, 5, 15);
		}
		return btBuscarConstraints;
	}

	private GridBagConstraints getQtdLabelConstraints() {
		if(qtdLabelConstraints == null){
			qtdLabelConstraints = new GridBagConstraints();
			qtdLabelConstraints.gridx = 0;
			qtdLabelConstraints.gridy = 1;
			qtdLabelConstraints.insets = new Insets(3, 15, 5, 15);
		}
		return qtdLabelConstraints;
	}

	private GridBagConstraints getQtdFieldConstraints() {
		if(qtdFieldConstraints == null){
			qtdFieldConstraints = new GridBagConstraints();
			qtdFieldConstraints.gridx = 1;
			qtdFieldConstraints.gridy = 1;
			qtdFieldConstraints.anchor = GridBagConstraints.WEST;
			qtdFieldConstraints.insets = new Insets(3, 15, 5, 15);
		}
		return qtdFieldConstraints;
	}

	private GridBagConstraints getBotoesOpcoesConstraints() {
		if(botoesOpcoesConstraints == null){
			botoesOpcoesConstraints = new GridBagConstraints();
			botoesOpcoesConstraints.gridx = 1;
			botoesOpcoesConstraints.gridy = 3;
			botoesOpcoesConstraints.weightx = 1.0;
		}
		return botoesOpcoesConstraints;
	}
	
	public void addButtonsListenerBuscar(ButtonsListenerBuscar listener){
		listenerBuscar.add(listener);
	}
	
	public void buscarClicked(){
		for(ButtonsListenerBuscar listener : listenerBuscar){
			listenerBuscar.add(listener);
		}
	}
	
	public void incluirClicked(){
		JOptionPane.showMessageDialog(this, "Incluido item na lista");
		//TODO: implementar inclusão de item na lista de produtos a produzir
	}
	
	public void excluirClicked(){
		JOptionPane.showMessageDialog(this, "Excluido com sucesso");
		//TODO: implementar exclusão de item da lista de produtos a produzir
	}
	
	public void alterarClicked(){
		JOptionPane.showMessageDialog(this, "Alterado com sucesso");
		//TODO: implementar alteração do item da lista
	}
	
}
