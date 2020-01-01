package com.mahabaleshwar.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mahabaleshwar.model.Gender;
import com.mahabaleshwar.model.RoomType;
import com.mahabaleshwar.model.User;

public class RegisterUser extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		  System.out.println("In Get Servlet");
		  PrintWriter out = res.getWriter();
		  
		  String fname = req.getParameter("fname");
		  String lname = req.getParameter("lname");
		  String roomType = req.getParameter("roomType");
		  String checkInDate = req.getParameter("checkInDate");
		  String checkOutDate = req.getParameter("checkOutDate");
		  String email = req.getParameter("email");
		  String dob = req.getParameter("bday");
		  String massupload = req.getParameter("file");
	//	  String signature = req.getParameter("signature");
		  String gender = req.getParameter("gender");
		  String mobile = req.getParameter("mobile");
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		   User user = new User();
		   user.setFname(fname);
		   user.setLname(lname);
		   user.setRoomType(RoomType.valueOf(roomType));
		   try {
			user.setCheckInDate(sdf.parse(checkInDate));
 		    user.setCheckOutDate(sdf.parse(checkOutDate));

		   } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   user.setEmail(email);
		   user.setGender(Gender.valueOf(gender));
		   user.setMobile(Long.parseLong(mobile.trim()));
		   out.println("Registration Done by Get");
		  
	  	  
	}
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		 System.out.println("In Post Servlet");
		  PrintWriter out = res.getWriter();
		  out.println("Registration Done by Post");
		  	
	}
	
}
