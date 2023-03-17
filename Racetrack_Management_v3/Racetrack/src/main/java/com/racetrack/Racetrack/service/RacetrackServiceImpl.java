package com.racetrack.Racetrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.racetrack.Racetrack.model.Racetrack;
import com.racetrack.Racetrack.repository.RacetrackRepository;

@Service
public class RacetrackServiceImpl {

	@Autowired
	private RacetrackRepository racetrackRepository;

	public List<Racetrack> getRacetrack() {
		return racetrackRepository.findAll();
	}

	public Racetrack createRacetrack(Racetrack racetrackObj) {
		return racetrackRepository.save(racetrackObj);

	}

	public void deleteRacetrack(Long racetrackobj) {
		racetrackRepository.deleteById(racetrackobj);
	}

	/*
	 * public Racetrack updateRacetrack(Racetrack racetrackObj) {
	 * 
	 * }
	 */
	/*
	 * public Racetrack updateTrack(int trackid, Racetrack racetrackObj) { Racetrack
	 * existingTrack = RacetrackRepository.findById(trackid).orElse(null); if
	 * (existingTrack != null) { existingTrack.setTrackid(Racetrack.getTrackid());
	 * existingTrack.settype(Racetrack.gettype());
	 * existingTrack.setCapacity(Racetrack.getCapacity());
	 * existingTrack.setCost(Racetrack.getCost());
	 * racetrackRepository.save(existingTrack); } return existingTrack; }
	 */

	public Racetrack updateRacetrack(Racetrack racetrackObj) {
    	Racetrack existingTrack = racetrackRepository.findById(racetrackObj.getTrackid()).orElse(null);
    		//	(racetrackObj.getTrackid()).orElse(null);
        if (existingTrack != null) {
            existingTrack.setType(racetrackObj.getType());
            existingTrack.setCapacity(racetrackObj.getCapacity());
            existingTrack.setCost(racetrackObj.getCost());
            racetrackRepository.save(existingTrack);
        }
        return existingTrack;
	}
}
