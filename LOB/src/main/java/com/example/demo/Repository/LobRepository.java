package com.example.demo.Repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Lob;

@Repository

public interface LobRepository extends JpaRepository<Lob,String> {

	List<Lob> save(@Valid List<Lob> lob);

	static ResponseEntity<Object> lobList(List<Lob> list) {
		return null;
	}


	

	

	
	
}
