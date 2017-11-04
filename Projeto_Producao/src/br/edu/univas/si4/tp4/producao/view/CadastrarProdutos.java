package br.edu.univas.si4.tp4.producao.view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastrarProdutos extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JLabel nomeLabel;
	private JTextField nomeField;
	private JLabel precoCustoLabel;
	private JTextField precoCustoField;
	private JLabel precoVendaLabel;
	private JTextField precoVendaField;
	private JRadioButton tipoProdutoComp;
	private JRadioButton tipoProdutoMp;
	private ButtonGroup tipoGrupo;
	private JButton btConfirmar;
	private JButton btCancelar;
	
	public CadastrarProdutos(){
		super("Cadastro");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 600);
		setResizable(false);
		pack();
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getNomeLabel());
		add(getNomeField());
		add(getPrecoCustoLabel());
		add(getPrecoCustoField());
		add(getPrecoVendaLabel());
		add(getPrecoVendaField());
		add(getTipoProdutoComp());
		add(getTipoProdutoMp());
		add(getBtConfirmar());
		add(getBtCancelar());
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
			nomeField.setColumns(30);
		}
		return nomeField;
	}
	public JLabel getPrecoCustoLabel() {
		if(precoCustoLabel == null){
			precoCustoLabel = new JLabel();
			precoCustoLabel.setText("Preço de Custo");
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
	public JButton getBtConfirmar() {
		if(btConfirmar == null){
			btConfirmar = new JButton();
			btConfirmar.setText("Confirmar");
		}
		return btConfirmar;
	}
	public JButton getBtCancelar() {
		if(btCancelar == null){
			btCancelar = new JButton();
			btCancelar.setText("Cancelar");
		}
		return btCancelar;
	}
	
	
}
