package service;

import java.util.List;

import model.Racetrack;


public interface RacetrackService {
    List<Racetrack> getAllRacetracks();
    Racetrack getRacetrackById(Long id);
    Racetrack createRacetrack(Racetrack racetrack);
    Racetrack updateRacetrack(Long id, Racetrack racetrack);
    void deleteRacetrack(Long id);
}
