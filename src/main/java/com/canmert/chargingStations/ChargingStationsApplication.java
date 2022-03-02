package com.canmert.chargingStations;

import java.util.ArrayList;
import java.util.List;

import com.canmert.chargingStations.model.ConnectionPort;
import com.canmert.chargingStations.model.Location;
import com.canmert.chargingStations.model.Station;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChargingStationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChargingStationsApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			GeometryFactory gf = new GeometryFactory();
			Double y = -36.829;
			Double x = 174.896;
			Point point = gf.createPoint(new Coordinate(x,y));
			Location location = new Location(1L,"Varna",point);
			System.out.println(location);
			/*
			 * StationStatus status = new StationStatus(1L, StatusType.AVAILABLE);
			 * List<ConnectionPort> connectionPort = new ArrayList<>();
			 * ConnectionPort port1 = new ConnectionPort(1L, "Type 2", "22 kw",
			 * "Its Type 2 port");
			 * connectionPort.add(port1);
			 * Station station = new Station("Blue zone", connectionPort, "Varna, BG",
			 * status);
			 * System.out.println(station);
			 */
		};
	}
}
