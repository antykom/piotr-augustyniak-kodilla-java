package com.kodilla.good.patterns.airline;

import java.util.*;
import java.util.stream.Collectors;

public class StartCitySearch implements AirlineSearchEngine {

    public List<List<String>> search(CityRequest city) {
        Map<String, List<String>> airLinesMap;
        airLinesMap = AirLinesDB.getAirLines();

        return airLinesMap.values().stream()
                .filter(m -> m.get(0).equals(city.getCity()))
                .collect(Collectors.toList());
    }
}
