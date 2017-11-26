package br.edu.univas.si4.tp4.producao.view.produtos;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.controller.Controller;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerCadastro;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;
import br.edu.univas.si4.tp4.producao.view.BotoesCadastroPanel;
import br.edu.univas.si4.tp4.producao.view.BotoesOpcoesPanel;

public class ProdutosFrame extends JFrame{

	private static final long serialVersionUID = 2393978203579456409L;
	
	private Controller controllerProdutos;
	
	private BuscaProdutosPanel buscaProdutos;
	private ListaProdutosPanel listaProdutos;
	private BotoesOpcoesPanel botoesProdutos;
	
	private CadastrarProdutosPanel cadastroProdutos;
	private ListaComponentesPanel listaComponentes;
	private BotoesCadastroPanel botoesCadastro;
	
	public ProdutosFrame(Controller controller){
		super("Produtos");
		controllerProdutos = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 500);
		setResizable(false);
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getBuscaProdutos(), BorderLayout.NORTH);
		add(getListaProdutos(), BorderLayout.CENTER);
		add(getBotoesProdutos(), BorderLayout.PAGE_END);
		setVisible(true);
	}

	public BuscaProdutosPanel getBuscaProdutos() {
		if(buscaProdutos == null){
			buscaProdutos = new BuscaProdutosPanel();
			//TODO: implementar botao de busca
		}
		return buscaProdutos;
		
	}

	public ListaProdutosPanel getListaProdutos(){
		if(listaProdutos == null){
			listaProdutos = new ListaProdutosPanel();
		}
		return listaProdutos;
	}

	public BotoesOpcoesPanel getBotoesProdutos() {
		if(botoesProdutos == null){
			botoesProdutos = new BotoesOpcoesPanel();
			botoesProdutos.addButtonsListenerProdutos(new ButtonsListenerOpcoesProdutos() {
				
				@Override
				public void incluirPerformed() {
					cadastrarClicked();
					
				}
				@Override
				public void alterarPerformed() {
					alterarClicked();
					
				}
				
				@Override
				public void excluirPerformed() {
					excluirClicked();
					
				}
			});
		}
		return botoesProdutos;
	}

	private CadastrarProdutosPanel getCadastroProdutos() {
		if(cadastroProdutos == null){
			cadastroProdutos = new CadastrarProdutosPanel();
			getBuscaProdutos().removeAll();
			getBuscaProdutos().revalidate();
		}
		return cadastroProdutos;
	}

	private ListaComponentesPanel getListaComponentes() {
		if(listaComponentes == null){
			listaComponentes = new ListaComponentesPanel();
			getListaProdutos().removeAll();
			getListaProdutos().revalidate();
		}
		return listaComponentes;
	}
	
	private BotoesCadastroPanel getBotoesCadastro() {
		if(botoesCadastro == null){
			botoesCadastro = new BotoesCadastroPanel();
			botoesCadastro.addButtonsListener(new ButtonsListenerCadastro() {
				
				@Override
				public void confirmarPerfomed() {
					confirmarClicked();
					
				}
				
				@Override
				public void cancelarPerformed() {
					cancelarClicked();
					
				}
			});
			getBotoesProdutos().removeAll();
			getBotoesProdutos().revalidate();
		}
		return botoesCadastro;
	}
	
	private void setBuscaProdutos(BuscaProdutosPanel buscaProdutos) {
		this.buscaProdutos = buscaProdutos;
	}

	private void setListaProdutos(ListaProdutosPanel listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	private void setBotoesProdutos(BotoesOpcoesPanel botoesProdutos) {
		this.botoesProdutos = botoesProdutos;
	}

	private void setCadastroProdutos(CadastrarProdutosPanel cadastroProdutos) {
		this.cadastroProdutos = cadastroProdutos;
	}

	private void setListaComponentes(ListaComponentesPanel listaComponentes) {
		this.listaComponentes = listaComponentes;
	}

	private void setBotoesCadastro(BotoesCadastroPanel botoesCadastro) {
		this.botoesCadastro = botoesCadastro;
	}

	public void cadastrarClicked(){
		setCadastroProdutos(null);
		setListaComponentes(null);
		setBotoesCadastro(null);
		add(getCadastroProdutos(), BorderLayout.NORTH);
		add(getListaComponentes(), BorderLayout.CENTER);
		add(getBotoesCadastro(), BorderLayout.PAGE_END);
		
	}
	
	public void alterarClicked(){
		JOptionPane.showMessageDialog(this, "Alterar");
	}
	public void excluirClicked(){
		JOptionPane.showMessageDialog(this, "Excluido com Sucesso");
	}
	
	public void confirmarClicked(){
		JOptionPane.showMessageDialog(this, "Salvo com sucesso");
	}
	
	public void cancelarClicked(){
		setBuscaProdutos(null);
		setListaProdutos(null);
		setBotoesProdutos(null);
		getCadastroProdutos().removeAll();
		getCadastroProdutos().revalidate();
		getListaComponentes().removeAll();
		getListaComponentes().revalidate();
		getBotoesCadastro().removeAll();
		getBotoesCadastro().revalidate();
		initialize();
	}
}
