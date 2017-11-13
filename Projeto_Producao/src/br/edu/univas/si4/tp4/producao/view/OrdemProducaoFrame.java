package br.edu.univas.si4.tp4.producao.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si4.tp4.producao.controller.Controller;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;

public class OrdemProducaoFrame extends JFrame{
	
	private static final long serialVersionUID = 6451558225153201405L;
	
	private Controller controller;
	
	private BuscaOrdemProducaoPanel buscaOrdemProducao;
	private ListaOrdemProducaoPanel listaOrdemProducao;
	private BotoesOpcoesPanel botoesOpcoes;
	
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
			//TODO: Implementar botao buscar
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
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void alterarPerformed() {
					// TODO Auto-generated method stub
					
				}
			});;
			
		}
		return botoesOpcoes;
	}
	
	public void incluirClicked(){
		controller.IncluirOrdemProducao();;
	}
}
