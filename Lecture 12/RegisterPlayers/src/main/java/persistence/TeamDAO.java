package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Team;

public class TeamDAO implements ICRUD<Team> {

	private GenericDAOMySQL genericDAOMySQL;

	public TeamDAO(GenericDAOMySQL genericDAOMySQL) {
		super();
		this.genericDAOMySQL = genericDAOMySQL;
	}

	@Override
	public void register(Team team) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "INSERT INTO team VALUES (?, ?, ?)";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, team.getTeamId());
		preparedStatement.setString(2, team.getTeamName());
		preparedStatement.setString(3, team.getTeamCityName());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public void update(Team team) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "UPDATE team SET name = ?, cityName = ? WHERE id = ?";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, team.getTeamName());
		preparedStatement.setString(2, team.getTeamCityName());
		preparedStatement.setInt(3, team.getTeamId());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public void remove(Team team) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "DELETE FROM team WHERE id = ?";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, team.getTeamId());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public Team search(Team team) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "SELECT id, name, cityName FROM team WHERE id = ?";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, team.getTeamId());
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			team.setTeamId(resultSet.getInt("id"));
			team.setTeamName(resultSet.getString("name"));
			team.setTeamCityName(resultSet.getString("cityName"));
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return team;
	}

	@Override
	public List<Team> list() throws SQLException, ClassNotFoundException {
		List<Team> teams = new ArrayList<>();

		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "SELECT id, name, cityName FROM team";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Team team = new Team();
			team.setTeamId(resultSet.getInt("id"));
			team.setTeamName(resultSet.getString("name"));
			team.setTeamCityName(resultSet.getString("cityName"));

			teams.add(team);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return teams;
	}
}
