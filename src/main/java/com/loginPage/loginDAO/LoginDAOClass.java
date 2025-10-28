package com.loginPage.loginDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAOClass {
 
	String sqlQuery = " select * from login_info where uName = ? and pass = ?";
	String url = "jdbc:mysql://localhost:3306/logindb";
	String userName= "root";
	String password = "#Hentaifan2002";
	
	public boolean checkLogin(String uName, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, uName);
			statement.setString(2, pass);
			ResultSet rs = statement.executeQuery();

			if(rs.next()) {
				return true;
			}
		    } 
		catch (Exception e) {
			e.getMessage();
		    }
		
		    return true;
	}
}
