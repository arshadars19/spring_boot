package com.racetrack.Racetrack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity	
//@Table(name = "Racetrack")
//@NamedQuery(name = "Racetrack.findByTypeAndCapacity",
            //query = "SELECT r FROM Racetrack r WHERE r.type = :type AND r.capacity >= :capacity")
public class Racetrack {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	Long trackid;
	
    String type;
    
	int capacity;
	
	int cost;

	

	public Racetrack(Long trackid, String type, int capacity, int cost) {
		super();
		this.trackid = trackid;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
	}

	public Racetrack() {
		
	}

	public Long getTrackid() {
		return trackid;
	}

	public void setTrackid(Long trackid) {
		this.trackid = trackid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	
}
