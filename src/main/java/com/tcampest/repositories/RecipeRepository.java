package com.tcampest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tcampest.domain.Recipe;

/**
 * @author Thiago Campestrini em 21 de jan de 2018
 *
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
