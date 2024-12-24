package configDB;
import configDB.ConfigDB;
import java.sql.Connection;
import java.sql.SQLException;

public class InitializerDB {
	public static void initialize() {
	try(Connection connection = ConfigDB.getConnection()){
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	}
}
