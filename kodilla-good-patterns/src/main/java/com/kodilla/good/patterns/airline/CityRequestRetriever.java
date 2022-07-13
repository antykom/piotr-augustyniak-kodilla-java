package com.kodilla.good.patterns.airline;

public class CityRequestRetriever {

    public CityRequest retrieve() {
        String city = "Warsaw";

        return new CityRequest(city);
    }

}
