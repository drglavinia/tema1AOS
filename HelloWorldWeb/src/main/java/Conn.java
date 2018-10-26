import java.sql.*;

public class Conn{
	
	static Connection connection=null;
	static String  username="postgres";
	static String password="1q2w3e";
	static String connectionURL="jdbc:postgresql://localhost:5432/Person";
	
	public static Connection getConnection()
	{
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection(connectionURL, username, password);
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
	
}
