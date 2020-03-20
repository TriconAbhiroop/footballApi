package com.sapient.footballApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.footballApi.model.*;
@Service
public class CountryServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public int getCountryIdByName(String country_name) {
		
		final String uri = "https://apiv2.apifootball.com/?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
		CountryResponse[] countryResponse=restTemplate.getForObject(uri, CountryResponse[].class);
		
		int countryId =-1;
		for(int i=0 ; i < countryResponse.length ; i++) {
			
			CountryResponse country=countryResponse[i];
			if(country.getCountryName().equals(country_name)) {
				countryId= country.getCountryId();
				break;
			}
		}
		return countryId;
		
		
		
		
	}

}
