package com.canmert.chargingStations.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StationStatus {

    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    private StatusType type;

    public StationStatus() {
    }

    public StationStatus(long id, StatusType type) {
        this.id = id;
        this.type = type;
    }

    public long getId() {
        return this.id;
    }

    public StatusType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", type='" + getType() + "'" +
                "}";
    }

}
