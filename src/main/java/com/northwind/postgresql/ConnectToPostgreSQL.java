package com.northwind.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToPostgreSQL {

	public static void main(String[] args) {
		System.out.println("-------- PostgreSQL " + "JDBC Connection Testing ------------");
		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		System.out.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

//			connection = DriverManager.getConnection(
//					"jdbc:postgresql://ec2-54-217-231-152.eu-west-1.compute.amazonaws.com:5432",
//					"cdovxiwmdqramm",
//					"kMl84snnPirPElWkt49Avo1PC1");
			connection = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306",
			"root",
			"nsaad");
	
		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}
}
