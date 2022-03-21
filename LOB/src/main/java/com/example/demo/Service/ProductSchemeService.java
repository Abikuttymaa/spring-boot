package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.ProductScheme;
import com.example.demo.Repository.ProductSchemeRepository;

@Validated
@Service
public class ProductSchemeService {
	@Autowired
	private ProductSchemeRepository productSchemeRepository;

	 public ProductScheme saveProductScheme(ProductScheme productScheme){
	        return productSchemeRepository.save(productScheme);
	    }
	    public List<ProductScheme> saveProducts(List<ProductScheme> productSchemes){
	        return (List<ProductScheme>) productSchemeRepository.saveAll(productSchemes);
	    }
	    public List<ProductScheme> getProductSchemes(){
	        return  (List<ProductScheme>) productSchemeRepository.findAll();
	    }
	    
	    public String deleteProductScheme(String PSCH_PROD_CODE){
	    	productSchemeRepository.deleteById(PSCH_PROD_CODE);
	        return "Deleted!";
	    }
		public Optional<ProductScheme> getProductSchemeByPSCH_PROD_CODE(String PSCH_PROD_CODE) {
			return productSchemeRepository.findById(PSCH_PROD_CODE);
		}
		
}
