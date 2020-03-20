package com.sapient.footballApi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"country_id",
"country_name",
"country_logo"
})
public class CountryResponse {

@JsonProperty("country_id")
private int countryId;
@JsonProperty("country_name")
private String countryName;
@JsonProperty("country_logo")
private String countryLogo;

/**
* No args constructor for use in serialization
*
*/
public CountryResponse() {
}

/**
*
* @param countryLogo
* @param countryName
* @param countryId
*/
public CountryResponse(int countryId, String countryName, String countryLogo) {
super();
this.countryId = countryId;
this.countryName = countryName;
this.countryLogo = countryLogo;
}

@JsonProperty("country_id")
public int getCountryId() {
return countryId;
}

@JsonProperty("country_id")
public void setCountryId(int countryId) {
this.countryId = countryId;
}

@JsonProperty("country_name")
public String getCountryName() {
return countryName;
}

@JsonProperty("country_name")
public void setCountryName(String countryName) {
this.countryName = countryName;
}

@JsonProperty("country_logo")
public String getCountryLogo() {
return countryLogo;
}

@JsonProperty("country_logo")
public void setCountryLogo(String countryLogo) {
this.countryLogo = countryLogo;
}

}