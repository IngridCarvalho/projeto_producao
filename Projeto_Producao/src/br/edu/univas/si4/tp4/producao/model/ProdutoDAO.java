package br.edu.univas.si4.tp4.producao.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {
	
	public void insertNewProduto(ProdutoTO to)
		throws ProdutoException{
			String sentenca = "INSERT INTO PRODUTOS "
					+ "(CODIGO, NOME, QTD, PRECO_CUSTO, PRECO_VENDA, TIPO_PRODUTO)"
					+ "VALUES (?, ?, ?, ?, ?, ?)";
		
	Connection conn = null;
		try{
			conn = DBUtil.openConnection();
			
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setInt(1, to.getCodigo());
			prepStat.setString(2, to.getNome());
			prepStat.setFloat(3, to.getQtd());
			prepStat.setFloat(4, to.getPreco_custo());
			prepStat.setFloat(5, to.getPreco_venda());
			prepStat.setInt(6, to.getTipo_produto());
			prepStat.execute();
		}catch(Exception e){
			throw new ProdutoException("Erro salvando produto" + to.getNome(), e);
		}finally{
			DBUtil.closeConnection(conn);
		}
	}
}

