package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Citybin;
import com.example.demo.Repository.CitybinRepository;

@Service
public class CitybinService {
	@Autowired
	private CitybinRepository citybinRepository;
	
	public List<Citybin> getCitybins() {
		return (List<Citybin>) citybinRepository.findAll();
	}

public Optional<Citybin> getCitybinByid(int id) {
		
		return citybinRepository.findById(id);
	}


}
