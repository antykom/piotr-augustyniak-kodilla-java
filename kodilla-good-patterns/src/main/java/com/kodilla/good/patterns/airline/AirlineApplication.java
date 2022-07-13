package com.kodilla.good.patterns.airline;

public class AirlineApplication {

    public static void main(String[] args) {
        CityRequestRetriever cityRequestRetriever = new CityRequestRetriever();
        CityRequest cityRequest = cityRequestRetriever.retrieve();

        StartCitySearch startCitySearch = new StartCitySearch();
        startCitySearch.search(cityRequest);

        MiddleCitySearch middleCitySearch = new MiddleCitySearch();
        middleCitySearch.search(cityRequest);

        EndCitySearch endCitySearch = new EndCitySearch();
        endCitySearch.search(cityRequest);

    }

}
