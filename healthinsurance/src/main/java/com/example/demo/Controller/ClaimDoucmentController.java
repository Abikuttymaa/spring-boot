package com.example.demo.Controller;

import java.util.List;

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

import com.example.demo.Model.ClaimDoucment;
import com.example.demo.Service.ClaimDoucmentService;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import com.example.demo.exceptionhandling.ResponseHandler;

@RestController
@RequestMapping("/api")
@Transactional
@Validated
public class ClaimDoucmentController {
	
	@Autowired
	private ClaimDoucmentService Service;
	
	 @GetMapping("/ClaimDoucment")
	    public ResponseEntity<Object> GetClaimDoucments(){
	            List<ClaimDoucment> result = (List<ClaimDoucment>) Service.getClaimDoucments();
	        try {
	            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	       }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }

	    }
	 
	 @PostMapping("/ClaimDoucment/")
	    public ResponseEntity<Object> saveClaimDoucment(@Valid @RequestBody ClaimDoucment claimDoucment ){
		 
	        try{	           
	        	ClaimDoucment result = Service.saveClaimDoucment(claimDoucment);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
           }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK,result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }

	@PutMapping("/ClaimDoucment/{Policyid}")
   public ResponseEntity<Object> UpdateClaimDoucment(@RequestBody ClaimDoucment claimDoucment){
       try{
    	   ClaimDoucment result = Service.saveClaimDoucment(claimDoucment);
          if(result==null){
               throw new ResourceNotFoundException("Record_Not_Found");
           }
           
           return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
       }catch (Exception e){
           return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
       }
   }
	 
	 
   @DeleteMapping("/ClaimDoucment/{Policyid}")
   public ResponseEntity<Object> DeleteClaimDoucment(@PathVariable String Policyid){
       try{
           String result = Service.deleteClaimDoucment(Policyid);
           if(result==null){
               throw new ResourceNotFoundException("Record_Not_Found");
          }
          return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
       }catch (Exception e){
           return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

       }
   }

}
