package com.canmert.chargingStations.controller;

import com.canmert.chargingStations.model.User;
import com.canmert.chargingStations.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public User getOne(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping("/register")
    public User createUser(@RequestBody User user){
        return userService.create(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        return userService.delete(id);
    }


    
}
