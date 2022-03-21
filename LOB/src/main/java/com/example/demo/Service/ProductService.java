package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;

@Service
@Validated
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	 public Product saveProduct(Product product){
	        return productRepository.save(product);
	    }
	    public List<Product> saveProducts(List<Product> products){
	        return (List<Product>) productRepository.saveAll(products);
	    }
	    public List<Product> getProducts(){
	        return  (List<Product>) productRepository.findAll();
	    }
	    
	    public String deleteProduct(String PROD_CODE){
	    	productRepository.deleteById(PROD_CODE);
	        return "Deleted!";
	    }
		public Optional<Product> getProductByPROD_CODE(String PROD_CODE) {
			return productRepository.findById(PROD_CODE);
		}

}
