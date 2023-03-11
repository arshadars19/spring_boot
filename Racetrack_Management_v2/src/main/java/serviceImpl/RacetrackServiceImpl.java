package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Racetrack;
import repository.RacetrackRepository;
import service.RacetrackService;



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
    public Racetrack createRacetrack(Racetrack racetrack) {
        return racetrackRepository.save(racetrack);
    }

    @Override
    public Racetrack updateRacetrack(Long id, Racetrack racetrack) {
        Racetrack existingRacetrack = racetrackRepository.findById(id).orElse(null);
        if (existingRacetrack != null) {
            existingRacetrack.setType(racetrack.getType());
            existingRacetrack.setCapacity(racetrack.getCapacity());
            existingRacetrack.setCostPerHour(racetrack.getCostPerHour());
            racetrackRepository.save(existingRacetrack);
        }
        return existingRacetrack;
    }

    @Override
    public void deleteRacetrack(Long id) {
        racetrackRepository.deleteById(id);
    }
}
