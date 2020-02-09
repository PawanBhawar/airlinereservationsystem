package com.capgemini.airlinereservationsystem.dto;

import java.sql.Date;

public class UserRegistration {
	private int userId;
	private String userType;
	private String title;
	private String fname;
	private String lname;
	private Date date;
	private String nationality;
	private String email;
	private int contact;
	private String password;

	public int getUserid() {
		return userId;
	}

	public void setUserid(int userid) {
		this.userId = userid;
	}

	public String getUsertype() {
		return userType;
	}

	public void setUsertype(String usertype) {
		this.userType = usertype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contact;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "UserRegistration [userId=" + userId + ", userType=" + userType + ", title=" + title + ", fname=" + fname
				+ ", lname=" + lname + ", date=" + date + ", nationality=" + nationality + ", email=" + email
				+ ", contact=" + contact + ", password=" + password + "]";
	}

}
