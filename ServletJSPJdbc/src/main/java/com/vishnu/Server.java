package com.vishnu;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vishnu.dao.UserDAO;
import com.vishnu.model.User;

/**
 * Servlet implementation class Server
 */
public class Server extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		UserDAO dao = new UserDAO();
		User user = dao.getUser(id);
		
		request.setAttribute("secret",user);
		
		RequestDispatcher rd = request.getRequestDispatcher("displayUser.jsp");
		rd.forward(request, response);
	}

	
}
