package it.project.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CocktailResponse {
	@JsonProperty("drinks")
	private List<Cocktail> drinks;
}
