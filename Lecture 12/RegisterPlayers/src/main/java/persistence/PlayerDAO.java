package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Team;

public class PlayerDAO implements ICRUD<Player> {

	private GenericDAOMySQL genericDAOMySQL;

	public PlayerDAO(GenericDAOMySQL genericDAOMySQL) {
		super();
		this.genericDAOMySQL = genericDAOMySQL;
	}

	@Override
	public void register(Player player) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "INSERT INTO player VALUES (?, ?, ?, ?, ?, ?)";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, player.getPlayerId());
		preparedStatement.setString(2, player.getPlayerName());
		preparedStatement.setDate(3, java.sql.Date.valueOf(player.getPlayerBirthDate()));
		preparedStatement.setDouble(4, player.getPlayerHeight());
		preparedStatement.setDouble(5, player.getPlayerWeight());
		preparedStatement.setInt(6, player.getPlayerTeam().getTeamId());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public void update(Player player) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "UPDATE player SET name = ?, birthDate = ?, height = ?, weight =  ?, teamId = ? WHERE id = ?)";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setString(1, player.getPlayerName());
		preparedStatement.setDate(2, java.sql.Date.valueOf(player.getPlayerBirthDate()));
		preparedStatement.setDouble(3, player.getPlayerHeight());
		preparedStatement.setDouble(4, player.getPlayerWeight());
		preparedStatement.setInt(5, player.getPlayerTeam().getTeamId());
		preparedStatement.setInt(6, player.getPlayerId());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public void remove(Player player) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		String cmdSQL = "DELETE FROM player WHERE id = ?";

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL);
		preparedStatement.setInt(1, player.getPlayerId());

		preparedStatement.execute();
		preparedStatement.close();
		conn.close();
	}

	@Override
	public Player search(Player player) throws SQLException, ClassNotFoundException {
		Connection conn = genericDAOMySQL.getConnection();
		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT player.id AS id, player.name AS name, ");
		cmdSQL.append("player.birthDate AS birthDate, player.height AS height, ");
		cmdSQL.append("player.weight AS weight, ");
		cmdSQL.append("team.id AS teamId, team.name AS teamName, team.cityName AS teamCityName ");
		cmdSQL.append("FROM team, player ");
		cmdSQL.append("WHERE team.id = player.teamId ");
		cmdSQL.append("AND player.id = ?");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		preparedStatement.setInt(1, player.getPlayerId());
		ResultSet resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Team team = new Team();

			team.setTeamId(resultSet.getInt("teamId"));
			team.setTeamName(resultSet.getString("teamName"));
			team.setTeamCityName(resultSet.getString("teamCityName"));

			player.setPlayerId(resultSet.getInt("id"));
			player.setPlayerName(resultSet.getString("name"));
			player.setPlayerBirthDate(resultSet.getDate("birthDate").toLocalDate());
			player.setPlayerHeight(resultSet.getDouble("height"));
			player.setPlayerWeight(resultSet.getDouble("weight"));
			player.setPlayerTeam(team);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return player;
	}

	@Override
	public List<Player> list() throws SQLException, ClassNotFoundException {
		List<Player> players = new ArrayList<>();

		Connection conn = genericDAOMySQL.getConnection();
		StringBuffer cmdSQL = new StringBuffer();
		cmdSQL.append("SELECT player.id AS id, player.name AS name, ");
		cmdSQL.append("player.birthDate AS birthDate, player.height AS height, ");
		cmdSQL.append("player.weight AS weight, ");
		cmdSQL.append("team.id AS teamId, team.name AS teamName, team.cityName AS teamCityName ");
		cmdSQL.append("FROM team, player ");
		cmdSQL.append("WHERE team.id = player.teamId");

		PreparedStatement preparedStatement = conn.prepareStatement(cmdSQL.toString());
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Team team = new Team();
			team.setTeamId(resultSet.getInt("teamId"));
			team.setTeamName(resultSet.getString("teamName"));
			team.setTeamCityName(resultSet.getString("teamCityName"));

			Player player = new Player();
			player.setPlayerId(resultSet.getInt("id"));
			player.setPlayerName(resultSet.getString("name"));
			player.setPlayerBirthDate(resultSet.getDate("birthDate").toLocalDate());
			player.setPlayerHeight(resultSet.getDouble("height"));
			player.setPlayerWeight(resultSet.getDouble("weight"));
			player.setPlayerTeam(team);

			players.add(player);
		}

		resultSet.close();
		preparedStatement.close();
		conn.close();

		return players;
	}
}
