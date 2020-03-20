package neeraj.springframwork.recipe.repositories;

import neeraj.springframwork.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
