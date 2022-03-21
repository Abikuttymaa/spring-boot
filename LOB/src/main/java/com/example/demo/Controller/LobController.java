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
import com.example.demo.Model.Lob;
import com.example.demo.Service.LobService;


@RestController
@RequestMapping("/api")
@Validated
@Transactional 
public class LobController {
	 
	@Autowired
	private LobService lobService;
	@GetMapping("/lobs")
	    public ResponseEntity<Object> GetLob(){
		 
	            List<Lob> result = (List<Lob>) lobService.getLobs();
	        try {
	            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	      
	        }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }

	    }
	
	 @GetMapping("/Lob/{LOB_CODE}")
	    public ResponseEntity<Object> GetLob(@PathVariable String LOB_CODE) {
		 
	    	try{
	    		Optional<Lob> result =  this.lobService.getLobByLOB_CODE(LOB_CODE);
	    		
	    		if(result==null){
	    			throw new ResourceNotFoundException("Record_Not_Found");
	    		}
	    		return ResponseHandler.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
	    	
	    	}catch(Exception e){
	    		
	    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);	
	    	}
	 }

	 @PostMapping("/Lob")
	    public ResponseEntity<Object> saveLob(@Valid @RequestBody Lob lob){
	        try{
	        	 Lob result = (Lob) lobService.saveLob(lob);
	           if(result==null) {
	        	   throw new ResourceNotFoundException("Record_Not_Found");
	           }
	           
	          return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK, result);
	        
	        }catch (Exception e){
	         
	        	return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	        }
	 }
	
 
	
	@PostMapping("/Lobs")
	 public  ResponseEntity<Object> savelob(@Valid @RequestBody List<Lob> Row){
		
	        try {
	        	
	        	 List<Lob> result =(List<Lob>) lobService.saveAll(Row);
            if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	            }
	         return  ResponseHandler.generateResponse("Successfully retrieved Data!",HttpStatus.OK,result);
	      
	        }catch(Exception e){

	            return  ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
	            
        }
		
	
	}

	@PutMapping("/Lob/{LOB_CODE}")
	 public ResponseEntity<Object> UpdateLob(@RequestBody Lob lob){
		 try{
		   
	       Lob result = lobService.saveLob(lob);
	       if(result==null){
	           throw new ResourceNotFoundException("Record_Not_Found");
	       }
	       
	       return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
	   }catch (Exception e){
	       return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
	   }
	 }
	 
//	@PutMapping("/lob/{LOB_CODE}")
// public ResponseEntity<Object> UpdateLob(@RequestBody List<Lob> lob){
//     try{
//         Lob result = lobService.saveLob(lob);
//         if(result==null){
//             throw new ResourceNotFoundException("Record_Not_Found");
//         }
//         
//         return ResponseHandler.generateResponse("updated",HttpStatus.OK,result);
//     }catch (Exception e){
//         return ResponseHandler .generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
//     }
// }
	
 @DeleteMapping("/Lob/{LOB_CODE}")
 public ResponseEntity<Object> DeleteLob(@PathVariable String LOB_CODE){
	 
     try{
    	 
         String result = lobService.deleteLob(LOB_CODE);
         if(result==null){
             throw new ResourceNotFoundException("Record_Not_Found");
        }
        return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK, result);
     }catch (Exception e){
         return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);

     }
 }
	
	
}
