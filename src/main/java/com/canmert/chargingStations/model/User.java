package com.canmert.chargingStations.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean enabled;
    private boolean tokenExpired;
    @Enumerated
    private RoleType role;

    
    public enum RoleType{
        BASIC,ADMIN
    }
}
