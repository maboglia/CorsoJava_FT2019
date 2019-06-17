package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.Connessione;
import model.Libro;

public class LibroDAO implements LibroIDAO{


	Statement statement = null;
	ResultSet rs = null;
	
	ArrayList<Libro> libri = new ArrayList<>();
	
	
	@Override
	public Libro findOne(int idLibro) throws SQLException {

		Connessione.connetti();
		Libro l = null;
		String sql = LibroIDAO.QUERY_ONE + idLibro;
		System.out.println(sql);
		try {
			//2 chiedo alla connessione uno statement
			statement = Connessione.getMiaConn().createStatement();
			
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
		Connessione.chiudi();
		
		//ritorno il libro creato
		return l;
	}

	@Override
	public ArrayList<Libro> findAll() throws SQLException {

		Connessione.connetti();
		Libro l = null;
		String sql = LibroIDAO.QUERY_ALL;
		System.out.println(sql);
		try {
			//2 chiedo alla connessione uno statement
			statement = Connessione.getMiaConn().createStatement();
			
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
		Connessione.chiudi();
		
		//ritorno il libro creato
		return libri;
	}

	@Override
	public void addOne(Libro l) throws SQLException {

		Connessione.connetti();
		
		statement = Connessione.getMiaConn().createStatement();
		String sql = "insert into libro (titolo, prezzo) value ('"+l.getTitolo()+"',"+l.getPrezzo()+")";
		statement.executeUpdate(sql);
		//String titolo, int editoreId, int pagine, double prezzo
		Connessione.chiudi();
		
	}

	
	
}
