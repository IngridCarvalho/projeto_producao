package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerBuscar;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;
import br.edu.univas.si4.tp4.producao.model.OrdemProducaoTO;
import br.edu.univas.si4.tp4.producao.view.BotoesOpcoesPanel;

public class CadastrarOrdemProducaoPanel extends JPanel{
	
	private static final long serialVersionUID = -6620702498375111873L;
	
	private ArrayList<ButtonsListenerBuscar> listenerBuscar = new ArrayList<>();
	
	private JLabel numeroOrdemLabel;
	private JTextField numeroOrdemField;
	private JLabel descricaoOrdemLabel;
	private JTextField descricaoOrdemField;
	private MaskFormatter dataMask;
	private JLabel dataInclusaoLabel;
	private JFormattedTextField dataInclusaoField;
	private JLabel dataFinalizacaoLabel;
	private JFormattedTextField dataFinalizacaoField;
	private JRadioButton pendenteRadio;
	private JRadioButton finalizadoRadio;
	private ButtonGroup status;
	private JLabel pesquisaProdutoLabel;
	private JTextField pesquisaProdutoField;
	private JButton btBuscar;
	private JLabel qtdLabel;
	private JTextField qtdField;
	private BotoesOpcoesPanel botoesOpcoes;
	
	private GridBagConstraints numeroOrdemLabelConstraints;
	private GridBagConstraints numeroOrdemFieldConstraints;
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
	
