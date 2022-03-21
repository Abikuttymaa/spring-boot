package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Product;

public interface ProductRepository extends JpaRepository<Product,String> {

	Optional<Product> findById(String PROD_CODE);

	void deleteById(String PROD_CODE); 

}
