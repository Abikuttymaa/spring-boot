package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ExceptionHandling.ResourceNotFoundException;
import com.example.demo.ExceptionHandling.ResponseHandler;
import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;


@RestController
@RequestMapping("/api")
@Validated
@Transactional 
public class ProductController {
	    @Autowired
		private ProductService productService;
		
	    @GetMapping("/products")
	    public ResponseEntity<Object> GetProducts(){
	            List<Product> result = (List<Product>) productService.getProducts();
	        try {
	            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	      
	        }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }

	    }
	    @GetMapping("/Product/{PROD_CODE}")
	    public ResponseEntity<Object> GetProduct(@PathVariable String PROD_CODE) {
		 
	    	try{
	    		Optional<Product> result =  this.productService.getProductByPROD_CODE(PROD_CODE);
	    		
	    		if(result==null){
	    			throw new ResourceNotFoundException("Record_Not_Found");
	    		}
	    		return ResponseHandler.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
	    	
	    	}catch(Exception e){
	    		
	    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);	
	    	}
	 }


	 @PostMapping("/Product")
	    public ResponseEntity<Object> saveProduct(@Valid @RequestBody Product product){
		 
	        try{
	           Product result = productService.saveProduct(product);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
	           }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }
	@PutMapping("/Product/{PROD_CODE}")
	public ResponseEntity<Object> UpdateProduct(@RequestBody Product product){
	    try{
	        Product result = productService.saveProduct(product);
	        if(result==null){
	            throw new ResourceNotFoundException("Record_Not_Found");
	        }
	        
	        return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
	    }catch (Exception e){
	        return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
	    }
	}

	@DeleteMapping("/Product/{PROD_CODE}")
	public ResponseEntity<Object> DeleteProduct(@PathVariable String PROD_CODE){
	    try{
	        String result = productService.deleteProduct(PROD_CODE);
	        if(result==null){
	            throw new ResourceNotFoundException("Record_Not_Found");
	       }
	       return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
	    }catch (Exception e){
	        return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

	    }
	}

}
