package com.racetrack.Racetrack.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("track")
public class RacetrackController {
	@Autowired
	private RacetrackServiceImpl racetrackService;

	// get track
	@GetMapping("all")
	public List<Racetrack> findallRacetrack() {
		return racetrackService.getRacetrack();
	}

	@PostMapping("/create") // http://localhost:8080/track/create
	public ResponseEntity<String> createRacetrack(@RequestBody Racetrack racetrackObj) {
		try {
			Racetrack newRacetrack = racetrackService.createRacetrack(racetrackObj);
			return ResponseEntity.status(HttpStatus.CREATED)
					.body("Record with track id " + newRacetrack.getTrackid() + " created successfully.");
		} catch (DuplicateKeyException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("A record with the same track name already exists.");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while creating the record.");
		}
	}

	@DeleteMapping("/{trackid}") // http://localhost:8080/track/
	public ResponseEntity<String> deleteRacetrack(@PathVariable("trackid") Long trackid) {
		try {
			racetrackService.deleteRacetrack(trackid);
			return ResponseEntity.status(HttpStatus.OK).body("Record with id " + trackid + " deleted successfully.");
		} catch (EntityNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record with id " + trackid + " not found.");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while deleting the record.");
		}
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateRacetrack(@RequestBody Racetrack racetrackObj) {
		try {
			Racetrack updatedRacetrack = racetrackService.updateRacetrack(racetrackObj);
			if (updatedRacetrack != null) {
				return ResponseEntity
						.ok("Record with track id " + updatedRacetrack.getTrackid() + " updated successfully.");
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record not found for the given track id.");
			}
		} catch (DuplicateKeyException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("A record with the same track name already exists.");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("An error occurred while updating the record.");
		}
	}
}

	// create track
	/*
	 * @PostMapping("/create") // http://localhost:8080/track/create public
	 * Racetrack createRacetrack(@RequestBody Racetrack racetrackObj) { return
	 * racetrackService.createRacetrack(racetrackObj); }
	 */

	/*
	 * //create track
	 * 
	 * @PostMapping("/create") // http://localhost:8080/track/create public
	 * ResponseEntity<String> createRacetrack(@RequestBody Racetrack racetrackObj) {
	 * Racetrack newRacetrack = racetrackService.createRacetrack(racetrackObj);
	 * return ResponseEntity.status(HttpStatus.CREATED).body("Record with track id "
	 * + newRacetrack.getTrackid() + " created successfully."); }
	 */

	// Delete Track
	/*
	 * @DeleteMapping("/{trackid}") // http://localhost:8080/track/ public void
	 * deleteRacetrack(@PathVariable("trackid") Long trackid) {
	 * racetrackService.deleteRacetrack(trackid); }
	 */

	// Updating all customer
	/*
	 * @PutMapping("/update") public Racetrack updateRacetrack(@RequestBody
	 * Racetrack racetrackObj) { return
	 * racetrackService.updateRacetrack(racetrackObj); }
	 */

