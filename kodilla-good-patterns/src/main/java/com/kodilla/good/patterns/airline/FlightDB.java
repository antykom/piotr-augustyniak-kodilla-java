package com.kodilla.good.patterns.airline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightDB {

    public static List<Flight> getAirLines() {

        Flight firstConnection = new Flight("Warsaw", "Cracow");
        Flight secondConnection = new Flight("Cracow", "New York");
        Flight thirdConnection = new Flight("Gdansk", "Moscow");

        List<Flight> flightDB = new ArrayList<>();
        flightDB.add(firstConnection);
        flightDB.add(secondConnection);
        flightDB.add(thirdConnection);

        return flightDB;
    }


}
