package com.sapient.footballApi.model;

public class UserResponse {

	int countryId;
	String countryName;
	int leagueId;
	String leagueName;
	int teamId;
	String teamName;
	int leaguePos;

	public UserResponse(int countryId, String countryName, int leagueId, String leagueName, int teamId, String teamName,
			int leaguePos) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.leagueId = leagueId;
		this.leagueName = leagueName;
		this.teamId = teamId;
		this.teamName = teamName;
		this.leaguePos = leaguePos;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

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

	public int getLeaguePos() {
		return leaguePos;
	}

	public void setLeaguePos(int leaguePos) {
		this.leaguePos = leaguePos;
	}

}
