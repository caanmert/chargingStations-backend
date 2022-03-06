
package com.canmert.chargingStations;

import java.util.ArrayList;
import java.util.List;

import com.canmert.chargingStations.model.ConnectionPort;
import com.canmert.chargingStations.model.Location;
import com.canmert.chargingStations.model.Station;
import com.canmert.chargingStations.service.StationService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class StationRestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;
    
    @MockBean
    StationService stationService;

    @Test
   public void createStation_success() throws Exception{
        List<ConnectionPort> connectionPorts = new ArrayList<>();
       ConnectionPort port1 = new ConnectionPort(1L, "Type 2", "22 kw","Its Type 2 port");
        connectionPorts.add(port1);
        GeometryFactory gf = new GeometryFactory();
        Point point = gf.createPoint(new Coordinate(174.896,-36.829 ));
        Location location = new Location(1L,"Varna",point);
        Station station = new Station(1L,"Station1",connectionPorts,location,false);

        mockMvc.perform(MockMvcRequestBuilders.post("/stations")
        .contentType(MediaType.APPLICATION_JSON)
        .content(mapper.writeValueAsString(station))
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.status().isOk());

        Mockito.verify(stationService).create(station);



       
    }


   
    
}
