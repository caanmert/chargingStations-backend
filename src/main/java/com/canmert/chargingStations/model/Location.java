package com.canmert.chargingStations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.locationtech.jts.geom.Point;


@Entity
public class Location {

    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private Point coordinates;



    public Location() {
    }

    public Location(Long id, String city, Point coordinates) {
        this.id = id;
        this.city = city;
        this.coordinates = coordinates;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Point getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", city='" + getCity() + "'" +
            ", coordinates='" + getCoordinates() + "'" +
            "}";
    }








    
}
