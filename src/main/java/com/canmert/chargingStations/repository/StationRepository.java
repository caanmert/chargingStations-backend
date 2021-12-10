package com.canmert.chargingStations.repository;

import java.util.List;

import com.canmert.chargingStations.model.Station;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface StationRepository extends PagingAndSortingRepository<Station, Long> {
}
