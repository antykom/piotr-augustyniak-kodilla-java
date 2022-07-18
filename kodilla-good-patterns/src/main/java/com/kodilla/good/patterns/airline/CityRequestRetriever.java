package com.kodilla.good.patterns.airline;

public class CityRequestRetriever {

    public CityRequest retrieve() {
        String city = "Cracow";

        return new CityRequest(city);
    }

}
