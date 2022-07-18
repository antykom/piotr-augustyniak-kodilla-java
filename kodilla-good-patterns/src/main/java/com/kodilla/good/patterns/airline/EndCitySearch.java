package com.kodilla.good.patterns.airline;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EndCitySearch implements AirlineSearchEngine {

    public List<Flight> search(CityRequest city) {
        Map<String, Flight> airLinesMap;
        airLinesMap = FlightDB.getAirLines();

        return airLinesMap.values().stream()
                .filter(m -> m.getArrivalCity().equals(city))
                .collect(Collectors.toList());

    }
}
