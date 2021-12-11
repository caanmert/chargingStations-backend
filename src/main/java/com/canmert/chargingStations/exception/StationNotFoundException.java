package com.canmert.chargingStations.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StationNotFoundException extends RuntimeException {

    public StationNotFoundException() {
        super("Station is not found");
    }

}
