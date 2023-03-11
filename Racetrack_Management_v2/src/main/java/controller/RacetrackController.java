package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import model.Racetrack;
import service.RacetrackService;



@RestController
@RequestMapping("/racetracks")
public class RacetrackController {

    @Autowired
    private RacetrackService racetrackService;

    @GetMapping
    public List<Racetrack> getAllRacetracks() {
        return racetrackService.getAllRacetracks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Racetrack> getRacetrackById(@PathVariable Long id) {
        Racetrack racetrack = racetrackService.getRacetrackById(id);
        if (racetrack != null) {
            return new ResponseEntity<>(racetrack, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Racetrack> createRacetrack(@RequestBody Racetrack racetrack) {
        Racetrack createdRacetrack = racetrackService.createRacetrack(racetrack);
        return new ResponseEntity<>(createdRacetrack, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Racetrack> updateRacetrack(@PathVariable Long id, @RequestBody Racetrack racetrack) {
        Racetrack updatedRacetrack = racetrackService.updateRacetrack(id, racetrack);
        if (updatedRacetrack != null) {
            return new ResponseEntity<>(updatedRacetrack, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRacetrack(@PathVariable Long id) {
        racetrackService.deleteRacetrack(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
