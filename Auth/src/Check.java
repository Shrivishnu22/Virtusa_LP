

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shrivishnu","root","shrivishnu@22");  
			Statement stmt=con.createStatement();  
			PrintWriter out = response.getWriter();
			String name=request.getParameter("uname"),pass=request.getParameter("upass");
			ResultSet rs=stmt.executeQuery("select * from user where name='"+name+"' and password='"+pass+"'");
			if(rs.next()){
				out.println("Welcome "+name);
			}
			else{
				out.println("Try Again");
			}
			con.close();  
			}
		catch(Exception e){ 
			System.out.println(e);
		}  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
