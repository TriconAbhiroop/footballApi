package com.sapient.footballApi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "countryId", "countryName", "leagueId", "leagueName", "teamId", "teamName", "leaguePos" })
public class UserResponse {

	@JsonProperty("countryId")
	private int countryId;
	@JsonProperty("countryName")
	private String countryName;
	@JsonProperty("leagueId")
	private int leagueId;
	@JsonProperty("leagueName")
	private String leagueName;
	@JsonProperty("teamId")
	private int teamId;
	@JsonProperty("teamName")
	private String teamName;
	@JsonProperty("leaguePos")
	private int leaguePos;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public UserResponse() {
	}

	/**
	 *
	 * @param leagueName
	 * @param teamName
	 * @param leaguePos
	 * @param leagueId
	 * @param teamId
	 * @param countryName
	 * @param countryId
	 */
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

	@JsonProperty("countryId")
	public int getCountryId() {
		return countryId;
	}

	@JsonProperty("countryId")
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public UserResponse withCountryId(int countryId) {
		this.countryId = countryId;
		return this;
	}

	@JsonProperty("countryName")
	public String getCountryName() {
		return countryName;
	}

	@JsonProperty("countryName")
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public UserResponse withCountryName(String countryName) {
		this.countryName = countryName;
		return this;
	}

	@JsonProperty("leagueId")
	public int getLeagueId() {
		return leagueId;
	}

	@JsonProperty("leagueId")
	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public UserResponse withLeagueId(int leagueId) {
		this.leagueId = leagueId;
		return this;
	}

	@JsonProperty("leagueName")
	public String getLeagueName() {
		return leagueName;
	}

	@JsonProperty("leagueName")
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public UserResponse withLeagueName(String leagueName) {
		this.leagueName = leagueName;
		return this;
	}

	@JsonProperty("teamId")
	public int getTeamId() {
		return teamId;
	}

	@JsonProperty("teamId")
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public UserResponse withTeamId(int teamId) {
		this.teamId = teamId;
		return this;
	}

	@JsonProperty("teamName")
	public String getTeamName() {
		return teamName;
	}

	@JsonProperty("teamName")
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public UserResponse withTeamName(String teamName) {
		this.teamName = teamName;
		return this;
	}

	@JsonProperty("leaguePos")
	public int getLeaguePos() {
		return leaguePos;
	}

	@JsonProperty("leaguePos")
	public void setLeaguePos(int leaguePos) {
		this.leaguePos = leaguePos;
	}

	public UserResponse withLeaguePos(int leaguePos) {
		this.leaguePos = leaguePos;
		return this;
	}

}