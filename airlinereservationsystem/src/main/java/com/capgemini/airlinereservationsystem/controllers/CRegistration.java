package com.capgemini.airlinereservationsystem.controllers;

import java.security.KeyStore.PasswordProtection;
import java.sql.Date;
import java.text.DateFormat;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.dto.UserRegistration;
import com.capgemini.airlinereservationsystem.services.RegistrationImpl;

public class CRegistration {
	Scanner sc = new Scanner(System.in);
	static Logger log = LogManager.getLogger("User");

	public void enterDetails(UserRegistration res) {
		log.info("Hello User,Give your Information");
		log.info("Enter User Id");
		int id = sc.nextInt();
		res.setUserid(id);
		log.info("Enter User Type");
		String usertype = sc.next();
		res.setUsertype(usertype);
		log.info("Enter title");
		String title = sc.next();
		res.setTitle(title);
		log.info("Enter your Name");
		String name = sc.next();
		res.setFname(name);
		log.info("Enter your Last Name");
		String lname = sc.next();
		res.setLname(lname);
		log.info("Enter your Date Of Birth");
//	   Date date =  DateFormat.parse(sc.nextLine());
		log.info("Enter Nationality");
		String name2 = sc.next();
		res.setNationality(name2);
		log.info("Enter Email");
		String email = sc.next();
		res.setEmail(email);
		log.info("Enter Password");
		String pass = sc.next();
		res.getPassword();
	

	}

}
