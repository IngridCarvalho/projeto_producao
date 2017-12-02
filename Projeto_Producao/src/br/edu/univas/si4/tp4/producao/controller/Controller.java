package br.edu.univas.si4.tp4.producao.controller;

import javax.swing.JOptionPane;

import br.edu.univas.si4.tp4.producao.model.ProdutoDAO;
import br.edu.univas.si4.tp4.producao.model.ProdutoException;
import br.edu.univas.si4.tp4.producao.model.ProdutoTO;
import br.edu.univas.si4.tp4.producao.view.TelaPrincipalFrame;
import br.edu.univas.si4.tp4.producao.view.ordemProducao.OrdemProducaoFrame;
import br.edu.univas.si4.tp4.producao.view.produtos.ProdutosFrame;
import br.edu.univas.si4.tp4.producao.view.relatorios.RelatoriosFrame;

public class Controller {
	
	private TelaPrincipalFrame mainFrame;
	private ProdutosFrame produtosFrame;
	private OrdemProducaoFrame ordemProducaoFrame;
	private RelatoriosFrame relatoriosFrame;

	public Controller(){
		mainFrame = new TelaPrincipalFrame(this);
	}
	
	public void initialize(){
		mainFrame.setVisible(true);
	}
	
	public void OrdemProducao() {
		ordemProducaoFrame = new OrdemProducaoFrame(this);
		ordemProducaoFrame.setVisible(true);
	}

	public void Produtos() {
		produtosFrame = new ProdutosFrame(this);
	}

	public void Relatorios() {
		relatoriosFrame = new RelatoriosFrame();
		
	}

	public void cadastrarProdutoClicked() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		ProdutoTO produtoTO = new ProdutoTO();
		produtoTO = produtosFrame.getCadastroProdutos().getProduto();
		try{
			produtoDAO.insertNewProduto(produtoTO);
		}catch(ProdutoException	e){
			System.out.println("Erro salvando área de pesquisa.");
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(mainFrame, "Salvo com Sucesso");
		
	}
	
	public void alterarProdutoClicked(Object codigo){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		ProdutoTO produtoTO = new ProdutoTO();
		
	}
	
	public void excluirProdutoClicked(int codigo){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		try{
			produtoDAO.deleteProduto(codigo);
			System.out.println("Excluido com sucesso!");
			JOptionPane.showMessageDialog(mainFrame, "Excluido com Sucesso");
		}catch(ProdutoException e){
			System.out.println("Erro ao excluir produto");
			JOptionPane.showMessageDialog(mainFrame, "Erro ao excluir");
			e.printStackTrace();
		}
		
	}

}
