package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Racetrack;

@Repository
public interface RacetrackRepository extends JpaRepository<Racetrack, Long> {
}



























/*
 * import org.springframework.stereotype.Repository;
 * 
 * @Repository public interface RacetrackRepository extends
 * JpaRepository<Racetrack, Long> { }
 * 
 */