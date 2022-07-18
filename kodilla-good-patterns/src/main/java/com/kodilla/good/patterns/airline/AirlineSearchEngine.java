package com.kodilla.good.patterns.airline;

import java.util.List;
import java.util.Map;

public interface AirlineSearchEngine {
    public List<Flight> search(CityRequest city);
}
