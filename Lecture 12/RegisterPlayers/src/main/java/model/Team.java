package model;

public class Team {
	private int teamId;
	private String teamName;
	private String teamCityName;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCityName() {
		return teamCityName;
	}

	public void setTeamCityName(String teamCityName) {
		this.teamCityName = teamCityName;
	}

	@Override
	public String toString() {
		return teamId + " - " + teamName;
	}
}
