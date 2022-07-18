package com.kodilla.good.patterns.airline;

import java.util.*;
import java.util.stream.Collectors;

public class StartCitySearch implements AirlineSearchEngine {

    public List<Flight> search(CityRequest city) {
        Map<String, Flight> airLinesMap;
        airLinesMap = FlightDB.getAirLines();

        airLinesMap.entrySet().forEach(m -> {
            System.out.println(m);
        });


        List<Flight> odp = airLinesMap.values().stream()
                .filter(m -> m.getDepartureCity().equals(city))
                .collect(Collectors.toList());

        return odp;
    }
}
