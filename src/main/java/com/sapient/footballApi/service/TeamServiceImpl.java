package com.sapient.footballApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.sapient.footballApi.model.TeamResponse;

@Service
public class TeamServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	public TeamResponse getTeamDetailsFromLeagueId(int leagueId , String teamName){
		
		final String uri = "https://apiv2.apifootball.com/?action=get_teams&league_id="+leagueId+"&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
		TeamResponse[] teamResponse=restTemplate.getForObject(uri,TeamResponse[].class);
		TeamResponse team = null;
		for(int i=0 ; i < teamResponse.length ; i++) {
			team = teamResponse[i];
			if(team.getTeamName().equals(teamName)) {
				break;
			}
		}
		
		return team;
		
		
	}

}
