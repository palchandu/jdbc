package mypack;
import java.sql.*;
public class ConnrctionProvider {

	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","");
		return con;
		
	}
	
}
