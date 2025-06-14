package it.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.project.model.Cocktail;
import it.project.model.CocktailResponse;
import it.project.service.CocktailService;

@RestController
@RequestMapping("/api/cocktails")
public class CocktailController {
	
	@Autowired
	public CocktailService cocktailService;
	
	@GetMapping(value = "/by-letter", produces = "application/json")
	public CocktailResponse getCocktailsByFirstLetter(@RequestParam char letter) {
		return cocktailService.getCocktailByFirstLetter(letter);
	}
	
	@GetMapping(value = "/by-id", produces = "application/json")
	public Cocktail getCocktailsByFirstLetter(@RequestParam int id) {
		return cocktailService.getCocktailById(id);
	}
	
	@GetMapping(value = "/by-ingredient", produces = "application/json")
	public CocktailResponse getCocktailsByIngredient(@RequestParam String ingredient) {
		return cocktailService.getCocktailByIngredient(ingredient);
	}
	
}
