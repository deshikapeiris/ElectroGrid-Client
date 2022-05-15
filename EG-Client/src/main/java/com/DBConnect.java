package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	
		private final static String login = "root";
		private final static String password = "deshika";
		private final static String url ="jdbc:mysql://127.0.0.1:3306/electogrid";
		private static DBConnect instance = null;
		private Connection connection = null;

		private DBConnect() throws ClassNotFoundException {
			if (connection == null) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					connection = DriverManager.getConnection(url, login, password);
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}

		public static DBConnect getInstance() {
			if (instance == null) {
				try {
					instance = new DBConnect();
				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				}
			}
			return instance;
		}

		public Connection getConnection() {
			return connection;
		}

		public void closeConnection() {
			instance = null;
		}

	}



