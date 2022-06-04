package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Tokyo");
        FlightSearchEngine fsEngine = new FlightSearchEngine();

        try{
            fsEngine.findFlight(flight);
        } catch (RouteNotFoundException ex) {
            System.out.println("Flight not found. Sorry");
        }
    }

}
