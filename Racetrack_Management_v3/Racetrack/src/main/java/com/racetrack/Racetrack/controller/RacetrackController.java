package com.racetrack.Racetrack.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racetrack.Racetrack.model.Racetrack;
import com.racetrack.Racetrack.service.RacetrackServiceImpl;

@RestController
@RequestMapping("/track")
public class RacetrackController {
	@Autowired
	private RacetrackServiceImpl racetrackService;

	
	//get track
	@GetMapping("/all")
	public List<Racetrack> findallRacetrack() {
		return racetrackService.getRacetrack();
	}

	
	//create track
	@PostMapping("/create") // http://localhost:8080/track/create
	public Racetrack createRacetrack(@RequestBody Racetrack racetrackObj) {
		return racetrackService.createRacetrack(racetrackObj);
	}

	// Delete Track
	@DeleteMapping("/{trackid}") // http://localhost:8080/track/
	public void deleteRacetrack(@PathVariable("trackid") Long trackid) {
		racetrackService.deleteRacetrack(trackid);
	}

	// Updating all customer
	@PutMapping("/update")
	public Racetrack updateRacetrack(@RequestBody Racetrack racetrackObj)
	{
		return racetrackService.updateRacetrack(racetrackObj);
	}
	
	
}
