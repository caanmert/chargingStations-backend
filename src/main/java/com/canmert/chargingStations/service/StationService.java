package com.canmert.chargingStations.service;

import com.canmert.chargingStations.exception.StationNotFoundException;
import com.canmert.chargingStations.model.Station;
import com.canmert.chargingStations.repository.StationRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Iterable<Station> getAll() {
        return stationRepository.findAll();
    }

    public Station getById(Long id) {
        return stationRepository.findById(id).orElseThrow(StationNotFoundException::new);
    }

    public Station create(Station station) {
        return stationRepository.save(station);
    }

    public Station update(Station updatedStation, Long id) {
        Station station = stationRepository.findById(id).orElseThrow(StationNotFoundException::new);
        station.setName(updatedStation.getName());
        station.setLocation(updatedStation.getLocation());
        station.setConnectionPort(updatedStation.getConnectionPort());
        station.setInUse(updatedStation.getInUse());
        return stationRepository.save(station);

    }

    public ResponseEntity<Station> delete(Long id) {
        Station station = stationRepository.findById(id).orElseThrow(StationNotFoundException::new);
        stationRepository.delete(station);
        return ResponseEntity.ok(station);
    }
}
