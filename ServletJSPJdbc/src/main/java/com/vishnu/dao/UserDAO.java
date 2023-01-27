package com.vishnu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.vishnu.model.User;

public class UserDAO {
	public User getUser(int id){
		User user = new User();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shrivishnu","root","shrivishnu@22");  
			Statement stmt=con.createStatement(); 
			ResultSet rs = stmt.executeQuery("Select * from xdata where id="+id);
			if(rs.next()){
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setCountry(rs.getString("country"));
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		return user;
	}
}
