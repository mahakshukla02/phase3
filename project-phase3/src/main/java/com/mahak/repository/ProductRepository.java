package com.mahak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mahak.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findById(long id);
}
