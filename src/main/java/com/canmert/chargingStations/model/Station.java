package com.canmert.chargingStations.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Station {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<ConnectionPort> connectionPort;
    private String location;
    @OneToOne
    private StationStatus status;

    public Station() {
    }

    public Station(String name, List<ConnectionPort> connectionPort, String location, StationStatus status) {
        this.name = name;
        this.connectionPort = connectionPort;
        this.location = location;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ConnectionPort> getConnectionPort() {
        return this.connectionPort;
    }

    public void setConnectionPort(List<ConnectionPort> connectionPort) {
        this.connectionPort = connectionPort;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public StationStatus getStatus() {
        return this.status;
    }

    public void setStatus(StationStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", connectionPort='" + getConnectionPort() + "'" +
                ", location='" + getLocation() + "'" +
                ", status='" + getStatus() + "'" +
                "}";
    }

}
