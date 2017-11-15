package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.controller.Controller;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerBuscar;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerCadastro;
import br.edu.univas.si4.tp4.producao.view.BotoesCadastroPanel;

public class IncluirOrdemProducaoFrame extends JFrame{
	
	private static final long serialVersionUID = -656793209816442646L;

	private Controller controller;
	
	private BuscarProdutosOrdemProducaoPanel buscaProdutos;
	private ListaProdutosProducaoPanel listaProdutos;
	private BotoesCadastroPanel botoesCadastroPanel;
	
	public IncluirOrdemProducaoFrame(Controller controller){
		super("Incluir Ordem de Produção");
		this.controller = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 500);
		setResizable(false);
		initialize();
		setLocationRelativeTo(null);
	}
	
	public void initialize(){
		add(getBuscaProdutos(), BorderLayout.NORTH);
		add(getListaProdutos(), BorderLayout.CENTER);
		add(getBotoesCadastroPanel(), BorderLayout.PAGE_END);
	}

	private BuscarProdutosOrdemProducaoPanel getBuscaProdutos() {
		if(buscaProdutos == null){
			buscaProdutos = new BuscarProdutosOrdemProducaoPanel();
			buscaProdutos.addButtonsListenerBuscar(new ButtonsListenerBuscar() {
				
				@Override
				public void buscarPerfomed() {
					buscarClicked();
				}
			});
		}
		return buscaProdutos;
	}

	private ListaProdutosProducaoPanel getListaProdutos() {
		if(listaProdutos == null){
			listaProdutos = new ListaProdutosProducaoPanel();
		}
		return listaProdutos;
	}

	private BotoesCadastroPanel getBotoesCadastroPanel() {
		if(botoesCadastroPanel == null){
			botoesCadastroPanel = new BotoesCadastroPanel();
			botoesCadastroPanel.addButtonsListener(new ButtonsListenerCadastro() {
				
				@Override
				public void confirmarPerfomed() {
					incluirClicked();
					
				}
				
				@Override
				public void cancelarPerformed() {
					cancelarClicked();
					
				}
			});
		}
		return botoesCadastroPanel;
	}
	private void buscarClicked(){
		JOptionPane.showMessageDialog(this, "Buscar");
		//TODO: implementar busca de produtos
	}
	private void incluirClicked() {
		JOptionPane.showMessageDialog(this, "Salvo com sucesso");
	}
	
	private void cancelarClicked(){
		System.exit(0);
	}
}
