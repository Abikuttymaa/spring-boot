package com.example.demo.Service;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;

import com.example.demo.Model.Lob;
import com.example.demo.Repository.LobRepository;

public interface LobServicess {
	 List<Lob> lobList1(@NonNull @Size(min = 1) @Valid List<Lob> lob)
		        throws IOException;

	static ResponseEntity<Object> lobList(List<Lob> list) {
		
		return LobRepository.lobList(list);
	}
	

}
