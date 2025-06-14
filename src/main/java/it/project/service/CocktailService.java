package it.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.project.model.CocktailResponse;

@Service
public class CocktailService {
	private final String API_URL = "https://www.thecocktaildb.com/api/json/v1/1/search.php?f={letter}";
	
	//get the cocktail by the first letter
	public CocktailResponse getCocktailByFirstLetter(char letter) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(API_URL, CocktailResponse.class, letter);
	}
	
}
