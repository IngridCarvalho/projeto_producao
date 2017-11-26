package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.controller.Controller;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerBuscar;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerCadastro;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;
import br.edu.univas.si4.tp4.producao.view.BotoesCadastroPanel;
import br.edu.univas.si4.tp4.producao.view.BotoesOpcoesPanel;

public class OrdemProducaoFrame extends JFrame{
	
	private static final long serialVersionUID = 6451558225153201405L;
	
	private Controller controller;
	
	private BuscaOrdemProducaoPanel buscaOrdemProducao;
	private ListaOrdemProducaoPanel listaOrdemProducao;
	private BotoesOpcoesPanel botoesOpcoes;
	
	private BuscarProdutosOrdemProducaoPanel buscaProdutos;
	private ListaProdutosProducaoPanel listaProdutos;
	private BotoesCadastroPanel botoesCadastroPanel;
	
	public OrdemProducaoFrame(Controller controller){
		super("Ordem de Produção");
		this.controller = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 500);
		setResizable(false);
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getBuscaOrdemProducao(), BorderLayout.NORTH);
		add(getListaOrdemProducao(), BorderLayout.CENTER);
		add(getBotoesOpcoes(), BorderLayout.PAGE_END);
	}

	private BuscaOrdemProducaoPanel getBuscaOrdemProducao() {
		if(buscaOrdemProducao == null){
			buscaOrdemProducao = new BuscaOrdemProducaoPanel();
			buscaOrdemProducao.addButtonsListenerBuscar(new ButtonsListenerBuscar() {
				
				@Override
				public void buscarPerfomed() {
					buscarClicked();
					
				}
			});
		}
		return buscaOrdemProducao;
	}

	private ListaOrdemProducaoPanel getListaOrdemProducao() {
		if(listaOrdemProducao == null){
			listaOrdemProducao = new ListaOrdemProducaoPanel();
			
		}
		return listaOrdemProducao;
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
			});;
			
		}
		return botoesOpcoes;
	}
	
	private BuscarProdutosOrdemProducaoPanel getBuscaProdutos() {
		if(buscaProdutos == null){
			buscaProdutos = new BuscarProdutosOrdemProducaoPanel();
			buscaProdutos.addButtonsListenerBuscar(new ButtonsListenerBuscar() {
				
				@Override
				public void buscarPerfomed() {
					buscarProdutosClicked();
				}
			});
			getBuscaOrdemProducao().removeAll();
			getBuscaOrdemProducao().revalidate();
		}
		return buscaProdutos;
	}

	private ListaProdutosProducaoPanel getListaProdutos() {
		if(listaProdutos == null){
			listaProdutos = new ListaProdutosProducaoPanel();
			getListaOrdemProducao().removeAll();
			getListaOrdemProducao().revalidate();
		}
		return listaProdutos;
	}

	private BotoesCadastroPanel getBotoesCadastroPanel() {
		if(botoesCadastroPanel == null){
			botoesCadastroPanel = new BotoesCadastroPanel();
			botoesCadastroPanel.addButtonsListener(new ButtonsListenerCadastro() {
				
				@Override
				public void confirmarPerfomed() {
					incluirProdutosClicked();
					
				}
				
				@Override
				public void cancelarPerformed() {
					cancelarClicked();
				}
			});
			getBotoesOpcoes().removeAll();
			getBotoesOpcoes().revalidate();
		}
		return botoesCadastroPanel;
	}
	
	private void setBuscaOrdemProducao(BuscaOrdemProducaoPanel buscaOrdemProducao) {
		this.buscaOrdemProducao = buscaOrdemProducao;
	}

	private void setListaOrdemProducao(ListaOrdemProducaoPanel listaOrdemProducao) {
		this.listaOrdemProducao = listaOrdemProducao;
	}

	private void setBotoesOpcoes(BotoesOpcoesPanel botoesOpcoes) {
		this.botoesOpcoes = botoesOpcoes;
	}

	private void setBuscaProdutos(BuscarProdutosOrdemProducaoPanel buscaProdutos) {
		this.buscaProdutos = buscaProdutos;
	}

	private void setListaProdutos(ListaProdutosProducaoPanel listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	private void setBotoesCadastroPanel(BotoesCadastroPanel botoesCadastroPanel) {
		this.botoesCadastroPanel = botoesCadastroPanel;
	}

	public void buscarClicked(){
		JOptionPane.showMessageDialog(this, "Busca de Ordens de Produção");
		//TODO: implementar busca de ordens de producao por descrição e período
	}
	
	public void incluirClicked(){
		add(getBuscaProdutos(), BorderLayout.NORTH);
		add(getListaProdutos(), BorderLayout.CENTER);
		add(getBotoesCadastroPanel(), BorderLayout.PAGE_END);
		setBuscaOrdemProducao(null);
		setListaOrdemProducao(null);
		setBotoesOpcoes(null);
	}
	
	public void excluirClicked(){
		JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
		//TODO: implementar exclusão de ordens de producao
	}
	
	public void alterarClicked(){
		JOptionPane.showMessageDialog(this, "Alterado");
		//TODO: implementar alteração das ordens de producao
	}
	
	private void buscarProdutosClicked(){
		JOptionPane.showMessageDialog(this, "Buscar");
		//TODO: implementar busca de produtos
	}
	private void incluirProdutosClicked() {
		JOptionPane.showMessageDialog(this, "Salvo com sucesso");
	}
	
	private void cancelarClicked(){
		getBuscaProdutos().removeAll();
		getBuscaProdutos().revalidate();
		getListaProdutos().removeAll();
		getListaProdutos().revalidate();
		getBotoesCadastroPanel().removeAll();
		getBotoesCadastroPanel().revalidate();
		setBuscaProdutos(null);
		setListaProdutos(null);
		setBotoesCadastroPanel(null);
		initialize();
	}
}
