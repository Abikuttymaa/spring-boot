package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.Lob;
import com.example.demo.Repository.LobRepository;
@Validated
@Service
public class LobService {
	
	
	@Autowired
	private LobRepository lobRepository;

	 public Lob saveLob(@Valid Lob lob){
	        return lobRepository.save(lob);
	    }
//	     public List<Lob> saveLob(@Valid List<Lob> lob) {
//		
//			return lobRepository.saveAll(lob);
//		}
	    public List<Lob> getLobs(){
	        return  (List<Lob>) lobRepository.findAll();
	    }
		public Optional<Lob> getLobByLOB_CODE(String LOB_CODE) {
			return lobRepository.findById(LOB_CODE);
		}
		public String deleteLob(String lOB_CODE) {
			lobRepository.deleteById(lOB_CODE);
	        return "Deleted!";
			
		}
		
		public List<Lob> saveAll(@Valid List<Lob> Row) {
			return lobRepository.saveAll(Row);

			
		}
		
		public ResponseEntity<Object> lobList(List<Lob> Row) {
			
			return LobRepository.lobList(Row);
		}
		 
			}
		
	
		
		

