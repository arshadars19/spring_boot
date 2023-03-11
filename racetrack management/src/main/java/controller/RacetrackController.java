package controller;

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

import model.Racetrack;
import service.RacetrackService;

@RestController
@RequestMapping("/racetracks")
public class RacetrackController {

    @Autowired
    private RacetrackService racetrackService;

    @GetMapping("/")
    public List<Racetrack> getAllRacetracks() {
        return racetrackService.getAllRacetracks();
    }

    @GetMapping("/{id}")
    public Racetrack getRacetrackById(@PathVariable("id") Long id) {
        return racetrackService.getRacetrackById(id);
    }

    @PostMapping("/")
    public Racetrack addRacetrack(@RequestBody Racetrack racetrack) {
        return racetrackService.addRacetrack(racetrack);
    }

    @PutMapping("/{id}")
    public boolean updateRacetrack(@PathVariable("id") Long id, @RequestBody Racetrack racetrack) {
        return racetrackService.updateRacetrack(id, racetrack);
    }

    @DeleteMapping("/{id}")
    public void deleteRacetrack(@PathVariable("id") Long id) {
        racetrackService.deleteRacetrack(id);
    }
}
