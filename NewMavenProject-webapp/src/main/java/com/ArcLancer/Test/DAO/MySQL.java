package com.ArcLancer.Test.DAO;

import java.sql.*;

public class MySQL {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	public Connection getConnection() throws SQLException {

		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		connection = DriverManager.getConnection(DB_URL, USER, PASS);

		return connection;
	}

	public void createTable(Connection connection) throws SQLException {

		String stringSqlString = "DROP TABLE IF EXISTS Test; CREATE TABLE Test (_id integer, Name string); ";
		Statement statement = null;
		statement = connection.createStatement();
		statement.executeUpdate(stringSqlString);
	}

	public void insert(Connection connection, int int_id, String stringName) throws SQLException {

		String stringSqlString = "INSERT INTO Test (_id, Name) VALUES(?, ?) ";

		PreparedStatement preparedStatement = null;
		preparedStatement = connection.prepareStatement(stringSqlString);

		int idx = 1;
		preparedStatement.setInt(idx++, int_id);
		preparedStatement.setString(idx++, stringName);
		preparedStatement.executeUpdate();
	}

	public String selectAll(Connection connection) throws SQLException {

		String stringSqlString = "SELECT * FROM Test ";
		String stringResultSet = null;

		Statement statement = null;
		ResultSet resultSet = null;
		statement = connection.createStatement();
		resultSet = statement.executeQuery(stringSqlString);

		while (resultSet.next()) {
			stringResultSet += resultSet.getInt("_id") + "\t" + resultSet.getString("Name");
		}

		return stringResultSet;
	}
}
