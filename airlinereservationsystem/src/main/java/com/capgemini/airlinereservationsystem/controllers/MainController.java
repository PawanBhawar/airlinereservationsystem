package com.capgemini.airlinereservationsystem.controllers;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.dto.UserRegistration;
import com.capgemini.airlinereservationsystem.factory.FUserRegistration;
import com.capgemini.airlinereservationsystem.services.IRegistration;
import com.capgemini.airlinereservationsystem.services.RegistrationImpl;

public class MainController {

	static Logger log = LogManager.getLogger("User");

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		log.info("Welcome to Home Page");
		Thread.sleep(3000);
		log.info("Choose the below Option");
		Thread.sleep(2000);
		log.info("Press 1 for HomePage");
		Thread.sleep(1000);
		log.info("Press 2 for Flight Schedule");
		Thread.sleep(1000);
		log.info("Press 3 for Registration");
		Thread.sleep(1000);
		log.info("Press 4 for Login ");
		int key = sc.nextInt();

		switch (key) {
		case 1:
			CRegistration re = new CRegistration();
			UserRegistration res = new UserRegistration();
			re.enterDetails(res);
			IRegistration reg = FUserRegistration.registration("one");
			reg.register(res);

			break;
		case 2:
//				log.info("Press 1 for HomePage");
			break;
		case 3:
//				log.info("Press 1 for HomePage");
			break;////
		case 4:
//				log.info("Press 4 for Login ");
			break;

		default:
			sc.close();
//			    throw new InvalidInputException();

		}

	}

}