	public CadastrarOrdemProducaoPanel(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		getStatus();
		add(getNumeroOrdemLabel(), getNumeroOrdemLabelConstraints());
		add(getNumeroOrdemField(), getNumeroOrdemFieldConstraints());
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
		
	public JLabel getNumeroOrdemLabel() {
		if(numeroOrdemLabel == null){
			numeroOrdemLabel = new JLabel();
			numeroOrdemLabel.setText("Número:");
		}
		return numeroOrdemLabel;
	}

	public JTextField getNumeroOrdemField() {
		if(numeroOrdemField == null){
			numeroOrdemField = new JTextField();
		}
		return numeroOrdemField;
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

	private JFormattedTextField getDataInclusaoField() {
		if(dataInclusaoField == null){
			dataInclusaoField = new JFormattedTextField(getDataMask());
			dataInclusaoField.setColumns(10);
		}
		return dataInclusaoField;
	}
	
	private MaskFormatter getDataMask() {
		if(dataMask == null){
			try{
				dataMask = new MaskFormatter("####-##-##");
				dataMask.setPlaceholderCharacter('_');
			}
			catch(ParseException excp){
				System.err.println("Erro na formatação: " + excp.getMessage());
				System.exit(-1);
			}
		}
		return dataMask;
	}

	private JLabel getDataFinalizacaoLabel() {
		if(dataFinalizacaoLabel == null){
			dataFinalizacaoLabel = new JLabel();
			dataFinalizacaoLabel.setText("Data de Finalização:");
		}
		return dataFinalizacaoLabel;
	}

	private JFormattedTextField getDataFinalizacaoField() {
		if(dataFinalizacaoField == null){
			dataFinalizacaoField = new JFormattedTextField(getDataMask());
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
			pesquisaProdutoLabel.setText("Código do item:");
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
	
	public GridBagConstraints getNumeroOrdemLabelConstraints() {
		if(numeroOrdemLabelConstraints == null){
			numeroOrdemLabelConstraints = new GridBagConstraints();
			numeroOrdemLabelConstraints.gridx = 0;
			numeroOrdemLabelConstraints.gridy = 0;
			numeroOrdemLabelConstraints.insets = new Insets(15, 15, 5, 15);
		}
		return numeroOrdemLabelConstraints;
	}

	public GridBagConstraints getNumeroOrdemFieldConstraints() {
		if(numeroOrdemFieldConstraints == null){
			numeroOrdemFieldConstraints = new GridBagConstraints();
			numeroOrdemFieldConstraints.gridx = 1;
			numeroOrdemFieldConstraints.gridy = 0;
			numeroOrdemFieldConstraints.ipadx = 100;
			numeroOrdemFieldConstraints.insets = new Insets(15, 15, 5, 15);
		}
		return numeroOrdemFieldConstraints;
	}
	
	private GridBagConstraints getDescricaoOrdemLabelConstraints() {
		if(descricaoOrdemLabelConstraints == null){
			descricaoOrdemLabelConstraints = new GridBagConstraints();
			descricaoOrdemLabelConstraints.gridx = 0;
			descricaoOrdemLabelConstraints.gridy = 1;
			descricaoOrdemLabelConstraints.insets = new Insets(3, 15, 5, 15);
		}
		return descricaoOrdemLabelConstraints;
	}

	private GridBagConstraints getDescricaoOrdemFieldConstraints() {
		if(descricaoOrdemFieldConstraints == null){
			descricaoOrdemFieldConstraints = new GridBagConstraints();
			descricaoOrdemFieldConstraints.gridx = 1;
			descricaoOrdemFieldConstraints.gridy = 1;
			descricaoOrdemFieldConstraints.ipadx = 100;
			descricaoOrdemFieldConstraints.fill = GridBagConstraints.HORIZONTAL;
			descricaoOrdemFieldConstraints.gridwidth = 3;
			descricaoOrdemFieldConstraints.insets = new Insets(3, 15, 5, 15);
		}
		return descricaoOrdemFieldConstraints;
	}

	private GridBagConstraints getDataInclusaoLabelConstraints() {
		if(dataInclusaoLabelConstraints == null){
			dataInclusaoLabelConstraints = new GridBagConstraints();
			dataInclusaoLabelConstraints.gridx = 0;
			dataInclusaoLabelConstraints.gridy = 2;
			dataInclusaoLabelConstraints.insets = new Insets(3, 15, 5, 15);
		}
		return dataInclusaoLabelConstraints;
	}

	private GridBagConstraints getDataInclusaoFieldConstraints() {
		if(dataInclusaoFieldConstraints == null){
			dataInclusaoFieldConstraints = new GridBagConstraints();
			dataInclusaoFieldConstraints.gridx = 1;
			dataInclusaoFieldConstraints.gridy = 2;
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
			dataFinalizacaoLabelConstraints.gridy = 2;
			dataFinalizacaoLabelConstraints.anchor = GridBagConstraints.EAST;
			dataFinalizacaoLabelConstraints.insets =  new Insets(3, 15, 5, 15);
		}
		return dataFinalizacaoLabelConstraints;
	}

	private GridBagConstraints getDataFinalizacaoFieldConstraints() {
		if(dataFinalizacaoFieldConstraints == null){
			dataFinalizacaoFieldConstraints = new GridBagConstraints();
			dataFinalizacaoFieldConstraints.gridx = 3;
			dataFinalizacaoFieldConstraints.gridy = 2;
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
			pendenteRadioConstraints.gridy = 3;
			pendenteRadioConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return pendenteRadioConstraints;
	}

	private GridBagConstraints getFinalizadoRadioConstraints() {
		if(finalizadoRadioConstraints == null){
			finalizadoRadioConstraints = new GridBagConstraints();
			finalizadoRadioConstraints.gridx = 1;
			finalizadoRadioConstraints.gridy = 3;
			finalizadoRadioConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return finalizadoRadioConstraints;
	}

	private GridBagConstraints getPesquisaProdutosLabelConstraints() {
		if(pesquisaProdutosLabelConstraints == null){
			pesquisaProdutosLabelConstraints = new GridBagConstraints();
			pesquisaProdutosLabelConstraints.gridx = 0;
			pesquisaProdutosLabelConstraints.gridy = 4;
			pesquisaProdutosLabelConstraints.insets = new Insets(3, 15, 5, 5);
		}
		return pesquisaProdutosLabelConstraints;
	}

	private GridBagConstraints getPesquisaProdutosFieldConstraints() {
		if(pesquisaProdutosFieldConstraints == null){
			pesquisaProdutosFieldConstraints = new GridBagConstraints();
			pesquisaProdutosFieldConstraints.gridx = 1;
			pesquisaProdutosFieldConstraints.gridy = 4;
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
			 btBuscarConstraints.gridy = 4;
			
			 btBuscarConstraints.insets = new Insets(3, 0, 5, 15);
		}
		return btBuscarConstraints;
	}

	private GridBagConstraints getQtdLabelConstraints() {
		if(qtdLabelConstraints == null){
			qtdLabelConstraints = new GridBagConstraints();
			qtdLabelConstraints.gridx = 0;
			qtdLabelConstraints.gridy = 5;
			qtdLabelConstraints.insets = new Insets(0, 15, 5, 15);
		}
		return qtdLabelConstraints;
	}

	private GridBagConstraints getQtdFieldConstraints() {
		if(qtdFieldConstraints == null){
			qtdFieldConstraints = new GridBagConstraints();
			qtdFieldConstraints.gridx = 1;
			qtdFieldConstraints.gridy = 5;
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
			botoesOpcoesConstraints.gridy = 6;
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
	
	public OrdemProducaoTO getCadastrarOrdem(){
		OrdemProducaoTO ordem = new OrdemProducaoTO();
		ordem.setNumero(Integer.parseInt(getNumeroOrdemField().getText()));
		ordem.setDescricao(getDescricaoOrdemField().getText());
		ordem.setDataEmissao(Date.valueOf((getDataInclusaoField().getText())));
		ordem.setDataFinalizacao(Date.valueOf(getDataFinalizacaoField().getText()));
		return ordem;
	}
	
}
