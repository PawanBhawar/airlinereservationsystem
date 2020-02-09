package com.capgemini.airlinereservationsystem.factory;
import com.capgemini.airlinereservationsystem.dto.UserRegistration;
import com.capgemini.airlinereservationsystem.services.IRegistration;
import com.capgemini.airlinereservationsystem.services.RegistrationImpl;


public class FUserRegistration {

	public static IRegistration registration(String type) {
		
		if(type.equalsIgnoreCase("one")) {
			return new RegistrationImpl();
		}
		return null;
	}
}
