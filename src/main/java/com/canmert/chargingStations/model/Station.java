package com.canmert.chargingStations.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name cant be null")
    private String name;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<ConnectionPort> connectionPort;
    private String location;
    private boolean inUse;

    public Station() {
    }

    public Station(Long id, String name, List<ConnectionPort> connectionPort, String location, boolean inUse) {
        this.id = id;
        this.name = name;
        this.connectionPort = connectionPort;
        this.location = location;
        this.inUse = inUse;
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

    public boolean isInUse() {
        return this.inUse;
    }

    public boolean getInUse() {
        return this.inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", connectionPort='" + getConnectionPort() + "'" +
                ", location='" + getLocation() + "'" +
                ", inUse='" + isInUse() + "'" +
                "}";
    }

}
