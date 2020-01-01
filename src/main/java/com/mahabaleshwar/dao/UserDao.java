package com.mahabaleshwar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;

public class UserDao {
	
	
	public boolean registerDao() {
		return false;
	}
	
	public static void main(String[] args) {
		
		// db parameters
		String url       = "jdbc:mysql://localhost:3306/hotel";
		String userName      = "root";
		String password  = "tiger";
		 
		Connection conn = null;
		try{
			 conn = DriverManager.getConnection(url, userName, password);
		} catch(SQLException e) {
		   System.out.println(e.getMessage());
		}	
		
		System.out.println("Connection Established");
	
	
		
		
	}

}
