package br.edu.univas.si4.tp4.producao.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuscarProdutosOrdemProducaoPanel extends JPanel{
	
	private static final long serialVersionUID = -6620702498375111873L;
	
	private JLabel pesquisaProdutoLabel;
	private JTextField pesquisaProdutoField;
	private JButton btBuscar;
	private JLabel qtdLabel;
	private JTextField qtdField;
	private BotoesOpcoesPanel botoesOpcoes;
	
	public BuscarProdutosOrdemProducaoPanel(){
		initialize();
	}
	
	public void initialize(){
		add(getPesquisaProdutoLabel());
		add(getPesquisaProdutoField());
		add(getBtBuscar());
		add(getQtdLabel());
		add(getQtdField());
		add(getBotoesOpcoes());
	}

	private JLabel getPesquisaProdutoLabel() {
		if(pesquisaProdutoLabel == null){
			pesquisaProdutoLabel = new JLabel();
			pesquisaProdutoLabel.setText("Código ou nome:");
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
			//TODO: implementar botao buscar
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
			qtdField.setColumns(20);
		}
		return qtdField;
	}

	private BotoesOpcoesPanel getBotoesOpcoes() {
		if(botoesOpcoes == null){
			botoesOpcoes = new BotoesOpcoesPanel();
			//TODO: implementar botoes
		}
		return botoesOpcoes;
	}
	
	
}
