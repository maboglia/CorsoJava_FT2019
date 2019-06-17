package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Libro;

public interface LibroIDAO {
	
	//gli attributi di un'interfaccia sono per definizione final e public
	String QUERY_ALL = "select * from libro";
	String QUERY_ONE = "select * from libro where libro_id = ";
	
	Libro findOne(int idLibro) throws SQLException; 
	ArrayList<Libro> findAll() throws SQLException;
	void addOne(Libro l) throws SQLException;
	

}
