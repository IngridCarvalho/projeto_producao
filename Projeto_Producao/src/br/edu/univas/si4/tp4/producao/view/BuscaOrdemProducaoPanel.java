package br.edu.univas.si4.tp4.producao.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuscaOrdemProducaoPanel extends JPanel{
	
	private static final long serialVersionUID = -8044699353334103409L;
	
	private JLabel nomeLabel;
	private JTextField nomeField;
	private JLabel periodoLabel;
	private JTextField periodoInicialField;
	private JLabel ateLabel;
	private JTextField periodoFinalField;
	private JButton buscarButton;
	
	public BuscaOrdemProducaoPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getNomeLabel());
		add(getNomeField());
		add(getPeriodoLabel());
		add(getPeriodoInicialField());
		add(getAteLabel());
		add(getPeriodoFinalField());
		add(getBuscarButton());
	}

	private JLabel getNomeLabel() {
		if(nomeLabel == null){
			nomeLabel = new JLabel();
			nomeLabel.setText("Nome do Produto:");
		}
		return nomeLabel;
	}

	private JTextField getNomeField() {
		if(nomeField == null){
			nomeField = new JTextField();
			nomeField.setColumns(30);
		}
		return nomeField;
	}

	private JLabel getPeriodoLabel() {
		if(periodoLabel == null){
			periodoLabel = new JLabel();
			periodoLabel.setText("Período: ");
		}
		return periodoLabel;
	}

	private JTextField getPeriodoInicialField() {
		if(periodoInicialField == null){
			periodoInicialField = new JTextField();
			periodoInicialField.setColumns(20);
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

	private JTextField getPeriodoFinalField() {
		if(periodoFinalField == null){
			periodoFinalField = new JTextField();
			periodoFinalField.setColumns(20);
		}
		return periodoFinalField;
	}

	private JButton getBuscarButton() {
		if(buscarButton == null){
			buscarButton = new JButton();
			buscarButton.setText("Buscar");
			//TODO:implementar
		}
		return buscarButton;
	}
}
