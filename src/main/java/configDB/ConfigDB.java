package configDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
	private static final String URL ="jdbc:postgresql://localhost:5432/" ; //criar um tabela /banco de dados
	private static final String username ="postgres";
	private static final String password ="21328";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, username,password);
	}
}
