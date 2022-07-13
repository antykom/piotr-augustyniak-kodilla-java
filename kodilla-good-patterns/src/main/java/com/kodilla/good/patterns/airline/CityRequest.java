package com.kodilla.good.patterns.airline;

public class CityRequest {
    private String city;

    public CityRequest(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        CityRequest e = (CityRequest) o;
        return this.city.equals(e.city);
    }

    @Override
    public int hashCode() {
        return city != null ? city.hashCode() : 0;
    }
}
