package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Team;
import persistence.GenericDAOMySQL;
import persistence.TeamDAO;

@WebServlet("/team")
public class TeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TeamServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("team.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmdType = request.getParameter("button");

		String teamId = request.getParameter("teamId");
		String teamName = request.getParameter("teamName");
		String teamCityName = request.getParameter("teamCityName");

		String consoleOutput = "";
		String consoleError = "";

		Team team = new Team();
		List<Team> teams = new ArrayList<>();

		if (!cmdType.contains("List")) {
			team.setTeamId(Integer.parseInt(teamId));
		}

		if (cmdType.contains("Register") || cmdType.contains("Update")) {
			team.setTeamName(teamName);
			team.setTeamCityName(teamCityName);
		}

		try {
			if (cmdType.contains("Search")) {
				team = searchTeam(team);
			}
			if (cmdType.contains("Register")) {
				registerTeam(team);
				consoleOutput = "Team registered successfully";
				team = null;
			}
			if (cmdType.contains("Update")) {
				updateTeam(team);
				consoleOutput = "Team updated successfully";
				team = null;
			}
			if (cmdType.contains("Remove")) {
				removeTeam(team);
				consoleOutput = "Team removed successfully";
				team = null;
			}
			if (cmdType.contains("List")) {
				teams = listTeam();
			}
		} catch (SQLException | ClassNotFoundException e) {
			consoleError = e.getMessage();
		} finally {
			request.setAttribute("consoleOutput", consoleOutput);
			request.setAttribute("consoleError", consoleError);
			request.setAttribute("team", team);
			request.setAttribute("teams", teams);

			RequestDispatcher rd = request.getRequestDispatcher("team.jsp");
			rd.forward(request, response);
		}

	}

	private Team searchTeam(Team team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TeamDAO teamDAO = new TeamDAO(genericDAOMySQL);

		team = teamDAO.search(team);
		return team;
	}

	private void registerTeam(Team team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TeamDAO teamDAO = new TeamDAO(genericDAOMySQL);

		teamDAO.register(team);
	}

	private void updateTeam(Team team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TeamDAO teamDAO = new TeamDAO(genericDAOMySQL);

		teamDAO.update(team);
	}

	private void removeTeam(Team team) throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TeamDAO teamDAO = new TeamDAO(genericDAOMySQL);

		teamDAO.remove(team);
	}

	private List<Team> listTeam() throws SQLException, ClassNotFoundException {
		GenericDAOMySQL genericDAOMySQL = new GenericDAOMySQL();
		TeamDAO teamDAO = new TeamDAO(genericDAOMySQL);

		List<Team> teams = teamDAO.list();
		return teams;
	}
}
