package com.capgemini.airlinereservationsystem.services;





import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.airlinereservationsystem.dao.IRegistrationDAO;
import com.capgemini.airlinereservationsystem.dao.RegistrationDAO;
import com.capgemini.airlinereservationsystem.dto.UserRegistration;

public class RegistrationImpl implements IRegistration {
    
	public void register(UserRegistration res) {
		
		IRegistrationDAO dao = new RegistrationDAO();
		dao.register(res);
		
		 
	}
	

}
