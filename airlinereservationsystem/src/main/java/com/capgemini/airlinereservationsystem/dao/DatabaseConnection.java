package com.capgemini.airlinereservationsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static Connection initializeConnection()
			throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		String dburl = "jdbc:mysql://localhost:3306/airline_reservation_system";

		Connection conn = DriverManager.getConnection(dburl, "root", "root");
		
		return conn;

	}
}
