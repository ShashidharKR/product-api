package com.api.product_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.product_api.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByName(String name);

	List<Product> findByPriceGreaterThanEqual(double price);

	List<Product> findByStockBetween(int min, int max);

}
