package com.capgemini.airlinereservationsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import com.capgemini.airlinereservationsystem.dto.UserRegistration;
import com.mysql.jdbc.Driver;

public class RegistrationDAO implements IRegistrationDAO {

	Connection conn = null;
	PreparedStatement stmt = null;

	public void register(UserRegistration reg) {

		try {
			Connection conn = DatabaseConnection.initializeConnection();
			String query = "insert into user_registration values(?,?,?,?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, reg.getUserid());
			stmt.setString(2, reg.getUsertype());
			stmt.setString(3, reg.getTitle());
			stmt.setString(4, reg.getFname());
			stmt.setString(5, reg.getLname());
			stmt.setDate(6, reg.getDate());
			stmt.setString(7, reg.getNationality());
			stmt.setString(8, reg.getEmail());
			stmt.setInt(9, reg.getContact());
			stmt.setString(10, reg.getPassword());

			int count = stmt.executeUpdate();
			System.out.println("Successfully Inserted");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
