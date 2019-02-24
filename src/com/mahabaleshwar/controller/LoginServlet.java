package com.mahabaleshwar.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		 System.out.println("In Login Servlet");
		  PrintWriter out = res.getWriter();
		  out.println("Login SuccessFul");
		  
	}

}
