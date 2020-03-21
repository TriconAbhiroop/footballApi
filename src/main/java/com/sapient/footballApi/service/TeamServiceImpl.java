package com.sapient.footballApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.sapient.footballApi.model.TeamResponse;

@Service
public class TeamServiceImpl {

	@Autowired
	RestTemplate restTemplate;

	@Value("${weatherApiUrl}")
	String weatherApiUrl;

	@Value("${apiKey}")
	String apiKey;

	public TeamResponse getTeamDetailsFromLeagueId(int leagueId, String teamName) {

		final String uri = weatherApiUrl + "?action=get_teams&league_id=" + leagueId + "&APIkey=" + apiKey;
		TeamResponse[] teamResponse = restTemplate.getForObject(uri, TeamResponse[].class);
		TeamResponse team = null;
		for (int i = 0; i < teamResponse.length; i++) {
			team = teamResponse[i];
			if (team.getTeamName().equals(teamName)) {
				break;
			}
		}

		return team;

	}

}
