package com.kodilla.good.patterns.airline;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EndCitySearch implements AirlineSearchEngine {

    public List<List<String>> search(CityRequest city) {
        Map<String, List<String>> airLinesMap;
        airLinesMap = AirLinesDB.getAirLines();

        return airLinesMap.values().stream()
                .filter(m -> m.get(m.size() - 1).equals(city.getCity()))
                .collect(Collectors.toList());
    }
}
