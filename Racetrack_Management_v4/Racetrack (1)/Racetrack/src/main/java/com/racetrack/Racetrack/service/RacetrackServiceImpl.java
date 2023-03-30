package com.racetrack.Racetrack.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.racetrack.Racetrack.model.Racetrack;
import com.racetrack.Racetrack.repository.RacetrackRepository;

/*@Service
 * public class RacetrackServiceImpl {

	@Autowired
	private RacetrackRepository racetrackRepository;

	public List<Racetrack> getRacetrack() {
		return racetrackRepository.findAll();
	}

	public Racetrack createRacetrack(Racetrack racetrackObj) {
		return racetrackRepository.save(racetrackObj);

	}

	public boolean deleteRacetrack(Long racetrackobj) {
		racetrackRepository.deleteById(racetrackobj);
		return true;
	}

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
*/

@Service
public class RacetrackServiceImpl {

    @Autowired
    private RacetrackRepository racetrackRepository;

    public List<Racetrack> getRacetrack(String type) {
    	
    	if(type == null) {
    		 return racetrackRepository.findAll();
    	}else {
    		 return racetrackRepository.findAllBytype(type);
    	}
    }

    public Racetrack createRacetrack(Racetrack racetrackObj) throws DuplicateKeyException {
        String trackName = racetrackObj.getType();
        if (racetrackRepository.findByType(trackName) != null) {
            throw new DuplicateKeyException("A record with the same track name already exists.");
        }
        return racetrackRepository.save(racetrackObj);
    }

    public boolean deleteRacetrack(Long racetrackobj) throws EntityNotFoundException {
        Optional<Racetrack> trackOptional = racetrackRepository.findById(racetrackobj);
        if (!trackOptional.isPresent()) {
            throw new EntityNotFoundException("Record not found.");
        }
        racetrackRepository.deleteById(racetrackobj);
        return true;
    }

    public Racetrack updateRacetrack(Racetrack racetrackObj) throws EntityNotFoundException {
        Long trackId = racetrackObj.getTrackid();
        Optional<Racetrack> trackOptional = racetrackRepository.findById(trackId);
        if (!trackOptional.isPresent()) {
            throw new EntityNotFoundException("Record not found for the given track id.");
        }
        Racetrack existingTrack = trackOptional.get();
        existingTrack.setType(racetrackObj.getType());
        existingTrack.setCapacity(racetrackObj.getCapacity());
        existingTrack.setCost(racetrackObj.getCost());
        return racetrackRepository.save(existingTrack);
    }
}
