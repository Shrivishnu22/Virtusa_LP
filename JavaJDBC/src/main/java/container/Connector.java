package container;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	static Connection con;

	public static Connection createc() {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection
			String user = "root";
			String password = "shrivishnu@22";
			String url = "jdbc:mysql://localhost:3306/shrivishnu";
			con = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
