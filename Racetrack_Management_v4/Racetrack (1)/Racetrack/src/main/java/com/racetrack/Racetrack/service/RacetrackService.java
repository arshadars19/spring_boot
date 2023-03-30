package com.racetrack.Racetrack.service;

import java.util.List;

import com.racetrack.Racetrack.model.Racetrack;

public interface RacetrackService 
{
	public List<Racetrack> getRacetrack();
	
	public Racetrack createRacetrack(Racetrack racetrackObj);
	
	public Racetrack updateRacetrack(Racetrack racetrackObj);
	
	public boolean deleteRacetrack(Long racetrackobj);

}
