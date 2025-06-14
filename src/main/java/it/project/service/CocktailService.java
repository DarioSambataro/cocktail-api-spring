package it.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.project.model.Cocktail;
import it.project.model.CocktailResponse;

@Service
public class CocktailService {
	private final String API_URL_FIRST_LETTER = "https://www.thecocktaildb.com/api/json/v1/1/search.php?f={letter}";
	private final String API_URL_ID = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i={id}";
	private final String API_URL_INGREDIENT = "https://www.thecocktaildb.com/api/json/v1/1/filter.php?i={ingredient}";
	
	//get the cocktail by the first letter
	public CocktailResponse getCocktailByFirstLetter(char letter) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(API_URL_FIRST_LETTER, CocktailResponse.class, letter);
	}
	
	//get the cocktail by id
	public Cocktail getCocktailById(int id) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(API_URL_ID, CocktailResponse.class, id).getDrinks().get(0);
		
	}
	
	//get cocktails by ingredients
	public CocktailResponse getCocktailByIngredient(String ingredient) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(API_URL_INGREDIENT, CocktailResponse.class, ingredient);
	}
}
