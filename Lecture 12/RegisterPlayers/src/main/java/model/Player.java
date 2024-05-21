package model;

import java.time.LocalDate;

public class Player {
	private int playerId;
	private String playerName;
	private LocalDate playerBirthDate;
	private double playerHeight;
	private double playerWeight;
	private Team playerTeam;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public LocalDate getPlayerBirthDate() {
		return playerBirthDate;
	}

	public void setPlayerBirthDate(LocalDate playerBirthDate) {
		this.playerBirthDate = playerBirthDate;
	}

	public double getPlayerHeight() {
		return playerHeight;
	}

	public void setPlayerHeight(double playerHeight) {
		this.playerHeight = playerHeight;
	}

	public double getPlayerWeight() {
		return playerWeight;
	}

	public void setPlayerWeight(double playerWeight) {
		this.playerWeight = playerWeight;
	}

	public Team getPlayerTeam() {
		return playerTeam;
	}

	public void setPlayerTeam(Team playerTeam) {
		this.playerTeam = playerTeam;
	}

	@Override
	public String toString() {
		return playerId + " - " + playerName;
	}
}
