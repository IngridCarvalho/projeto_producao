package br.edu.univas.si4.tp4.producao.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastrarProdutos extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel nomeLabel;
	private JTextField nomeField;
	private JLabel precoCustoLabel;
	private JTextField precoCustoField;
	private JLabel precoVendaLabel;
	private JTextField precoVendaField;
	private JLabel qtdEstoqueLabel;
	private JTextField qtdEstoqueField;
	private JRadioButton tipoProdutoComp;
	private JRadioButton tipoProdutoMp;
	private ButtonGroup tipoGrupo;
	
	private GridBagConstraints nomeLabelConstraints;
	private GridBagConstraints nomeFieldConstraints;
	private GridBagConstraints precoCustoLabelConstraints;
	private GridBagConstraints precoCustoFieldConstraints;
	private GridBagConstraints precoVendaLabelConstraints;
	private GridBagConstraints precoVendaFieldConstraints;
	private GridBagConstraints qtdEstoqueLabelConstraints;
	private GridBagConstraints qtdEstoqueFieldConstraints;
	private GridBagConstraints tipoProdutoCompConstraints;
	private GridBagConstraints tipoProdutoMpConstraints;
	
	public CadastrarProdutos(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		getTipoGrupo();
		add(getNomeLabel(), getNomeLabelConstraints());
		add(getNomeField(), getNomeFieldConstraints());
		add(getPrecoCustoLabel(), getPrecoCustoLabelConstraints());
		add(getPrecoCustoField(), getPrecoCustoFieldConstraints());
		add(getPrecoVendaLabel(), getPrecoVendaLabelConstraints());
		add(getPrecoVendaField(), getPrecoVendaFieldConstraints());
		add(getQtdEstoqueLabel(), getQtdEstoqueLabelConstraints());
		add(getQtdEstoqueField(), getQtdEstoqueFieldConstraints());
		add(getTipoProdutoComp(), getTipoProdutoCompConstraints());
		add(getTipoProdutoMp(), getTipoProdutoMpConstraints());
		setVisible(true);
	}
	
	public JLabel getNomeLabel() {
		if(nomeLabel == null){
			nomeLabel = new JLabel();
			nomeLabel.setText("Nome:");
		}
		return nomeLabel;
	}
	public JTextField getNomeField() {
		if(nomeField == null){
			nomeField = new JTextField();
			nomeField.setColumns(20);
		}
		return nomeField;
	}
	public JLabel getPrecoCustoLabel() {
		if(precoCustoLabel == null){
			precoCustoLabel = new JLabel();
			precoCustoLabel.setText("Preço de Custo:");
		}
		return precoCustoLabel;
	}
	public JTextField getPrecoCustoField() {
		if(precoCustoField == null){
			precoCustoField = new JTextField();
			precoCustoField.setColumns(20);
		}
		return precoCustoField;
	}
	public JLabel getPrecoVendaLabel() {
		if(precoVendaLabel == null){
			precoVendaLabel = new JLabel();
			precoVendaLabel.setText("Preço de Venda:");
		}
		return precoVendaLabel;
	}
	public JTextField getPrecoVendaField() {
		if(precoVendaField ==  null){
			precoVendaField = new JTextField();
			precoVendaField.setColumns(20);
		}
		return precoVendaField;
	}
	private JLabel getQtdEstoqueLabel() {
		if(qtdEstoqueLabel == null){
			qtdEstoqueLabel = new JLabel();
			qtdEstoqueLabel.setText("Quantidade:");
		}
		return qtdEstoqueLabel;
	}

	private JTextField getQtdEstoqueField() {
		if(qtdEstoqueField == null){
			qtdEstoqueField = new JTextField();
			qtdEstoqueField.setColumns(20);
		}
		return qtdEstoqueField;
	}

	public JRadioButton getTipoProdutoComp() {
		if(tipoProdutoComp == null){
			tipoProdutoComp = new JRadioButton("Composição");
		}
		return tipoProdutoComp;
	}
	public JRadioButton getTipoProdutoMp() {
		if(tipoProdutoMp == null){
			tipoProdutoMp = new JRadioButton("Matéria Prima");
		}
		return tipoProdutoMp;
	}
	public ButtonGroup getTipoGrupo(){
		if(tipoGrupo == null){
			tipoGrupo = new ButtonGroup();
			tipoGrupo.add(getTipoProdutoComp());
			tipoGrupo.add(getTipoProdutoMp());
		}
		return tipoGrupo;
	}

	private GridBagConstraints getNomeLabelConstraints() {
		if(nomeLabelConstraints == null){
			nomeLabelConstraints = new GridBagConstraints();
			nomeLabelConstraints.gridx = 0;
			nomeLabelConstraints.gridy = 0;
			nomeLabelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return nomeLabelConstraints;
	}

	private GridBagConstraints getNomeFieldConstraints() {
		if(nomeFieldConstraints == null){
			nomeFieldConstraints = new GridBagConstraints();
			nomeFieldConstraints.gridx = 1;
			nomeFieldConstraints.gridy = 0;
			nomeFieldConstraints.ipadx = 100;
			nomeFieldConstraints.weightx = 1.0;
			nomeFieldConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return nomeFieldConstraints;
	}

	private GridBagConstraints getPrecoCustoLabelConstraints() {
		if(precoCustoLabelConstraints == null){
			precoCustoLabelConstraints = new GridBagConstraints();
			precoCustoLabelConstraints.gridx = 0;
			precoCustoLabelConstraints.gridy = 1;
			precoCustoLabelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return precoCustoLabelConstraints;
	}

	private GridBagConstraints getPrecoCustoFieldConstraints() {
		if(precoCustoFieldConstraints == null){
			precoCustoFieldConstraints = new GridBagConstraints();
			precoCustoFieldConstraints.gridx = 1;
			precoCustoFieldConstraints.gridy = 1;
			precoCustoFieldConstraints.ipadx = 100;
			precoCustoFieldConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return precoCustoFieldConstraints;
	}

	private GridBagConstraints getPrecoVendaLabelConstraints() {
		if(precoVendaLabelConstraints == null){
			precoVendaLabelConstraints = new GridBagConstraints();
			precoVendaLabelConstraints.gridx = 0;
			precoVendaLabelConstraints.gridy = 2;
			precoVendaLabelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return precoVendaLabelConstraints;
	}

	private GridBagConstraints getPrecoVendaFieldConstraints() {
		if(precoVendaFieldConstraints == null){
			precoVendaFieldConstraints = new GridBagConstraints();
			precoVendaFieldConstraints.gridx = 1;
			precoVendaFieldConstraints.gridy = 2;
			precoVendaFieldConstraints.ipadx = 100;
			precoVendaFieldConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return precoVendaFieldConstraints;
	}

	private GridBagConstraints getQtdEstoqueLabelConstraints() {
		if(qtdEstoqueFieldConstraints == null){
			qtdEstoqueFieldConstraints = new GridBagConstraints();
			qtdEstoqueFieldConstraints.gridx = 0;
			qtdEstoqueFieldConstraints.gridy = 3;
			qtdEstoqueFieldConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return qtdEstoqueLabelConstraints;
	}

	private GridBagConstraints getQtdEstoqueFieldConstraints() {
		if(qtdEstoqueFieldConstraints == null){
			qtdEstoqueFieldConstraints = new GridBagConstraints();
			qtdEstoqueFieldConstraints.gridx = 1;
			qtdEstoqueFieldConstraints.gridy = 3;
			qtdEstoqueFieldConstraints.ipadx = 100;
			qtdEstoqueFieldConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return qtdEstoqueFieldConstraints;
	}

	private GridBagConstraints getTipoProdutoCompConstraints() {
		if(tipoProdutoCompConstraints == null){
			tipoProdutoCompConstraints = new GridBagConstraints();
			tipoProdutoCompConstraints.gridx = 0;
			tipoProdutoCompConstraints.gridy = 4;
			tipoProdutoCompConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return tipoProdutoCompConstraints;
	}

	private GridBagConstraints getTipoProdutoMpConstraints() {
		if(tipoProdutoMpConstraints == null){
			tipoProdutoMpConstraints = new GridBagConstraints();
			tipoProdutoMpConstraints.gridx = 1;
			tipoProdutoMpConstraints.gridy = 4;
			tipoProdutoMpConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return tipoProdutoMpConstraints;
	}
	
}
