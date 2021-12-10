package com.canmert.chargingStations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ConnectionPort {

    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private String power;
    private String description;

    public ConnectionPort() {
    }

    public ConnectionPort(Long id, String type, String power, String description) {
        this.id = id;
        this.type = type;
        this.power = power;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getPower() {
        return this.power;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", type='" + getType() + "'" +
                ", power='" + getPower() + "'" +
                ", description='" + getDescription() + "'" +
                "}";
    }

}
