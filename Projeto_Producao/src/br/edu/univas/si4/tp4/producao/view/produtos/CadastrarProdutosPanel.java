package br.edu.univas.si4.tp4.producao.view.produtos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.edu.univas.si4.tp4.producao.model.ProdutoTO;

public class CadastrarProdutosPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public JLabel codigoLabel;
	public JTextField codigoField;
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
	private int valorRadioButton;
	
	private GridBagConstraints codigoLabelConstraints;
	private GridBagConstraints codigoFieldConstraints;
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
	
	public CadastrarProdutosPanel(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		getTipoGrupo();
		add(getCodigoLabel(), getCodigoLabelConstraints());
		add(getCodigoField(), getCodigoFieldConstraints());
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
	
	public JLabel getCodigoLabel() {
		if(codigoLabel == null){
			codigoLabel = new JLabel();
			codigoLabel.setText("C�digo:");
		}
		return codigoLabel;
	}

	public JTextField getCodigoField() {
		if(codigoField == null){
			codigoField = new JTextField();
			codigoField.setColumns(10);
		}
		return codigoField;
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
			nomeField.setColumns(39);
		}
		return nomeField;
	}
	public JLabel getPrecoCustoLabel() {
		if(precoCustoLabel == null){
			precoCustoLabel = new JLabel();
			precoCustoLabel.setText("Pre�o de Custo:");
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
			precoVendaLabel.setText("Pre�o de Venda:");
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
			tipoProdutoComp = new JRadioButton("Composi��o");
			tipoProdutoComp.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					composicaoSelecionado();
				}
			});
		}
		return tipoProdutoComp;
	}
	public JRadioButton getTipoProdutoMp() {
		if(tipoProdutoMp == null){
			tipoProdutoMp = new JRadioButton("Componente");
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
	
	public int getValorRadioButtoon(){
		if(getTipoProdutoComp().isSelected()){
			valorRadioButton = 1;
		}else{
			valorRadioButton = 2;
		}
		return valorRadioButton;
	}
	
	public GridBagConstraints getCodigoLabelConstraints() {
		if(codigoLabelConstraints == null){
			codigoLabelConstraints = new GridBagConstraints();
			codigoLabelConstraints.gridx = 0;
			codigoLabelConstraints.gridy = 0;
			codigoLabelConstraints.insets = new Insets(15, 15, 5, 15);
		}
		return codigoLabelConstraints;
	}
	
	public GridBagConstraints getCodigoFieldConstraints() {
		if(codigoFieldConstraints == null){
			codigoFieldConstraints = new GridBagConstraints();
			codigoFieldConstraints.gridx = 1;
			codigoFieldConstraints.gridy = 0;
			codigoFieldConstraints.ipadx = 100;
			codigoFieldConstraints.insets = new Insets(15, 15, 5, 15);
		}
		return codigoFieldConstraints;
	}
	
	private GridBagConstraints getNomeLabelConstraints() {
		if(nomeLabelConstraints == null){
			nomeLabelConstraints = new GridBagConstraints();
			nomeLabelConstraints.gridx = 0;
			nomeLabelConstraints.gridy = 1;
			nomeLabelConstraints.insets = new Insets(5, 15, 5, 15);
		}
		return nomeLabelConstraints;
	}

	private GridBagConstraints getNomeFieldConstraints() {
		if(nomeFieldConstraints == null){
			nomeFieldConstraints = new GridBagConstraints();
			nomeFieldConstraints.gridx = 1;
			nomeFieldConstraints.gridy = 1;
			nomeFieldConstraints.ipadx = 100;
			nomeFieldConstraints.gridwidth = 3;
			nomeFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
			nomeFieldConstraints.insets = new Insets(5, 15, 5, 15);
		}
		return nomeFieldConstraints;
	}

	private GridBagConstraints getPrecoCustoLabelConstraints() {
		if(precoCustoLabelConstraints == null){
			precoCustoLabelConstraints = new GridBagConstraints();
			precoCustoLabelConstraints.gridx = 0;
			precoCustoLabelConstraints.gridy = 2;
			precoCustoLabelConstraints.insets = new Insets(5, 15, 5, 15);
		}
		return precoCustoLabelConstraints;
	}

	private GridBagConstraints getPrecoCustoFieldConstraints() {
		if(precoCustoFieldConstraints == null){
			precoCustoFieldConstraints = new GridBagConstraints();
			precoCustoFieldConstraints.gridx = 1;
			precoCustoFieldConstraints.gridy = 2;
			precoCustoFieldConstraints.ipadx = 100;
			precoCustoFieldConstraints.insets = new Insets(5, 15, 5, 15);
		}
		return precoCustoFieldConstraints;
	}

	private GridBagConstraints getPrecoVendaLabelConstraints() {
		if(precoVendaLabelConstraints == null){
			precoVendaLabelConstraints = new GridBagConstraints();
			precoVendaLabelConstraints.gridx = 2;
			precoVendaLabelConstraints.gridy = 2;
			precoVendaLabelConstraints.insets = new Insets(5, 15, 5, 15);
		}
		return precoVendaLabelConstraints;
	}

	private GridBagConstraints getPrecoVendaFieldConstraints() {
		if(precoVendaFieldConstraints == null){
			precoVendaFieldConstraints = new GridBagConstraints();
			precoVendaFieldConstraints.gridx = 3;
			precoVendaFieldConstraints.gridy = 2;
			precoVendaFieldConstraints.ipadx = 100;
			precoVendaFieldConstraints.insets = new Insets(5, 15, 5, 15);
		}
		return precoVendaFieldConstraints;
	}

	private GridBagConstraints getQtdEstoqueLabelConstraints() {
		if(qtdEstoqueLabelConstraints == null){
			qtdEstoqueLabelConstraints = new GridBagConstraints();
			qtdEstoqueLabelConstraints.gridx = 0;
			qtdEstoqueLabelConstraints.gridy = 4;
			qtdEstoqueLabelConstraints.insets = new Insets(5, 15, 20, 15);
		}
		return qtdEstoqueLabelConstraints;
	}

	private GridBagConstraints getQtdEstoqueFieldConstraints() {
		if(qtdEstoqueFieldConstraints == null){
			qtdEstoqueFieldConstraints = new GridBagConstraints();
			qtdEstoqueFieldConstraints.gridx = 1;
			qtdEstoqueFieldConstraints.gridy = 4;
			qtdEstoqueFieldConstraints.ipadx = 100;
			qtdEstoqueFieldConstraints.insets = new Insets(5, 15, 20, 15);
		}
		return qtdEstoqueFieldConstraints;
	}

	private GridBagConstraints getTipoProdutoCompConstraints() {
		if(tipoProdutoCompConstraints == null){
			tipoProdutoCompConstraints = new GridBagConstraints();
			tipoProdutoCompConstraints.gridx = 2;
			tipoProdutoCompConstraints.gridy = 4;
			tipoProdutoCompConstraints.insets = new Insets(5, 15, 20, 15);
		}
		return tipoProdutoCompConstraints;
	}

	private GridBagConstraints getTipoProdutoMpConstraints() {
		if(tipoProdutoMpConstraints == null){
			tipoProdutoMpConstraints = new GridBagConstraints();
			tipoProdutoMpConstraints.gridx = 3;
			tipoProdutoMpConstraints.gridy = 4;
			tipoProdutoMpConstraints.insets = new Insets(5, 15, 20, 15);
		}
		return tipoProdutoMpConstraints;
	}
	public void composicaoSelecionado(){
		if(tipoProdutoComp.isSelected()){
		JOptionPane.showMessageDialog(this, "Se o Produto � uma composi��o, voc� deve informar os componentes abaixo");
		}else{
			
		}
	}

	public ProdutoTO getProduto() {
		ProdutoTO produto = new ProdutoTO();
		produto.setCodigo(Integer.parseInt(getCodigoField().getText()));
		produto.setNome(getNomeField().getText());
		produto.setPreco_custo(Float.parseFloat(getPrecoCustoField().getText()));
		produto.setPreco_venda(Float.parseFloat(getPrecoVendaField().getText()));
		produto.setQtd(Integer.parseInt(getQtdEstoqueField().getText()));
		produto.setTipo_produto(getValorRadioButtoon());
		return produto;
	}
	
	

}
