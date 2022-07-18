package com.kodilla.good.patterns.airline;

public class Flight {
    private String departureCity;
    private String arrivalCity;

    public Flight(String departureCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public String toString() {
        return "Departure City='" + departureCity + '\'' +
                ", Arrival City='" + arrivalCity;
    }
}
