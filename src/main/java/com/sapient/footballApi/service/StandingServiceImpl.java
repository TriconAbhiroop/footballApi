package com.sapient.footballApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.footballApi.model.StandingResponse;


@Service
public class StandingServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${weatherApiUrl}")
	String weatherApiUrl;
	
	@Value("${apiKey}")
	String apiKey;
	
	
	public StandingResponse getStandings(int leagueId , String teamName){
		
		final String uri = weatherApiUrl+"?action=get_standings&league_id="+leagueId+"&APIkey="+apiKey;
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
