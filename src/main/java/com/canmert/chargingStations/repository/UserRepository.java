package com.canmert.chargingStations.repository;

import com.canmert.chargingStations.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {}

