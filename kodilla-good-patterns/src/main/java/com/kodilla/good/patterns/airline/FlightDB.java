package com.kodilla.good.patterns.airline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightDB {

    public static Map<String, Flight> getAirLines() {

        Flight firstConnection = new Flight("Warsaw", "Cracow");
        Flight secondConnection = new Flight("Cracow", "New York");
        Flight thirdConnection = new Flight("Gdansk", "Moscow");

        Map<String, Flight> airLines = new HashMap<>();
        airLines.put("1", firstConnection);
        airLines.put("2", secondConnection);
        airLines.put("3", thirdConnection);

        return airLines;
    }


}
