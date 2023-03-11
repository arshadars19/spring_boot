package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Racetrack;
import repository.RacetrackRepository;

@Service
public class RacetrackServiceImpl implements RacetrackService {

    @Autowired
    private RacetrackRepository racetrackRepository;

    @Override
    public List<Racetrack> getAllRacetracks() {
        return racetrackRepository.findAll();
    }

    @Override
    public Racetrack getRacetrackById(Long id) {
        return racetrackRepository.findById(id).orElse(null);
    }

     @Override
    public boolean updateRacetrack(Long id, Racetrack racetrack) {
        Racetrack existingRacetrack = racetrackRepository.findById(id).orElse(null);
        if (existingRacetrack != null) {
            racetrack.setTrackId(existingRacetrack.getTrackId());
            racetrackRepository.save(racetrack);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteRacetrack(Long id) {
        Racetrack existingRacetrack = racetrackRepository.findById(id).orElse(null);
        if (existingRacetrack != null) {
            racetrackRepository.delete(existingRacetrack);
            return true;
        }
        return false;
    }

    @Override
    public Racetrack addRacetrack(Racetrack racetrack) {
        return racetrackRepository.save(racetrack);
    }
}
























































/*
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import model.Racetrack; import repository.RacetrackRepository;
 * 
 * @Service public class RacetrackServiceImpl implements RacetrackService {
 * 
 * 
 * @Autowired private RacetrackRepository racetrackRepository;
 * 
 * public Racetrack saveRacetrack(Racetrack racetrack) { return
 * racetrackRepository.save(racetrack); }
 * 
 * public Optional<Racetrack> getRacetrackById(Long id) { return
 * racetrackRepository.findById(id); }
 * 
 * public List<Racetrack> getAllRacetracks() { return
 * racetrackRepository.findAll(); }
 * 
 * public void deleteRacetrackById(Long id) {
 * racetrackRepository.deleteById(id); }
 * 
 * }
 */
