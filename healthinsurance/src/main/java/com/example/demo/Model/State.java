package com.example.demo.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sta")
public class State {
	
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="state_name")
	private String Statename;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getStatename() {
		return Statename;
	}

	public void setStatename(String statename) {
		this.Statename = statename;
	}
	
    public State() {
    	
    }

	public State(int id, String statename) {
		super();
		this.Id = id;
		this.Statename = statename;
	}
	
}
