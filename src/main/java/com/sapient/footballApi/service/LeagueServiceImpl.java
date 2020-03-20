package com.sapient.footballApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.footballApi.model.CountryResponse;
import com.sapient.footballApi.model.LeagueResponse;

@Service
public class LeagueServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public int getLeagueIdByName(String league_name , int countryId) {
		
		final String uri = "https://apiv2.apifootball.com/?action=get_leagues&country_id="+countryId+"&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
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
