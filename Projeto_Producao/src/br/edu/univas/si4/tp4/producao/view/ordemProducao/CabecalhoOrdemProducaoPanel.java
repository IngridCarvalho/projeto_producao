package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CabecalhoOrdemProducaoPanel extends JPanel{
	
	private JLabel descricaoOrdemLabel;
	private JTextField descricaoOrdemField;
	private JLabel dataInclusaoLabel;
	private JTextField dataInclusaoField;
	private JLabel dataFinalizacaoLabel;
	private JTextField dataFinalizacaoField;
	private JRadioButton pendenteRadio;
	private JRadioButton finalizadoRadio;
	private ButtonGroup status;
	
	private GridBagConstraints descricaoOrdemLabelConstraints;
	private GridBagConstraints descricaoOrdemFieldConstraints;
	private GridBagConstraints dataInclusaoLabelConstraints;
	private GridBagConstraints dataInclusaoFieldConstraints;
	private GridBagConstraints dataFinalizacaoLabelConstraints;
	private GridBagConstraints dataFinalizacaoFieldConstraints;
	private GridBagConstraints pendenteRadioConstraints;
	private GridBagConstraints finalizadoRadioConstraints;
	
	public CabecalhoOrdemProducaoPanel(){
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
			descricaoOrdemField.setColumns(20);
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
			dataInclusaoField.setColumns(15);
		}
		return dataInclusaoField;
	}

	private JLabel getDataFinalizacaoLabel() {
		if(dataFinalizacaoLabel == null){
			dataFinalizacaoLabel = new JLabel();
			dataFinalizacaoLabel.setText("Data Finalização:");
		}
		return dataFinalizacaoLabel;
	}

	private JTextField getDataFinalizacaoField() {
		if(dataFinalizacaoField == null){
			dataFinalizacaoField = new JTextField();
			dataFinalizacaoField.setColumns(15);
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
	
	private GridBagConstraints getDescricaoOrdemLabelConstraints() {
		if(descricaoOrdemLabelConstraints == null){
			descricaoOrdemLabelConstraints = new GridBagConstraints();
			descricaoOrdemLabelConstraints.gridx = 0;
			descricaoOrdemLabelConstraints.gridy = 0;
			
		}
		return descricaoOrdemLabelConstraints;
	}

	private GridBagConstraints getDescricaoOrdemFieldConstraints() {
		if(descricaoOrdemFieldConstraints == null){
			descricaoOrdemFieldConstraints = new GridBagConstraints();
			descricaoOrdemFieldConstraints.gridx = 1;
			descricaoOrdemFieldConstraints.gridy = 0;
			descricaoOrdemFieldConstraints.gridwidth = 3;
		}
		return descricaoOrdemFieldConstraints;
	}

	private GridBagConstraints getDataInclusaoLabelConstraints() {
		if(dataInclusaoLabelConstraints == null){
			dataInclusaoLabelConstraints = new GridBagConstraints();
			dataInclusaoLabelConstraints.gridx = 0;
			dataInclusaoLabelConstraints.gridy = 1;
		}
		return dataInclusaoLabelConstraints;
	}

	private GridBagConstraints getDataInclusaoFieldConstraints() {
		if(dataInclusaoFieldConstraints == null){
			dataInclusaoFieldConstraints = new GridBagConstraints();
			dataInclusaoFieldConstraints.gridx = 1;
			dataInclusaoFieldConstraints.gridy = 1;
		}
		return dataInclusaoFieldConstraints;
	}

	private GridBagConstraints getDataFinalizacaoLabelConstraints() {
		if(dataFinalizacaoLabelConstraints == null){
			dataFinalizacaoLabelConstraints = new GridBagConstraints();
			dataFinalizacaoLabelConstraints.gridx = 2;
			dataFinalizacaoLabelConstraints.gridy = 1;
		}
		return dataFinalizacaoLabelConstraints;
	}

	private GridBagConstraints getDataFinalizacaoFieldConstraints() {
		if(dataFinalizacaoFieldConstraints == null){
			dataFinalizacaoFieldConstraints = new GridBagConstraints();
			dataFinalizacaoFieldConstraints.gridx = 3;
			dataFinalizacaoFieldConstraints.gridy = 1;
		}
		return dataFinalizacaoFieldConstraints;
	}

	private GridBagConstraints getPendenteRadioConstraints() {
		if(pendenteRadioConstraints == null){
			pendenteRadioConstraints = new GridBagConstraints();
			pendenteRadioConstraints.gridx = 0;
			pendenteRadioConstraints.gridy = 2;
		}
		return pendenteRadioConstraints;
	}

	private GridBagConstraints getFinalizadoRadioConstraints() {
		if(finalizadoRadioConstraints == null){
			finalizadoRadioConstraints = new GridBagConstraints();
			finalizadoRadioConstraints.gridx = 1;
			finalizadoRadioConstraints.gridy = 2;
		}
		return finalizadoRadioConstraints;
	}
}
