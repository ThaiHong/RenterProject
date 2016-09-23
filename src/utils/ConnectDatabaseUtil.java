package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectDatabaseUtil {
	private Connection conn;
	private String user,password,url;
	public ConnectDatabaseUtil() {
		ReadPropertiesUtil readProperties = new ReadPropertiesUtil();
		Properties props = readProperties.getProperties();
		
		user = props.getProperty("user");
		password = props.getProperty("password");
		url = props.getProperty("url");
	}
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
