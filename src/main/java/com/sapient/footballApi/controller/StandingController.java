package com.sapient.footballApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.footballApi.model.StandingResponse;
import com.sapient.footballApi.model.TeamResponse;
import com.sapient.footballApi.model.UserResponse;
import com.sapient.footballApi.service.CountryServiceImpl;
import com.sapient.footballApi.service.LeagueServiceImpl;
import com.sapient.footballApi.service.StandingServiceImpl;
import com.sapient.footballApi.service.TeamServiceImpl;

@RestController
public class StandingController {

	@Autowired
	CountryServiceImpl countryServiceImpl;

	@Autowired
	LeagueServiceImpl leagueServiceImpl;

	@Autowired
	TeamServiceImpl teamServiceImpl;

	@Autowired
	StandingServiceImpl standingServiceImpl;

	@RequestMapping(value = "/standings", method = RequestMethod.GET)
	public UserResponse getStandingsByParams(@RequestParam("country_name") String country_name,
			@RequestParam("league_name") String league_name, @RequestParam("team_name") String team_name) {

		int countryId = countryServiceImpl.getCountryIdByName(country_name);

		int leagueId = leagueServiceImpl.getLeagueIdByName(league_name, countryId);

		TeamResponse team = teamServiceImpl.getTeamDetailsFromLeagueId(leagueId, team_name);

		StandingResponse standing = standingServiceImpl.getStandings(leagueId, team_name);

		UserResponse response = new UserResponse().withCountryId(countryId).withCountryName(country_name)
				.withLeagueId(leagueId).withLeagueName(league_name).withTeamId(team.getTeamKey())
				.withTeamName(team.getTeamName()).withLeaguePos(standing.getOverallLeaguePosition());

		return response;
	}

}
