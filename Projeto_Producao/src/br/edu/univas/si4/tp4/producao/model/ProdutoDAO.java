package br.edu.univas.si4.tp4.producao.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {



	public void insertNewProduto(ProdutoTO to)
		throws DBException{
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
			throw new DBException("Erro salvando produto" + to.getNome(), e);
		}finally{
			DBUtil.closeConnection(conn);
		}
	}
	
	
	public ArrayList<ProdutoTO> listarProdutos() throws DBException{
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
			throw new DBException("Erro");
		}finally{
			DBUtil.closeConnection(conn);
		}
		return listaProdutos;
	}
	
	public void deleteProduto(int codigo) throws DBException{
		String sql = "DELETE FROM PRODUTOs WHERE CODIGO = ?";
		Connection conn = null;
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			prep.setInt(1, codigo);
			prep.execute();
		}catch(SQLException e){
			throw new DBException("Erro ao excluir produto: " + codigo);
		}finally{
			DBUtil.closeConnection(conn);
		}
	}
	
	public ArrayList<ItensOrdemTO> relatorioProdutos() throws DBException{
		String sql = "SELECT CODIGO, NOME, QTD, CUSTO_UNITARIO, CUSTO_TOTAL"
				+ " FROM PRODUTOS, ITENSORDEMPRODUCAO, ORDEMPRODUCAO"
				+ " WHERE PRODUTOS.CODIGO = ITENSORDEMPRODUCAO.CODIGO_ITEM"
				+ " AND ITENSORDEMPRODUCAO.NUMERO_ORDEM = ORDEMPRODUCAO.NUMERO";
				//+ " AND NOME LIKE ? ORDER BY 2";
		
		ArrayList<ItensOrdemTO> relatorio = new ArrayList<ItensOrdemTO>();
		Connection conn = null;
		
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			//prep.setString(1, "%" + nome + "%");
			
			ResultSet rs = prep.executeQuery();
			
			while(rs.next()){
				ItensOrdemTO to = new ItensOrdemTO();
				to.setCodigo(rs.getInt(1));
				to.setNome(rs.getString(2));
				to.setQtd(rs.getInt(3));
				to.setCusto_unitario(rs.getFloat(4));
				to.setCusto_total(rs.getFloat(5));
				relatorio.add(to);
			}
		}catch(SQLException e){
			throw new DBException("Erro" + e);
		}finally{
			DBUtil.closeConnection(conn);
		}
		return relatorio;
	}
	
	
}

