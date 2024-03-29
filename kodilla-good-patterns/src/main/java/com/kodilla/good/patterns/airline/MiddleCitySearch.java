package com.kodilla.good.patterns.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MiddleCitySearch implements AirlineSearchEngine {

    public List<Flight> search(CityRequest city) {
        List<Flight> toMiddleCity = new EndCitySearch().search(city);
        List<Flight> fromMiddleCity = new StartCitySearch().search(city);
        List<Flight> flightList = new ArrayList<>();

        /**
         *                                  SEARCH ENGINE USING STREAM
         flightList = toMiddleCity.stream()
                        .forEach(tm -> {
                                    fromMiddleCity.stream()
                                        .filter(fm -> fm.getDepartureCity().equals(city.getCity()) && fm.getDepartureCity().equals(tm.getArrivalCity()))
                                        .collect(Collectors.toList());
                         });

         **/




        for (Flight flightTo : toMiddleCity) {
            for (Flight flightFrom : fromMiddleCity) {
                if (flightTo.getArrivalCity().equals(flightFrom.getDepartureCity())) {
                    flightList.add(new Flight(flightTo.getDepartureCity(), flightFrom.getArrivalCity()));
                }
            }

        }

        return flightList;

    }
}
