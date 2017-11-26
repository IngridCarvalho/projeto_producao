package br.edu.univas.si4.tp4.producao.view.relatorios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerRelatorio;

public class FiltroRelatorioPanel extends JPanel {
	
	private ArrayList<ButtonsListenerRelatorio> listenerGerar = new ArrayList<>();
	
	private JLabel periodoLabel;
	private JFormattedTextField periodoInicialField;
	private JLabel ateLabel;
	private JFormattedTextField periodoFinalField;
	private JButton btGerarRelatorio;
	private MaskFormatter dataMask;
	
	public FiltroRelatorioPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getPeriodoLabel());
		add(getPeriodoInicialField());
		add(getAteLabel());
		add(getPeriodoFinalField());
		add(getBtGerarRelatorio());
		
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
			periodoInicialField.setColumns(10);
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
			periodoFinalField.setColumns(10);
		}
		return periodoFinalField;
	}

	private JButton getBtGerarRelatorio() {
		if(btGerarRelatorio == null){
			btGerarRelatorio = new JButton();
			btGerarRelatorio.setText("Gerar Relatório");
			btGerarRelatorio.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					gerarRelatorioClicked();
					
				}
			});
		}
		return btGerarRelatorio;
	}
	
	public void addButtonsListenerRelatorio(ButtonsListenerRelatorio listener){
		listenerGerar.add(listener);
	}
	
	public void gerarRelatorioClicked(){
		for(ButtonsListenerRelatorio listener : listenerGerar){
			listener.gerarRelatorio();
		}
			
	}
	
}
