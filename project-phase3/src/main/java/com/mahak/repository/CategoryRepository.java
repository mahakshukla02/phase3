package com.mahak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mahak.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	  Category findById(long id);
}