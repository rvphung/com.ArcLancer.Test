package com.ArcLancer.Test;

import java.sql.*;

import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;

public class SQLite {

	public Connection getConnection() throws SQLException {

		SQLiteConfig sqliteConfig = new SQLiteConfig();
		sqliteConfig.setSharedCache(true);
		sqliteConfig.enableRecursiveTriggers(true);

		SQLiteDataSource sqliteDataSource = new SQLiteDataSource(sqliteConfig);
		sqliteDataSource.setUrl("jdbc:sqlite:D:\\Test.db");

		return sqliteDataSource.getConnection();
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
