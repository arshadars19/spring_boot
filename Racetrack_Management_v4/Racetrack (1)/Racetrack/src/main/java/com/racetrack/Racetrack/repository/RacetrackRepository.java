package com.racetrack.Racetrack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.racetrack.Racetrack.model.Racetrack;

@Repository
public interface RacetrackRepository extends JpaRepository<Racetrack, Long> {
    Racetrack findByType(String type);
    
    List<Racetrack>findAllBytype(String type);
}
