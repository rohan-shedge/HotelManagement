package com.mahabaleshwar.model;

import java.awt.image.BufferedImage;
import java.util.Date;

public class User {
	
	  private String  fname;
	  private String  lname ; 
	  private RoomType  roomType ; 
	  private Date  checkInDate ; 
	  private Date  checkOutDate ; 
	  private String  email ; 
	  private Date  dob ; 
	  private BufferedImage   signature ; 
	  private Gender  gender ; 
	  private Long  mobile ;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public BufferedImage getSignature() {
		return signature;
	}
	public void setSignature(BufferedImage signature) {
		this.signature = signature;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	} 
		  
	  
	

}
