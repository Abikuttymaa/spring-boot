package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.City;
import com.example.demo.Repository.CityRepository;

@Service
public class CityService {
	@Autowired
	private CityRepository cityRepository;
	
	public List<City> getCitys() {
        return  (List<City>) cityRepository.findAll();
	}

	public Optional<City> getCityByid(int id) {
		
		return cityRepository.findById(id);
	}

	
	
	

}
