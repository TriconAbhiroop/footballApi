package com.sapient.footballApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.footballApi.model.StandingResponse;


@Service
public class StandingServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	public StandingResponse getStandings(int leagueId , String teamName){
		
		final String uri = "https://apiv2.apifootball.com/?action=get_standings&league_id="+leagueId+"&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
		StandingResponse[] standingResponse=restTemplate.getForObject(uri,StandingResponse[].class);
		StandingResponse standing = null;
		for(int i=0 ; i < standingResponse.length ; i++) {
			standing = standingResponse[i];
			if(standing.getLeagueId()==leagueId && standing.getTeamName().equals(teamName)) {
				break;
			}
		}
		
		return standing;
		
		
	}

}
