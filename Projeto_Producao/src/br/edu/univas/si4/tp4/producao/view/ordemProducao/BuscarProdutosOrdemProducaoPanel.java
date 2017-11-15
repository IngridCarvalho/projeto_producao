package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerBuscar;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;
import br.edu.univas.si4.tp4.producao.view.BotoesOpcoesPanel;

public class BuscarProdutosOrdemProducaoPanel extends JPanel{
	
	private static final long serialVersionUID = -6620702498375111873L;
	
	private ArrayList<ButtonsListenerBuscar> listenerBuscar = new ArrayList<>();
	
	private JLabel descricaoOrdemLabel;
	private JTextField descricaoOrdemField;
	private JLabel dataInclusaoLabel;
	private JTextField dataInclusaoField;
	private JLabel dataFinalizacaoLabel;
	private JTextField dataFinalizacaoField;
	private JRadioButton pendenteRadio;
	private JRadioButton finalizadoRadio;
	private ButtonGroup status;
	private JLabel pesquisaProdutoLabel;
	private JTextField pesquisaProdutoField;
	private JButton btBuscar;
	private JLabel qtdLabel;
	private JTextField qtdField;
	private BotoesOpcoesPanel botoesOpcoes;
	
	private GridBagConstraints descricaoOrdemLabelConstraints;
	private GridBagConstraints descricaoOrdemFieldConstraints;
	private GridBagConstraints dataInclusaoLabelConstraints;
	private GridBagConstraints dataInclusaoFieldConstraints;
	private GridBagConstraints dataFinalizacaoLabelConstraints;
	private GridBagConstraints dataFinalizacaoFieldConstraints;
	private GridBagConstraints pendenteRadioConstraints;
	private GridBagConstraints finalizadoRadioConstraints;
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
		getStatus();
		add(getDescricaoOrdemLabel(), getDescricaoOrdemLabelConstraints());
		add(getDescricaoOrdemField(), getDescricaoOrdemFieldConstraints());
		add(getDataInclusaoLabel(), getDataInclusaoLabelConstraints());
		add(getDataInclusaoField(), getDataInclusaoFieldConstraints());
		add(getDataFinalizacaoLabel(), getDataFinalizacaoLabelConstraints());
		add(getDataFinalizacaoField(), getDataFinalizacaoFieldConstraints());
		add(getPendenteRadio(), getPendenteRadioConstraints());
		add(getFinalizadoRadio(), getFinalizadoRadioConstraints());
		add(getPesquisaProdutoLabel(), getPesquisaProdutosLabelConstraints());
		add(getPesquisaProdutoField(), getPesquisaProdutosFieldConstraints());
		add(getBtBuscar(), getBtBuscarConstraints());
		add(getQtdLabel(), getQtdLabelConstraints());
		add(getQtdField(), getQtdFieldConstraints());
		add(getBotoesOpcoes(), getBotoesOpcoesConstraints());
	}
		
	private JLabel getDescricaoOrdemLabel() {
		if(descricaoOrdemLabel == null){
			descricaoOrdemLabel = new JLabel();
			descricaoOrdemLabel.setText("Descrição:");
		}
		return descricaoOrdemLabel;
	}

	private JTextField getDescricaoOrdemField() {
		if(descricaoOrdemField == null){
			descricaoOrdemField = new JTextField();
			descricaoOrdemField.setColumns(36);
		}
		return descricaoOrdemField;
	}

	private JLabel getDataInclusaoLabel() {
		if(dataInclusaoLabel == null){
			dataInclusaoLabel = new JLabel();
			dataInclusaoLabel.setText("Data de Emissão:");
		}
		return dataInclusaoLabel;
	}

	private JTextField getDataInclusaoField() {
		if(dataInclusaoField == null){
			dataInclusaoField = new JTextField();
			dataInclusaoField.setColumns(10);
		}
		return dataInclusaoField;
	}

	private JLabel getDataFinalizacaoLabel() {
		if(dataFinalizacaoLabel == null){
			dataFinalizacaoLabel = new JLabel();
			dataFinalizacaoLabel.setText("Data de Finalização:");
		}
		return dataFinalizacaoLabel;
	}

	private JTextField getDataFinalizacaoField() {
		if(dataFinalizacaoField == null){
			dataFinalizacaoField = new JTextField();
			dataFinalizacaoField.setColumns(10);
		}
		return dataFinalizacaoField;
	}

	private JRadioButton getPendenteRadio() {
		if(pendenteRadio == null){
			pendenteRadio = new JRadioButton("Pendente");
			pendenteRadio.setSelected(true);
		}
		return pendenteRadio;
	}

	private JRadioButton getFinalizadoRadio() {
		if(finalizadoRadio == null){
			finalizadoRadio = new JRadioButton("Finalizado");
		}
		return finalizadoRadio;
	}

	private ButtonGroup getStatus() {
		if(status == null){
			status = new ButtonGroup();
			status.add(getPendenteRadio());
			status.add(getFinalizadoRadio());
		}
		return status;
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
			pesquisaProdutoField.setColumns(30);
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

	private GridBagConstraints getDescricaoOrdemLabelConstraints() {
		if(descricaoOrdemLabelConstraints == null){
			descricaoOrdemLabelConstraints = new GridBagConstraints();
			descricaoOrdemLabelConstraints.gridx = 0;
			descricaoOrdemLabelConstraints.gridy = 0;
			descricaoOrdemLabelConstraints.insets = new Insets(15, 15, 5, 15);
		}
		return descricaoOrdemLabelConstraints;
	}

	private GridBagConstraints getDescricaoOrdemFieldConstraints() {
		if(descricaoOrdemFieldConstraints == null){
			descricaoOrdemFieldConstraints = new GridBagConstraints();
			descricaoOrdemFieldConstraints.gridx = 1;
			descricaoOrdemFieldConstraints.gridy = 0;
			descricaoOrdemFieldConstraints.ipadx = 100;
			descricaoOrdemFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
			descricaoOrdemFieldConstraints.gridwidth = 3;
			descricaoOrdemFieldConstraints.insets = new Insets(15, 15, 5, 15);
		}
		return descricaoOrdemFieldConstraints;
	}

	private GridBagConstraints getDataInclusaoLabelConstraints() {
		if(dataInclusaoLabelConstraints == null){
			dataInclusaoLabelConstraints = new GridBagConstraints();
			dataInclusaoLabelConstraints.gridx = 0;
			dataInclusaoLabelConstraints.gridy = 1;
			dataInclusaoLabelConstraints.insets = new Insets(3, 15, 5, 15);
		}
		return dataInclusaoLabelConstraints;
	}

	private GridBagConstraints getDataInclusaoFieldConstraints() {
		if(dataInclusaoFieldConstraints == null){
			dataInclusaoFieldConstraints = new GridBagConstraints();
			dataInclusaoFieldConstraints.gridx = 1;
			dataInclusaoFieldConstraints.gridy = 1;
			dataInclusaoFieldConstraints.ipadx = 100;
			dataInclusaoFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
			dataInclusaoFieldConstraints.insets = new Insets(3, 15, 5, 15);
		}
		return dataInclusaoFieldConstraints;
	}

	private GridBagConstraints getDataFinalizacaoLabelConstraints() {
		if(dataFinalizacaoLabelConstraints == null){
			dataFinalizacaoLabelConstraints = new GridBagConstraints();
			dataFinalizacaoLabelConstraints.gridx = 2;
			dataFinalizacaoLabelConstraints.gridy = 1;
			dataFinalizacaoLabelConstraints.anchor = GridBagConstraints.EAST;
			dataFinalizacaoLabelConstraints.insets =  new Insets(3, 15, 5, 15);
		}
		return dataFinalizacaoLabelConstraints;
	}

	private GridBagConstraints getDataFinalizacaoFieldConstraints() {
		if(dataFinalizacaoFieldConstraints == null){
			dataFinalizacaoFieldConstraints = new GridBagConstraints();
			dataFinalizacaoFieldConstraints.gridx = 3;
			dataFinalizacaoFieldConstraints.gridy = 1;
			dataFinalizacaoFieldConstraints.ipadx = 100;
			dataFinalizacaoFieldConstraints.anchor = GridBagConstraints.WEST;
			dataFinalizacaoFieldConstraints.insets = new Insets(3, 15, 5, 15);
		}
		return dataFinalizacaoFieldConstraints;
	}

	private GridBagConstraints getPendenteRadioConstraints() {
		if(pendenteRadioConstraints == null){
			pendenteRadioConstraints = new GridBagConstraints();
			pendenteRadioConstraints.gridx = 0;
			pendenteRadioConstraints.gridy = 2;
			pendenteRadioConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return pendenteRadioConstraints;
	}

	private GridBagConstraints getFinalizadoRadioConstraints() {
		if(finalizadoRadioConstraints == null){
			finalizadoRadioConstraints = new GridBagConstraints();
			finalizadoRadioConstraints.gridx = 1;
			finalizadoRadioConstraints.gridy = 2;
			finalizadoRadioConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return finalizadoRadioConstraints;
	}

	private GridBagConstraints getPesquisaProdutosLabelConstraints() {
		if(pesquisaProdutosLabelConstraints == null){
			pesquisaProdutosLabelConstraints = new GridBagConstraints();
			pesquisaProdutosLabelConstraints.gridx = 0;
			pesquisaProdutosLabelConstraints.gridy = 3;
			pesquisaProdutosLabelConstraints.insets = new Insets(3, 15, 5, 5);
		}
		return pesquisaProdutosLabelConstraints;
	}

	private GridBagConstraints getPesquisaProdutosFieldConstraints() {
		if(pesquisaProdutosFieldConstraints == null){
			pesquisaProdutosFieldConstraints = new GridBagConstraints();
			pesquisaProdutosFieldConstraints.gridx = 1;
			pesquisaProdutosFieldConstraints.gridy = 3;
			pesquisaProdutosFieldConstraints.ipadx = 100;
			pesquisaProdutosFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
			pesquisaProdutosFieldConstraints.weightx = 1.0;
			pesquisaProdutosFieldConstraints.gridwidth = 2;
			pesquisaProdutosFieldConstraints.insets = new Insets(3, 15, 5, 0);
		}
		return pesquisaProdutosFieldConstraints;
	}

	private GridBagConstraints getBtBuscarConstraints() {
		if(btBuscarConstraints == null){
			 btBuscarConstraints = new GridBagConstraints();
			 btBuscarConstraints.gridx = 3;
			 btBuscarConstraints.gridy = 3;
			
			 btBuscarConstraints.insets = new Insets(3, 0, 5, 15);
		}
		return btBuscarConstraints;
	}

	private GridBagConstraints getQtdLabelConstraints() {
		if(qtdLabelConstraints == null){
			qtdLabelConstraints = new GridBagConstraints();
			qtdLabelConstraints.gridx = 0;
			qtdLabelConstraints.gridy = 4;
			qtdLabelConstraints.insets = new Insets(0, 15, 5, 15);
		}
		return qtdLabelConstraints;
	}

	private GridBagConstraints getQtdFieldConstraints() {
		if(qtdFieldConstraints == null){
			qtdFieldConstraints = new GridBagConstraints();
			qtdFieldConstraints.gridx = 1;
			qtdFieldConstraints.gridy = 4;
			qtdFieldConstraints.anchor = GridBagConstraints.WEST;
			qtdFieldConstraints.ipadx = 100;
			qtdFieldConstraints.insets = new Insets(0, 15, 5, 15);
		}
		return qtdFieldConstraints;
	}

	private GridBagConstraints getBotoesOpcoesConstraints() {
		if(botoesOpcoesConstraints == null){
			botoesOpcoesConstraints = new GridBagConstraints();
			botoesOpcoesConstraints.gridx = 0;
			botoesOpcoesConstraints.gridy = 5;
			botoesOpcoesConstraints.gridwidth = 4;
			botoesOpcoesConstraints.weightx = 1.0;
		}
		return botoesOpcoesConstraints;
	}
	
	public void addButtonsListenerBuscar(ButtonsListenerBuscar listener){
		listenerBuscar.add(listener);
	}
	
	public void buscarClicked(){
		for(ButtonsListenerBuscar listener : listenerBuscar){
			listener.buscarPerfomed();
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
