package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class FlightSearchEngine {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("Radom", false);
        airportsMap.put("Modlin", true);
        airportsMap.put("Baranowo", true);
        airportsMap.put("Okęcie", true);

        String foundedAirport = null;

        for (String airport : airportsMap.keySet()) {
            if (airport.equals(flight.getArrivalAirport())) {
                foundedAirport = airport;
            }
        }

        if (foundedAirport != null) {
            System.out.println("You can travel to " + foundedAirport);
        } else {
            throw new RouteNotFoundException("Airport not found");
        }

    }

}
