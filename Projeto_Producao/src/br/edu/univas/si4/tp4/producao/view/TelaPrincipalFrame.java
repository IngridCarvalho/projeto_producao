package br.edu.univas.si4.tp4.producao.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.edu.univas.si4.tp4.producao.controller.Controller;

public class TelaPrincipalFrame extends JFrame {
	
	private static final long serialVersionUID = -2918957853484721298L;
	
	private Controller controller;
	
	private JLabel tituloLabel;
	private JButton btProdutos;
	private JButton btOrdemProducao;
	private JButton btRelatorios;
	
	private GridBagConstraints tituloLabelConstraints;
	private GridBagConstraints btProdutosConstraints;
	private GridBagConstraints btOrdemProducaoConstraints;
	private GridBagConstraints btRelatoriosConstraints;
	
	public TelaPrincipalFrame(Controller controller){
		super("Tela Principal");
		this.controller = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		setSize(700, 500);
		add(getTituloLabel(), getTituloLabelConstraints());
		add(getBtProdutos(), getBtProdutosConstraints());
		add(getBtOrdemProducao(), getBtOrdemProducaoConstraints());
		add(getBtRelatorios(), getBtRelatoriosConstraints());
		setVisible(true);
		
	}
	
	public JLabel getTituloLabel() {
		if(tituloLabel == null){
			tituloLabel = new JLabel();
			tituloLabel.setText("Produção");
		}
		return tituloLabel;
	}

	public JButton getBtProdutos(){
		if(btProdutos == null){
			btProdutos = new JButton();
			btProdutos.setText("Produtos"); 
			btProdutos.setPreferredSize(new Dimension(150, 100));
			btProdutos.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ProdutosClicked();
				}
			});
		}
		return btProdutos;
	}
	
	public JButton getBtOrdemProducao(){
		if(btOrdemProducao == null){
			btOrdemProducao = new JButton();
			btOrdemProducao.setText("Ordem de Produção");
			btOrdemProducao.setPreferredSize(new Dimension(150, 100));
		}
		
		return btOrdemProducao;
	}
	
	public JButton getBtRelatorios(){
		if(btRelatorios == null){
			btRelatorios = new JButton();
			btRelatorios.setText("Relatórios");
			btRelatorios.setPreferredSize(new Dimension(150, 100));
		}
		return btRelatorios;
		
	}
	
	private GridBagConstraints getTituloLabelConstraints() {
		if(tituloLabelConstraints == null){
			tituloLabelConstraints = new GridBagConstraints();
			tituloLabelConstraints.gridx = 1;
			tituloLabelConstraints.gridy = 0;
			tituloLabelConstraints.insets = new Insets(20, 20, 250, 20);
		}
		return tituloLabelConstraints;
	}

	private GridBagConstraints getBtProdutosConstraints() {
		if(btProdutosConstraints == null){
			btProdutosConstraints = new GridBagConstraints();
			btProdutosConstraints.gridx = 0;
			btProdutosConstraints.gridy = 1;
			btProdutosConstraints.insets = new Insets(20, 20, 20, 20);
		}
		return btProdutosConstraints;
	}

	private GridBagConstraints getBtOrdemProducaoConstraints() {
		if(btOrdemProducaoConstraints == null){
			btOrdemProducaoConstraints = new GridBagConstraints();
			btOrdemProducaoConstraints.gridx = 1;
			btOrdemProducaoConstraints.gridy = 1;
			btOrdemProducaoConstraints.insets = new Insets(20, 20, 20, 20);
		}
		return btOrdemProducaoConstraints;
	}

	private GridBagConstraints getBtRelatoriosConstraints() {
		if(btRelatoriosConstraints == null){
			btRelatoriosConstraints = new GridBagConstraints();
			btRelatoriosConstraints.gridx = 2;
			btRelatoriosConstraints.gridy = 1;
			btRelatoriosConstraints.insets = new Insets(20, 20, 20, 20);
		}
		return btRelatoriosConstraints;
	}

	public void ProdutosClicked(){
		controller.Produtos();
	}
}

