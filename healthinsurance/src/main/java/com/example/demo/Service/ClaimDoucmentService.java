package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ClaimDoucment;
import com.example.demo.Repository.ClaimDoucmentRepository;

@Service
public class ClaimDoucmentService {
	
	@Autowired
	private ClaimDoucmentRepository claimDocumentRepository;

	public List<ClaimDoucment> getClaimDoucments() {
		return (List<ClaimDoucment>) claimDocumentRepository.findAll();
	}

	public ClaimDoucment saveClaimDoucment(ClaimDoucment claimDoucment) {
		 return claimDocumentRepository.save(claimDoucment);
	}

	public String deleteClaimDoucment(String Policyid) {
		
		claimDocumentRepository.deleteById(Policyid);
        return "Deleted!";
	}

	public Optional<ClaimDoucment> findById(String policyid) {
		
		return claimDocumentRepository.findById(policyid);
	}

}
