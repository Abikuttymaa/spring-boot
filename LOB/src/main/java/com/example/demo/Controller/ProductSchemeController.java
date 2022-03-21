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
import com.example.demo.Model.ProductScheme;
import com.example.demo.Service.ProductSchemeService;

@RestController
@RequestMapping("/api")
@Validated
@Transactional 
public class ProductSchemeController {

	
	@Autowired
	private ProductSchemeService productSchemeService;
	
    @GetMapping("/productscheme")
    public ResponseEntity<Object> GetProductSchemes(){
            List<ProductScheme> result = (List<ProductScheme>) productSchemeService.getProductSchemes();
        try {
            if(result==null){
           throw new ResourceNotFoundException("Record_Not_Found");
            }
         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
      
        }catch(Exception e){

            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
        }

    }
    @GetMapping("/Productscheme/{PSCH_PROD_CODE}")
    public ResponseEntity<Object> GetProductScheme(@PathVariable String PSCH_PROD_CODE) {
	 
    	try{
    		Optional<ProductScheme> result =  this.productSchemeService.getProductSchemeByPSCH_PROD_CODE(PSCH_PROD_CODE);
    		
    		if(result==null){
    			throw new ResourceNotFoundException("Record_Not_Found");
    		}
    		return ResponseHandler.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
    	
    	}catch(Exception e){
    		
    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);	
    	}
 }


 @PostMapping("/Productscheme")
    public ResponseEntity<Object> saveProductScheme(@Valid @RequestBody ProductScheme productScheme){
	 
        try{
           ProductScheme result = productSchemeService.saveProductScheme(productScheme);
           if(result==null) {
        	   throw new ResourceNotFoundException("Record_Not_Found");
           }
           
          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
        
        }catch (Exception e){
         
        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
        }
 }
@PutMapping("/Productscheme/{PSCH_PROD_CODE}")
public ResponseEntity<Object> UpdateProductScheme(@RequestBody ProductScheme productScheme){
    try{
        ProductScheme result = productSchemeService.saveProductScheme(productScheme);
        if(result==null){
            throw new ResourceNotFoundException("Record_Not_Found");
        }
        
        return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
    }catch (Exception e){
        return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
    }
}

@DeleteMapping("/Productscheme/{PSCH_PROD_CODE}")
public ResponseEntity<Object> DeleteProductScheme(@PathVariable String PSCH_PROD_CODE){
    try{
        String result = productSchemeService.deleteProductScheme(PSCH_PROD_CODE);
        if(result==null){
            throw new ResourceNotFoundException("Record_Not_Found");
       }
       return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
    }catch (Exception e){
        return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

    }
}
}
