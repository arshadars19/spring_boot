package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Racetrack;

public interface RacetrackRepository extends JpaRepository<Racetrack, Long> {

}
