package com.sapient.footballApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.footballApi.model.CountryResponse;
@Service
public class CountryServiceImpl {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${weatherApiUrl}")
	String weatherApiUrl;
	
	@Value("${apiKey}")
	String apiKey;
	
	
	public int getCountryIdByName(String country_name) {
		
		final String uri = weatherApiUrl+"?action=get_countries&APIkey="+apiKey;
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
