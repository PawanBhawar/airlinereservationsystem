package com.capgemini.airlinereservationsystem.dao;

import java.util.Date;

import com.capgemini.airlinereservationsystem.dto.UserRegistration;

public interface IRegistrationDAO {
	
	public void register(UserRegistration reg);
//	public void login();

}
