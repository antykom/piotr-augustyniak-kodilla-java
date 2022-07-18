package com.kodilla.good.patterns.airline;

import java.util.*;
import java.util.stream.Collectors;

public class StartCitySearch implements AirlineSearchEngine {

    public List<Flight> search(CityRequest city) {
        List<Flight> flightDB;
        flightDB = FlightDB.getAirLines();

        return flightDB.stream()
                .filter(m -> m.getDepartureCity().equals(city.getCity()))
                .map(m -> new Flight(m.getDepartureCity(), m.getArrivalCity()))
                .collect(Collectors.toList());

    }
}
