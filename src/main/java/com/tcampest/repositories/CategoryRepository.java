package com.tcampest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tcampest.domain.Category;

/**
 * @author Thiago Campestrini em 21 de jan de 2018
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
