package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.ClaimDoucment;

@Repository
public interface ClaimDoucmentRepository extends JpaRepository<ClaimDoucment,String> {
	

}
