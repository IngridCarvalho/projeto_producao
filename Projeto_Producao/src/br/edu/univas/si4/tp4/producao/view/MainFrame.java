package br.edu.univas.si4.tp4.producao.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = -2918957853484721298L;
	
	private JButton btProdutos;
	private JButton btOrdemProducao;
	private JButton btRelatorios;
	
	public MainFrame(){
		super("Tela Principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	public void initialize(){
		setLayout(new FlowLayout());
		setSize(600, 140);
		add(getBtProdutos());
		add(getBtOrdemProducao());
		add(getBtRelatorios());
		
		setVisible(true);
		
	}
	
	public JButton getBtProdutos(){
		if(btProdutos == null){
			btProdutos = new JButton();
			btProdutos.setText("Produtos"); 
			btProdutos.setPreferredSize(new Dimension(150, 100));
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
}

