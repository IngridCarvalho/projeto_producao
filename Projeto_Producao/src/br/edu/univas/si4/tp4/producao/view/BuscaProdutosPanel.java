package br.edu.univas.si4.tp4.producao.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class BuscaProdutosPanel extends JPanel{
	
	private static final long serialVersionUID = 7186043854237048421L;
	
	private JLabel buscaProdutos;
	private JTextField campoBusca;
	private JButton btBuscar;
	
	public BuscaProdutosPanel(){	
		initialize();
	}
	
	public void initialize(){
		setLayout(new FlowLayout());
		setBorder(new EmptyBorder(10, 10, 10, 10));
		add(getBuscaProdutos());
		add(getCampoBusca());
		add(getBtBuscar());
	}

	public JLabel getBuscaProdutos() {
		if(buscaProdutos == null){
			buscaProdutos = new JLabel();
			buscaProdutos.setText("Nome do Produto: ");
		}
		return buscaProdutos;
	}
	
	public JTextField getCampoBusca(){
		if(campoBusca == null){
			campoBusca = new JTextField();
			campoBusca.setColumns(43);
		}
		return campoBusca;
	}

	public JButton getBtBuscar() {
		if (btBuscar == null){
			btBuscar = new JButton();
			btBuscar.setText("Buscar");
		}
		return btBuscar;
	}
	
	
}
