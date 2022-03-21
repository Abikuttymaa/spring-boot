package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.State;
import com.example.demo.Service.StateService;
import com.example.demo.exceptionhandling.ResourceNotFoundException;
import com.example.demo.exceptionhandling.ResponseHandler;

@RestController
@RequestMapping("/api")
@Transactional
public class StateController {
	@Autowired
	private StateService Service;
	
	 @GetMapping("/state")
	    public ResponseEntity<Object> GetStates(){
	            List<State> result = (List<State>) Service.getStates();
	        try {
	            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	       }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }

	    }
	
	 @GetMapping("/state/{id}")
	    public ResponseEntity<Object> GetState(@PathVariable int id) {
		 
	    	try{
	    		Optional<State> result =  this.Service.getStateByid(id);
	    		
	    		if(result==null){
	    			throw new ResourceNotFoundException("Record_Not_Found");
	    		}
	    		return ResponseHandler.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
	    	
	    	}catch(Exception e){
	    		
	    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);	
	    	}
	 }
}
