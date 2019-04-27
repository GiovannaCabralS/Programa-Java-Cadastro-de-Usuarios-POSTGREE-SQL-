package Banco; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class ConfigBD {
     public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/TrabalhoMarcos","postgres","556024");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
}