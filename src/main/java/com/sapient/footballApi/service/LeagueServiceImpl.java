package com.sapient.footballApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.footballApi.model.LeagueResponse;

@Service
public class LeagueServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${weatherApiUrl}")
	String weatherApiUrl;
	
	@Value("${apiKey}")
	String apiKey;
	
	
	public int getLeagueIdByName(String league_name , int countryId) {
		
		final String uri = weatherApiUrl+"?action=get_leagues&country_id="+countryId+"&APIkey="+apiKey;
		LeagueResponse[] leagueResponse=restTemplate.getForObject(uri,LeagueResponse[].class);
		
		int leagueId =-1;
		for(int i=0 ; i < leagueResponse.length ; i++) {
			
			LeagueResponse league=leagueResponse[i];
			if(league.getLeagueName().equals(league_name)) {
				leagueId= league.getLeagueId();
				break;
			}
		}
		return leagueId;
		
		
		
		
	}

}
