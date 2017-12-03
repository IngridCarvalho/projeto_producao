package br.edu.univas.si4.tp4.producao.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrdemProducaoDAO {
	
	public ArrayList<ListaOrdemTO> listaOrdens() throws DBException{
		String sql = "SELECT NUMERO, DESCRICAO, DATA_FINALIZACAO, STATUS"
					+ " FROM ORDEMPRODUCAO";
		
		ArrayList<ListaOrdemTO> listaOrdem = new ArrayList<>();
		
		Connection conn = null;
		
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			ResultSet rs = prep.executeQuery();
			//System.out.println(prep);
			while(rs.next()){
				ListaOrdemTO to = new ListaOrdemTO();
				to.setNumero(rs.getInt(1));
				to.setDescricao(rs.getString(2));
				to.setData(rs.getDate(3));
				to.setSituacao(rs.getBoolean(4));
				listaOrdem.add(to);
			}
		}catch(SQLException e){
			throw new DBException("Erro" + e);
		}finally{
			DBUtil.closeConnection(conn);
		}
		return listaOrdem;
	}
	
	public void insertNewOrdem(OrdemProducaoTO to)
			throws DBException{
				String sentenca = "INSERT INTO ORDEMPRODUCAO "
						+ "(NUMERO, DESCRICAO, DATA_EMISSAO, DATA_FINALIZACAO, STATUS)"
						+ "VALUES (?, ?, ?, ?, ?)";
		
				Connection conn = null;
		
			try{
				conn = DBUtil.openConnection();
				
				PreparedStatement prepStat = conn.prepareStatement(sentenca);
				
				prepStat.setInt(1, to.getNumero());
				prepStat.setString(2, to.getDescricao());
				prepStat.setDate(3, to.getDataEmissao());
				prepStat.setDate(4, to.getDataFinalizacao());
				prepStat.setBoolean(5, to.isStatus());
				prepStat.execute();
			}catch(Exception e){
				throw new DBException("Erro salvando produto" + to.getNumero(), e);
			}finally{
				DBUtil.closeConnection(conn);
			}
		}

}
