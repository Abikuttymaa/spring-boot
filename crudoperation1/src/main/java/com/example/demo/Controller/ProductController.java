package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Product;

import com.example.demo.Service.ProductService;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import com.example.demo.exceptionhandling.ResponseHandler;


@RestController
@RequestMapping("/api")
@Validated
@Transactional
public class ProductController {
	@Autowired
	private ProductService Service;
	
	@GetMapping("/Product/{pageNo}/{pageSize}")
    public ResponseEntity<List<Product>> getAllProducts(
                        @RequestParam(defaultValue = "0") Integer pageNo, 
                        @RequestParam(defaultValue = "5") Integer pageSize,
                        @RequestParam(defaultValue = "schemeSerialNo") String sortBy) 
    {
        List<Product> list = Service.getAllEmployees(pageNo, pageSize, sortBy);
 
        return new ResponseEntity<List<Product>>(list, new HttpHeaders(), HttpStatus.OK); 
    }

	 @GetMapping("/Products")
	    public ResponseEntity<Object> GetProducts(){
	            List<Product> result = (List<Product>) Service.getProducts();
	        try {
	            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	       }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }

	    }
	 @GetMapping("/Product/{schemeSerialNo}")
	    public ResponseEntity<Object> GetProduct(@PathVariable int schemeSerialNo) {
		 
	    	try{
	    		Product result =  this.Service.getProductByschemeSerialNo(schemeSerialNo);
	    		
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
	           Product result = Service.saveProduct(product);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
	           }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }
	@PutMapping("/Product/{schemeSerialNo}")
    public ResponseEntity<Object> UpdateProduct(@RequestBody Product product){
        try{
            Product result = Service.saveProduct(product);
            if(result==null){
                throw new ResourceNotFoundException("Record_Not_Found");
            }
            
            return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
        }catch (Exception e){
            return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
        }
    }
	
    @DeleteMapping("/Product/{schemeSerialNo}")
    public ResponseEntity<Object> DeleteProduct(@PathVariable int schemeSerialNo){
        try{
            String result = Service.deleteProduct(schemeSerialNo);
            if(result==null){
                throw new ResourceNotFoundException("Record_Not_Found");
           }
           return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
        }catch (Exception e){
            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

        }
    }
	
}

		 
	 
	 
	  
	


