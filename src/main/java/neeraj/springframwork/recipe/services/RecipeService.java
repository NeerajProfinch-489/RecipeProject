package neeraj.springframwork.recipe.services;

import neeraj.springframwork.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
