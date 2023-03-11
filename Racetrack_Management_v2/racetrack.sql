INSERT INTO racetrack (type, capacity, costPerHour) VALUES
  ('Formula One', 20, 150.00),
  ('Drag Racing', 10, 75.50),
  ('Motocross', 30, 50.25),
  ('Kart Racing', 15, 25.00);

SELECT * FROM `racetrack_db`.`racetrack`;


CREATE DATABASE racetrack_db;

USE racetrack_db;

CREATE TABLE racetrack (
  id BIGINT(20) NOT NULL AUTO_INCREMENT,
  type VARCHAR(255) NOT NULL,
  capacity INT(11) NOT NULL,
  costPerHour DOUBLE(10, 2) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO racetrack (type, capacity, costPerHour) VALUES
  ('Formula One', 20, 150.00),
  ('Drag Racing', 10, 75.50),
  ('Motocross', 30, 50.25),
  ('Kart Racing', 15, 25.00);

