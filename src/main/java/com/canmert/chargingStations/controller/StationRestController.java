package com.canmert.chargingStations.controller;

import javax.validation.Valid;

import com.canmert.chargingStations.model.Station;
import com.canmert.chargingStations.service.StationService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class StationRestController {

    private final StationService stationService;

    public StationRestController(StationService stationService) {
        this.stationService = stationService;
    }

    @GetMapping("/stations")
    public Iterable<Station> getAllStations() {
        return stationService.getAll();
    }

    @GetMapping("/stations/{id}")
    public Station getOne(@PathVariable Long id) {
        return stationService.getById(id);
    }

    @PostMapping("/stations")
    public Station createStation(@Valid @RequestBody Station newStation) {
        return stationService.create(newStation);
    }

    @PutMapping("/stations/{id}")
    public Station updateStation(@PathVariable Long id, @RequestBody Station updatedStation) {
        return stationService.update(updatedStation, id);
    }

    @DeleteMapping("/stations/{id}")
    public ResponseEntity<Station> deleteStation(@PathVariable Long id) {
        return stationService.delete(id);
    }

}
