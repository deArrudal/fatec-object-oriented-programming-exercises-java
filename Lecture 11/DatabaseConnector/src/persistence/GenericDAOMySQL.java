package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAOMySQL {

	private Connection conn;

	public GenericDAOMySQL() {
		super();
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost"; // server's ip
		String databaseName = "mysql";
		String username = "root";
		String password = "banana12";

		Class.forName("com.mysql.cj.jdbc.Driver"); // reference path for connection class

		conn = DriverManager.getConnection(String.format("jdbc:mysql://%s:3306/%s", hostName, databaseName), username,
				password);

		return conn;

	}

}
