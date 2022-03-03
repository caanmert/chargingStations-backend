package com.canmert.chargingStations.model;

import java.util.UUID;

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

    public User() {}

    public User(String username, String password, boolean enabled, boolean tokenExpired, RoleType role) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.tokenExpired = tokenExpired;
        this.role = role;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isTokenExpired() {
        return this.tokenExpired;
    }

    public boolean getTokenExpired() {
        return this.tokenExpired;
    }

    public void setTokenExpired(boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
    }

    public RoleType getRole() {
        return this.role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", enabled='" + isEnabled() + "'" +
            ", tokenExpired='" + isTokenExpired() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }



}
