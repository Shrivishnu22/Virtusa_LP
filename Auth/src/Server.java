

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Server
 */
@WebServlet("/Server")
public class Server extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shrivishnu","root","shrivishnu@22");  
			Statement stmt=con.createStatement();  
			String name=request.getParameter("uname"),pass=request.getParameter("upass");
			String sql = "insert into user (name,password)"+ " values (?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(sql);
			preparedStmt.setString (1, name);
			preparedStmt.setString (2, pass); 
			preparedStmt.execute();
			response.sendRedirect("index.html");
			con.close();  
			}
		catch(Exception e){ 
			System.out.println(e);
		}  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
