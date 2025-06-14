package it.project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Cocktail {
	@JsonProperty("idDrink")
	private int cocktailID;
	
	@JsonProperty("strDrink")
	private String cocktailName;
	
	@JsonProperty("strInstructions")
	private String cocktailInstructions;
}
