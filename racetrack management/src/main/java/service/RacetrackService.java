package service;

//RacetrackService.java

import java.util.List;

import model.Racetrack;

public interface RacetrackService {
	List<Racetrack> getAllRacetracks();

	Racetrack getRacetrackById(Long id);

	boolean updateRacetrack(Long id, Racetrack racetrack);

	boolean deleteRacetrack(Long id);

	Racetrack addRacetrack(Racetrack racetrack);
}

/*
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import model.Racetrack; import repository.RacetrackRepository;
 * 
 * @Service public class RacetrackService {
 * 
 * @Autowired private RacetrackRepository racetrackRepository;
 * 
 * public List<Racetrack> getAllRacetracks(); { return
 * racetrackRepository.findAll(); }
 * 
 * public Racetrack getRacetrackById(Long id); { return
 * racetrackRepository.findById(id).orElseThrow(() -> new
 * EntityNotFoundException("Racetrack not found with id " + id)); }
 * 
 * public Racetrack createRacetrack(Racetrack racetrack); { return
 * racetrackRepository.save(racetrack); }
 * 
 * public Racetrack updateRacetrack(Long id, Racetrack racetrack); { Racetrack
 * existingRacetrack = getRacetrackById(id);
 * existingRacetrack.setTrackType(racetrack.getTrackType());
 * existingRacetrack.setTrackCapacity(racetrack.getTrackCapacity());
 * existingRacetrack.setTrackCostPerHour(racetrack.getTrackCostPerHour());
 * return racetrackRepository.save(existingRacetrack); }
 * 
 * public void deleteRacetrack(Long id); { racetrackRepository.deleteById(id); }
 * }
 */