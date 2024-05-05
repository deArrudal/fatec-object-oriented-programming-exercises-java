package view;

import java.sql.Connection;
import java.sql.SQLException;

import persistence.GenericDAOMySQL;

public class Main {
	public static void main(String[] args) {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();

		try {
			Connection conn = genericDAOMySQL.getConnection();

			String sgbd = conn.getMetaData().getDatabaseProductName();
			System.out.println(sgbd);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
