package br.edu.univas.si4.tp4.producao.controller;

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

}
