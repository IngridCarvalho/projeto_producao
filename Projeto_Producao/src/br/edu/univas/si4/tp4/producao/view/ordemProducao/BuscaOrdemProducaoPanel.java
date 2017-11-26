package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerBuscar;

public class BuscaOrdemProducaoPanel extends JPanel{
	
	private static final long serialVersionUID = -8044699353334103409L;
	
	private ArrayList<ButtonsListenerBuscar> listenerBuscar = new ArrayList<>();
	
	private JLabel nomeLabel;
	private JTextField nomeField;
	private JLabel periodoLabel;
	private MaskFormatter dataMask;
	private JFormattedTextField periodoInicialField;
	private JLabel ateLabel;
	private JFormattedTextField periodoFinalField;
	private JButton buscarButton;
	
	private GridBagConstraints nomeLabelConstraints;
	private GridBagConstraints nomeFieldConstraints;
	private GridBagConstraints periodoLabelConstraints;
	private GridBagConstraints periodoInicialFieldConstraints;
	private GridBagConstraints ateLabelConstraints;
	private GridBagConstraints periodoFinalFieldConstraints;
	private GridBagConstraints buscarButtonConstraints;
	
	public BuscaOrdemProducaoPanel(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		add(getNomeLabel(), getNomeLabelConstraints());
		add(getNomeField(), getNomeFieldConstraints());
		add(getPeriodoLabel(), getPeriodoLabelConstraints());
		add(getPeriodoInicialField(), getPeriodoInicialFieldConstraints());
		add(getAteLabel(), getAteLabelConstraints());
		add(getPeriodoFinalField(), getPeriodoFinalFieldConstraints());
		add(getBuscarButton(), getBuscarButtonConstraints());
	}

	private JLabel getNomeLabel() {
		if(nomeLabel == null){
			nomeLabel = new JLabel();
			nomeLabel.setText("Descrição da Produção:");
		}
		return nomeLabel;
	}

	private JTextField getNomeField() {
		if(nomeField == null){
			nomeField = new JTextField();
			nomeField.setColumns(45);
		}
		return nomeField;
	}

	private JLabel getPeriodoLabel() {
		if(periodoLabel == null){
			periodoLabel = new JLabel();
			periodoLabel.setText("Período:");
		}
		return periodoLabel;
	}

	private MaskFormatter getDataMask() {
		if(dataMask == null){
			try{
				dataMask = new MaskFormatter("##/##/####");
				dataMask.setPlaceholderCharacter('_');
			}
			catch(ParseException excp){
				System.err.println("Erro na formatação: " + excp.getMessage());
				System.exit(-1);
			}
		}
		return dataMask;
	}

	private JFormattedTextField getPeriodoInicialField() {
		if(periodoInicialField == null){
			periodoInicialField = new JFormattedTextField(getDataMask());
			periodoInicialField.setColumns(15);
		}
		return periodoInicialField;
	}

	private JLabel getAteLabel() {
		if(ateLabel == null){
			ateLabel = new JLabel();
			ateLabel.setText("até");
		}
		return ateLabel;
	}

	private JFormattedTextField getPeriodoFinalField() {
		if(periodoFinalField == null){
			periodoFinalField = new JFormattedTextField(getDataMask());
			periodoFinalField.setColumns(15);
		}
		return periodoFinalField;
	}

	private JButton getBuscarButton() {
		if(buscarButton == null){
			buscarButton = new JButton();
			buscarButton.setText("Buscar");
			buscarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					buscarClicked();
				}
			});
		}
		return buscarButton;
	}
	
	private GridBagConstraints getNomeLabelConstraints() {
		if(nomeLabelConstraints == null){
			nomeLabelConstraints = new GridBagConstraints();
			nomeLabelConstraints.gridx = 0;
			nomeLabelConstraints.gridy = 0;
			nomeLabelConstraints.insets = new Insets(15, 5, 5, 15);
		}
		return nomeLabelConstraints;
	}

	private GridBagConstraints getNomeFieldConstraints() {
		if(nomeFieldConstraints == null){
			nomeFieldConstraints = new GridBagConstraints();
			nomeFieldConstraints.gridx = 1;
			nomeFieldConstraints.gridy = 0;
			nomeFieldConstraints.gridwidth = 4;
			nomeFieldConstraints.insets = new Insets(15, 0, 5, 0);
		}
		return nomeFieldConstraints;
	}

	private GridBagConstraints getPeriodoLabelConstraints() {
		if(periodoLabelConstraints == null){
			periodoLabelConstraints = new GridBagConstraints();
			periodoLabelConstraints.gridx = 0;
			periodoLabelConstraints.gridy = 1;
			periodoLabelConstraints.insets = new Insets(0, 5, 5, 0);
			periodoLabelConstraints.anchor = GridBagConstraints.WEST;
		}
		return periodoLabelConstraints;
	}

	private GridBagConstraints getPeriodoInicialFieldConstraints() {
		if(periodoInicialFieldConstraints == null){
			periodoInicialFieldConstraints = new GridBagConstraints();
			periodoInicialFieldConstraints.gridx = 1;
			periodoInicialFieldConstraints.gridy = 1;
			periodoInicialFieldConstraints.insets = new Insets(0, 0, 5, 0);
		}
		return periodoInicialFieldConstraints;
	}

	private GridBagConstraints getAteLabelConstraints() {
		if(ateLabelConstraints == null){
			ateLabelConstraints = new GridBagConstraints();
			ateLabelConstraints.gridx = 2;
			ateLabelConstraints.gridy = 1;
			ateLabelConstraints.insets = new Insets(0, 15, 5, 0);
		}
		return ateLabelConstraints;
	}

	private GridBagConstraints getPeriodoFinalFieldConstraints() {
		if(periodoFinalFieldConstraints == null){
			periodoFinalFieldConstraints = new GridBagConstraints();
			periodoFinalFieldConstraints.gridx = 3;
			periodoFinalFieldConstraints.gridy = 1;
			periodoFinalFieldConstraints.insets = new Insets(0, 15, 5, 0);
		}
		return periodoFinalFieldConstraints;
	}

	private GridBagConstraints getBuscarButtonConstraints() {
		if(buscarButtonConstraints == null){
			buscarButtonConstraints = new GridBagConstraints();
			buscarButtonConstraints.gridx = 4;
			buscarButtonConstraints.gridy = 1;
			buscarButtonConstraints.insets = new Insets(0, 15, 5, 0);
			buscarButtonConstraints.anchor = GridBagConstraints.EAST;
		}
		return buscarButtonConstraints;
	}

	public void addButtonsListenerBuscar(ButtonsListenerBuscar listener){
		listenerBuscar.add(listener);
	}
	
	public void buscarClicked(){
		for(ButtonsListenerBuscar listener : listenerBuscar){
			listener.buscarPerfomed();
		}
	}
}
