package com.sapient.footballApi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"country_name",
"league_id",
"league_name",
"team_id",
"team_name",
"overall_league_position",
"overall_league_payed",
"overall_league_W",
"overall_league_D",
"overall_league_L",
"overall_league_GF",
"overall_league_GA",
"overall_league_PTS",
"home_league_position",
"home_league_payed",
"home_league_W",
"home_league_D",
"home_league_L",
"home_league_GF",
"home_league_GA",
"home_league_PTS",
"away_league_position",
"away_league_payed",
"away_league_W",
"away_league_D",
"away_league_L",
"away_league_GF",
"away_league_GA",
"away_league_PTS"
})
public class StandingResponse {

@JsonProperty("country_name")
private String countryName;
@JsonProperty("league_id")
private int leagueId;
@JsonProperty("league_name")
private String leagueName;
@JsonProperty("team_id")
private String teamId;
@JsonProperty("team_name")
private String teamName;
@JsonProperty("overall_league_position")
private int overallLeaguePosition;
@JsonProperty("overall_league_payed")
private String overallLeaguePayed;
@JsonProperty("overall_league_W")
private String overallLeagueW;
@JsonProperty("overall_league_D")
private String overallLeagueD;
@JsonProperty("overall_league_L")
private String overallLeagueL;
@JsonProperty("overall_league_GF")
private String overallLeagueGF;
@JsonProperty("overall_league_GA")
private String overallLeagueGA;
@JsonProperty("overall_league_PTS")
private String overallLeaguePTS;
@JsonProperty("home_league_position")
private String homeLeaguePosition;
@JsonProperty("home_league_payed")
private String homeLeaguePayed;
@JsonProperty("home_league_W")
private String homeLeagueW;
@JsonProperty("home_league_D")
private String homeLeagueD;
@JsonProperty("home_league_L")
private String homeLeagueL;
@JsonProperty("home_league_GF")
private String homeLeagueGF;
@JsonProperty("home_league_GA")
private String homeLeagueGA;
@JsonProperty("home_league_PTS")
private String homeLeaguePTS;
@JsonProperty("away_league_position")
private String awayLeaguePosition;
@JsonProperty("away_league_payed")
private String awayLeaguePayed;
@JsonProperty("away_league_W")
private String awayLeagueW;
@JsonProperty("away_league_D")
private String awayLeagueD;
@JsonProperty("away_league_L")
private String awayLeagueL;
@JsonProperty("away_league_GF")
private String awayLeagueGF;
@JsonProperty("away_league_GA")
private String awayLeagueGA;
@JsonProperty("away_league_PTS")
private String awayLeaguePTS;

/**
* No args constructor for use in serialization
*
*/
public StandingResponse() {
}

/**
*
* @param teamName
* @param overallLeagueD
* @param homeLeaguePayed
* @param homeLeaguePTS
* @param awayLeagueD
* @param homeLeaguePosition
* @param overallLeaguePosition
* @param awayLeagueL
* @param leagueName
* @param overallLeagueW
* @param overallLeaguePayed
* @param leagueId
* @param awayLeaguePosition
* @param awayLeagueW
* @param overallLeagueL
* @param homeLeagueW
* @param homeLeagueD
* @param homeLeagueL
* @param awayLeaguePayed
* @param awayLeaguePTS
* @param overallLeagueGA
* @param awayLeagueGA
* @param teamId
* @param homeLeagueGA
* @param overallLeaguePTS
* @param countryName
* @param homeLeagueGF
* @param awayLeagueGF
* @param overallLeagueGF
*/
public StandingResponse(String countryName, int leagueId, String leagueName, String teamId, String teamName, int overallLeaguePosition, String overallLeaguePayed, String overallLeagueW, String overallLeagueD, String overallLeagueL, String overallLeagueGF, String overallLeagueGA, String overallLeaguePTS, String homeLeaguePosition, String homeLeaguePayed, String homeLeagueW, String homeLeagueD, String homeLeagueL, String homeLeagueGF, String homeLeagueGA, String homeLeaguePTS, String awayLeaguePosition, String awayLeaguePayed, String awayLeagueW, String awayLeagueD, String awayLeagueL, String awayLeagueGF, String awayLeagueGA, String awayLeaguePTS) {
super();
this.countryName = countryName;
this.leagueId = leagueId;
this.leagueName = leagueName;
this.teamId = teamId;
this.teamName = teamName;
this.overallLeaguePosition = overallLeaguePosition;
this.overallLeaguePayed = overallLeaguePayed;
this.overallLeagueW = overallLeagueW;
this.overallLeagueD = overallLeagueD;
this.overallLeagueL = overallLeagueL;
this.overallLeagueGF = overallLeagueGF;
this.overallLeagueGA = overallLeagueGA;
this.overallLeaguePTS = overallLeaguePTS;
this.homeLeaguePosition = homeLeaguePosition;
this.homeLeaguePayed = homeLeaguePayed;
this.homeLeagueW = homeLeagueW;
this.homeLeagueD = homeLeagueD;
this.homeLeagueL = homeLeagueL;
this.homeLeagueGF = homeLeagueGF;
this.homeLeagueGA = homeLeagueGA;
this.homeLeaguePTS = homeLeaguePTS;
this.awayLeaguePosition = awayLeaguePosition;
this.awayLeaguePayed = awayLeaguePayed;
this.awayLeagueW = awayLeagueW;
this.awayLeagueD = awayLeagueD;
this.awayLeagueL = awayLeagueL;
this.awayLeagueGF = awayLeagueGF;
this.awayLeagueGA = awayLeagueGA;
this.awayLeaguePTS = awayLeaguePTS;
}

@JsonProperty("country_name")
public String getCountryName() {
return countryName;
}

@JsonProperty("country_name")
public void setCountryName(String countryName) {
this.countryName = countryName;
}

@JsonProperty("league_id")
public int getLeagueId() {
return leagueId;
}

@JsonProperty("league_id")
public void setLeagueId(int leagueId) {
this.leagueId = leagueId;
}

@JsonProperty("league_name")
public String getLeagueName() {
return leagueName;
}

@JsonProperty("league_name")
public void setLeagueName(String leagueName) {
this.leagueName = leagueName;
}

@JsonProperty("team_id")
public String getTeamId() {
return teamId;
}

@JsonProperty("team_id")
public void setTeamId(String teamId) {
this.teamId = teamId;
}

@JsonProperty("team_name")
public String getTeamName() {
return teamName;
}

@JsonProperty("team_name")
public void setTeamName(String teamName) {
this.teamName = teamName;
}

@JsonProperty("overall_league_position")
public int getOverallLeaguePosition() {
return overallLeaguePosition;
}

@JsonProperty("overall_league_position")
public void setOverallLeaguePosition(int overallLeaguePosition) {
this.overallLeaguePosition = overallLeaguePosition;
}

@JsonProperty("overall_league_payed")
public String getOverallLeaguePayed() {
return overallLeaguePayed;
}

@JsonProperty("overall_league_payed")
public void setOverallLeaguePayed(String overallLeaguePayed) {
this.overallLeaguePayed = overallLeaguePayed;
}

@JsonProperty("overall_league_W")
public String getOverallLeagueW() {
return overallLeagueW;
}

@JsonProperty("overall_league_W")
public void setOverallLeagueW(String overallLeagueW) {
this.overallLeagueW = overallLeagueW;
}

@JsonProperty("overall_league_D")
public String getOverallLeagueD() {
return overallLeagueD;
}

@JsonProperty("overall_league_D")
public void setOverallLeagueD(String overallLeagueD) {
this.overallLeagueD = overallLeagueD;
}

@JsonProperty("overall_league_L")
public String getOverallLeagueL() {
return overallLeagueL;
}

@JsonProperty("overall_league_L")
public void setOverallLeagueL(String overallLeagueL) {
this.overallLeagueL = overallLeagueL;
}

@JsonProperty("overall_league_GF")
public String getOverallLeagueGF() {
return overallLeagueGF;
}

@JsonProperty("overall_league_GF")
public void setOverallLeagueGF(String overallLeagueGF) {
this.overallLeagueGF = overallLeagueGF;
}

@JsonProperty("overall_league_GA")
public String getOverallLeagueGA() {
return overallLeagueGA;
}

@JsonProperty("overall_league_GA")
public void setOverallLeagueGA(String overallLeagueGA) {
this.overallLeagueGA = overallLeagueGA;
}

@JsonProperty("overall_league_PTS")
public String getOverallLeaguePTS() {
return overallLeaguePTS;
}

@JsonProperty("overall_league_PTS")
public void setOverallLeaguePTS(String overallLeaguePTS) {
this.overallLeaguePTS = overallLeaguePTS;
}

@JsonProperty("home_league_position")
public String getHomeLeaguePosition() {
return homeLeaguePosition;
}

@JsonProperty("home_league_position")
public void setHomeLeaguePosition(String homeLeaguePosition) {
this.homeLeaguePosition = homeLeaguePosition;
}

@JsonProperty("home_league_payed")
public String getHomeLeaguePayed() {
return homeLeaguePayed;
}

@JsonProperty("home_league_payed")
public void setHomeLeaguePayed(String homeLeaguePayed) {
this.homeLeaguePayed = homeLeaguePayed;
}

@JsonProperty("home_league_W")
public String getHomeLeagueW() {
return homeLeagueW;
}

@JsonProperty("home_league_W")
public void setHomeLeagueW(String homeLeagueW) {
this.homeLeagueW = homeLeagueW;
}

@JsonProperty("home_league_D")
public String getHomeLeagueD() {
return homeLeagueD;
}

@JsonProperty("home_league_D")
public void setHomeLeagueD(String homeLeagueD) {
this.homeLeagueD = homeLeagueD;
}

@JsonProperty("home_league_L")
public String getHomeLeagueL() {
return homeLeagueL;
}

@JsonProperty("home_league_L")
public void setHomeLeagueL(String homeLeagueL) {
this.homeLeagueL = homeLeagueL;
}

@JsonProperty("home_league_GF")
public String getHomeLeagueGF() {
return homeLeagueGF;
}

@JsonProperty("home_league_GF")
public void setHomeLeagueGF(String homeLeagueGF) {
this.homeLeagueGF = homeLeagueGF;
}

@JsonProperty("home_league_GA")
public String getHomeLeagueGA() {
return homeLeagueGA;
}

@JsonProperty("home_league_GA")
public void setHomeLeagueGA(String homeLeagueGA) {
this.homeLeagueGA = homeLeagueGA;
}

@JsonProperty("home_league_PTS")
public String getHomeLeaguePTS() {
return homeLeaguePTS;
}

@JsonProperty("home_league_PTS")
public void setHomeLeaguePTS(String homeLeaguePTS) {
this.homeLeaguePTS = homeLeaguePTS;
}

@JsonProperty("away_league_position")
public String getAwayLeaguePosition() {
return awayLeaguePosition;
}

@JsonProperty("away_league_position")
public void setAwayLeaguePosition(String awayLeaguePosition) {
this.awayLeaguePosition = awayLeaguePosition;
}

@JsonProperty("away_league_payed")
public String getAwayLeaguePayed() {
return awayLeaguePayed;
}

@JsonProperty("away_league_payed")
public void setAwayLeaguePayed(String awayLeaguePayed) {
this.awayLeaguePayed = awayLeaguePayed;
}

@JsonProperty("away_league_W")
public String getAwayLeagueW() {
return awayLeagueW;
}

@JsonProperty("away_league_W")
public void setAwayLeagueW(String awayLeagueW) {
this.awayLeagueW = awayLeagueW;
}

@JsonProperty("away_league_D")
public String getAwayLeagueD() {
return awayLeagueD;
}

@JsonProperty("away_league_D")
public void setAwayLeagueD(String awayLeagueD) {
this.awayLeagueD = awayLeagueD;
}

@JsonProperty("away_league_L")
public String getAwayLeagueL() {
return awayLeagueL;
}

@JsonProperty("away_league_L")
public void setAwayLeagueL(String awayLeagueL) {
this.awayLeagueL = awayLeagueL;
}

@JsonProperty("away_league_GF")
public String getAwayLeagueGF() {
return awayLeagueGF;
}

@JsonProperty("away_league_GF")
public void setAwayLeagueGF(String awayLeagueGF) {
this.awayLeagueGF = awayLeagueGF;
}

@JsonProperty("away_league_GA")
public String getAwayLeagueGA() {
return awayLeagueGA;
}

@JsonProperty("away_league_GA")
public void setAwayLeagueGA(String awayLeagueGA) {
this.awayLeagueGA = awayLeagueGA;
}

@JsonProperty("away_league_PTS")
public String getAwayLeaguePTS() {
return awayLeaguePTS;
}

@JsonProperty("away_league_PTS")
public void setAwayLeaguePTS(String awayLeaguePTS) {
this.awayLeaguePTS = awayLeaguePTS;
}

}
