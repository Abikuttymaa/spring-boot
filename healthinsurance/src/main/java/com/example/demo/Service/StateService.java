package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.State;
import com.example.demo.Repository.StateRepository;

@Service
public class StateService {
    @Autowired
	private StateRepository stateRepository;

	public List<State> getStates() {
        return  (List<State>) stateRepository.findAll();
	}

	public Optional<State> getStateByid(int id) {
		
		return stateRepository.findById(id);
	}
	
	

}
