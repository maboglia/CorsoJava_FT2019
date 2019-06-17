package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Libro;

public class LibroDAO implements LibroIDAO{

	Connessione conn = new Connessione();
	Statement statement = null;
	ResultSet rs = null;
	
	ArrayList<Libro> libri = new ArrayList<>();
	
	
	@Override
	public Libro findOne(int idLibro) throws SQLException {

		conn.connetti();
		Libro l = null;
		String sql = LibroIDAO.QUERY_ONE + idLibro;
		System.out.println(sql);
		try {
			//2 chiedo alla connessione uno statement
			statement = conn.getMiaConn().createStatement();
			
			//3 passo la richiesta allo statemente
			rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				//4) leggo il result set e memorizzo i valori
				String titolo = rs.getString("titolo");
				int editoreId = rs.getInt("editore_id");
				int pagine = rs.getInt("pagine");
				double prezzo = rs.getDouble("prezzo");
				
				//creo un libro l da ritornare
				 l = new Libro(titolo, editoreId, pagine, prezzo);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		conn.chiudi();
		
		//ritorno il libro creato
		return l;
	}

	@Override
	public ArrayList<Libro> findAll() throws SQLException {

		conn.connetti();
		Libro l = null;
		String sql = LibroIDAO.QUERY_ALL;
		System.out.println(sql);
		try {
			//2 chiedo alla connessione uno statement
			statement = conn.getMiaConn().createStatement();
			
			//3 passo la richiesta allo statemente
			rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				//4) leggo il result set e memorizzo i valori
				String titolo = rs.getString("titolo");
				int editoreId = rs.getInt("editore_id");
				int pagine = rs.getInt("pagine");
				double prezzo = rs.getDouble("prezzo");
				
				//creo un libro l da ritornare
				 l = new Libro(titolo, editoreId, pagine, prezzo);
				 libri.add(l);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		conn.chiudi();
		
		//ritorno il libro creato
		return libri;
	}

	@Override
	public void addOne(Libro l) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	
	
}
