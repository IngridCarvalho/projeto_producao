package br.edu.univas.si4.tp4.producao.model;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {
	
	private Object[][] listaProdutos;


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
	
	
	public ArrayList<ProdutoTO> listarProdutos() throws ProdutoException{
		String sql = "SELECT CODIGO, NOME, QTD"
				+ " FROM PRODUTOS ORDER BY 1";
		ArrayList<ProdutoTO> listaProdutos = new ArrayList<ProdutoTO>();
		Connection conn = null;
		
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			ResultSet rs = prep.executeQuery();
			while(rs.next()){
				ProdutoTO to = new ProdutoTO();
				to.setCodigo(rs.getInt(1));
				to.setNome(rs.getString(2));
				to.setQtd(rs.getInt(3));
				listaProdutos.add(to);
			}
		}catch(SQLException e){
			throw new ProdutoException("Erro");
		}finally{
			DBUtil.closeConnection(conn);
		}
		return listaProdutos;
	}
	
	public ArrayList<ItensOrdemTO> relatorio() throws ProdutoException{
		String sql = "SELECT CODIGO, NOME, QTD, CUSTO, CUSTO_TOTAL"
				+ " FROM PRODUTOS, ITENSORDEMPRODUCAO"
				+ " WHERE PRODUTOS.CODIGO = ITENSORDEMPRODUCAO.CODIGO_ITEM";
		ArrayList<ItensOrdemTO> relatorio = new ArrayList<ItensOrdemTO>();
		Connection conn = null;
		
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			ResultSet rs = prep.executeQuery();
			while(rs.next()){
				ItensOrdemTO to = new ItensOrdemTO();
				to.setCodigo(rs.getInt(1));
				to.setNome(rs.getString(2));
				to.setQtd(rs.getInt(3));
				to.setCusto_unitario(rs.getFloat(3));
				to.setCusto_total(rs.getFloat(5));
			}
		}catch(SQLException e){
			throw new ProdutoException("Erro");
		}finally{
			DBUtil.closeConnection(conn);
		}
		return relatorio;
	}
}

