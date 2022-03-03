package com.canmert.chargingStations.service;

import com.canmert.chargingStations.exception.UserNotFoundException;
import com.canmert.chargingStations.model.User;
import com.canmert.chargingStations.repository.UserRepository;

import org.springframework.http.ResponseEntity;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Iterable<User> getAll(){
        return userRepository.findAll();
    }

    public User getById(Long id){
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public ResponseEntity<User> delete(Long id){
        User user = userRepository.findById(id).orElseThrow(UserNotFoundException::new);
        userRepository.delete(user);
        return ResponseEntity.ok(user);
    }

    
}
