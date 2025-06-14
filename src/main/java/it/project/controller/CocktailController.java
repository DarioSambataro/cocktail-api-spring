package it.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import it.project.model.Cocktail;
import it.project.model.CocktailResponse;
import it.project.service.CocktailService;

@RestController
@RequestMapping("/api/cocktails")
public class CocktailController {
	
	@Autowired
	public CocktailService cocktailService;
	
	@GetMapping(value = "/by-letter", produces = "application/json")
	@Operation(summary = "Get cocktails by first letter", description = "It returns all the cocktails having a specific first letter")
	public CocktailResponse getCocktailsByFirstLetter(@RequestParam char letter) {
		return cocktailService.getCocktailByFirstLetter(letter);
	}
	
	@GetMapping(value = "/by-id", produces = "application/json")
	@Operation(summary = "Get cocktail by first letter", description = "It returns the cocktail having a specific ID")
	public Cocktail getCocktailsById(@RequestParam int id) {
		return cocktailService.getCocktailById(id);
	}
	
	@GetMapping(value = "/by-ingredient", produces = "application/json")
	@Operation(summary = "Get cocktails by ingredient", description = "It returns all the cocktails having a specific ingredient")
	public CocktailResponse getCocktailsByIngredient(@RequestParam String ingredient) {
		return cocktailService.getCocktailByIngredient(ingredient);
	}
	
}
