package com.example.demo.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="city")
public class City  {
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="state_id")
	private int  StateId;
	
	@Column(name="city_name")
	private String CityName;
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public int getStateId() {
		return StateId;
	}

	public void setStateId(int stateId) {
		this.StateId = stateId;
	}

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		this.CityName = cityName;
	}
	
	
	public City() {
		
	}

	public City(int id,int stateId, String cityName) {
		super();
		this.Id=id;
		this.StateId = stateId;
		this.CityName = cityName;
	}
     
	
	
}
