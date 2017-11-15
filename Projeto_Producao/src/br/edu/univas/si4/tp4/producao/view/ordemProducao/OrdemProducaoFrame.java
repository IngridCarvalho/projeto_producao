package br.edu.univas.si4.tp4.producao.view.ordemProducao;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.controller.Controller;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerBuscar;
import br.edu.univas.si4.tp4.producao.listener.ButtonsListenerOpcoesProdutos;
import br.edu.univas.si4.tp4.producao.view.BotoesOpcoesPanel;

public class OrdemProducaoFrame extends JFrame{
	
	private static final long serialVersionUID = 6451558225153201405L;
	
	private Controller controller;
	
	private BuscaOrdemProducaoPanel buscaOrdemProducao;
	private ListaOrdemProducaoPanel listaOrdemProducao;
	private BotoesOpcoesPanel botoesOpcoes;
	
	public OrdemProducaoFrame(Controller controller){
		super("Ordem de Produ��o");
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
	
	public void buscarClicked(){
		JOptionPane.showMessageDialog(this, "Busca de Ordens de Produ��o");
		//TODO: implementar busca de ordens de producao por descri��o e per�odo
	}
	
	public void incluirClicked(){
		controller.IncluirOrdemProducao();;
	}
	
	public void excluirClicked(){
		JOptionPane.showMessageDialog(this, "Exclu�do com sucesso!");
		//TODO: implementar exclus�o de ordens de producao
	}
	
	public void alterarClicked(){
		JOptionPane.showMessageDialog(this, "Alterado");
		//TODO: implementar altera��o das ordens de producao
	}
}