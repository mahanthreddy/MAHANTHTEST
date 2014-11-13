package wiseswan;
import java.io.InputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ConnectionManager {
	
			private static ConnectionManager instance = null;
			
			//private final String USERNAME = 	"root";
			//private final String PASSWORD = 	"password";
			//private final String CONN_STRING = "jdbc:mysql://localhost/mahatest";
			
			private Connection conn = null;
			
			private ConnectionManager()
			{
				
			}
			
			public static ConnectionManager getInstance()
			{
				if(instance == null)
				{
					instance = new ConnectionManager();
				}
				return instance;
			}
			private boolean openConnection(){
				try
				{
					Properties prop = new Properties();
					InputStream fileinput = getClass().getClassLoader().getResourceAsStream("config.properties");
					prop.load(fileinput);
					
					final String USERNAME = prop.getProperty("username");
					final String PASSWORD = prop.getProperty("password");
					final String CONN_STRING = "jdbc:mysql://"+prop.getProperty("hostname")+"/"+prop.getProperty("databasename");
					
					
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
				} catch (ClassNotFoundException | SQLException |IOException e) {
					
					e.printStackTrace();
				}
				return true;
			}
			public Connection getConnection(){
					if(conn == null)
					{
						if(openConnection())
						{
								return conn;
						}else
						
						{
							return null;
						}
					}
					return conn;
			}
			public void close(){
				
				try {
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				conn = null;
			}
}