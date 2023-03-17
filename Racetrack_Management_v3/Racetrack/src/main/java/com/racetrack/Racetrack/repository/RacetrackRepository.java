package com.racetrack.Racetrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.racetrack.Racetrack.model.Racetrack;

@Repository
public interface RacetrackRepository  extends JpaRepository<Racetrack, Long> {

}
