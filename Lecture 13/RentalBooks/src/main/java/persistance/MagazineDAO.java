package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Magazine;

public class MagazineDAO implements ICRUD<Magazine> {
	private GenericDAOMySQL genericDAOMySQL;

	public MagazineDAO(persistance.GenericDAOMySQL genericDAOMySQL) {
		super();
		this.genericDAOMySQL = genericDAOMySQL;
	}

	@Override
	public void register(Magazine magazine) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "INSERT INTO exemplar VALUES (?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, magazine.getExemplarId());
		preparedStatement.setString(2, magazine.getExemplarName());
		preparedStatement.setInt(3, magazine.getExemplarPages());
		preparedStatement.execute();

		cmdSQL = "INSERT INTO magazine VALUES (?, ?)";
		preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, magazine.getMagazineISSN());
		preparedStatement.setInt(2, magazine.getExemplarId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public void update(Magazine magazine) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "UPDATE exemplar SET name = ?, pages = ? WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, magazine.getExemplarName());
		preparedStatement.setInt(2, magazine.getExemplarPages());
		preparedStatement.setInt(3, magazine.getExemplarId());
		preparedStatement.execute();

		cmdSQL = "UPDATE book SET issn = ? WHERE exemplarId = ?";
		preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, magazine.getMagazineISSN());
		preparedStatement.setInt(3, magazine.getExemplarId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public void remove(Magazine magazine) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		String cmdSQL = "DELETE FROM exemplar WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, magazine.getExemplarId());
		preparedStatement.execute();

		preparedStatement.close();
		conn.close();
	}

	@Override
	public Magazine search(Magazine magazine) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();

		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT exemplar.id AS id, exemplar.name AS name, exemplar.pages AS pages, ");
		cmdSQL.append("magazine.issn AS issn ");
		cmdSQL.append("FROM exemplar, magazine ");
		cmdSQL.append("WHERE exemplar.id = magazine.exemplarId ");
		cmdSQL.append("AND exemplar.id = ?");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		preparedStatement.setInt(1, magazine.getExemplarId());
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			magazine.setExemplarId(resultSet.getInt("id"));
			magazine.setExemplarName(resultSet.getString("name"));
			magazine.setExemplarPages(resultSet.getInt("pages"));
			magazine.setMagazineISSN(resultSet.getString("issn"));
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return magazine;
	}

	@Override
	public List<Magazine> list() throws SQLException, ClassNotFoundException {
		List<Magazine> magazines = new ArrayList<>();

		Connection conn = genericDAOMySQL.getConnection();

		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT exemplar.id AS id, exemplar.name AS name, exemplar.pages AS pages, ");
		cmdSQL.append("magazine.issn AS issn ");
		cmdSQL.append("FROM exemplar, magazine ");
		cmdSQL.append("WHERE exemplar.id = magazine.exemplarId ");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Magazine magazine = new Magazine(resultSet.getInt("id"), resultSet.getString("name"),
					resultSet.getInt("pages"), resultSet.getString("issn"));

			magazines.add(magazine);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return magazines;
	}
}
