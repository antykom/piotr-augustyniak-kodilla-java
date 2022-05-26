package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetWorldPopulation() {
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent northAmerica = new Continent();

        Country poland = new Country("Poland", new BigDecimal("38383000"));
        Country ukraine = new Country("Ukraine", new BigDecimal("43535000"));

        Country china = new Country("China", new BigDecimal("1404286000"));
        Country india = new Country("India", new BigDecimal("1425158000"));

        Country usa = new Country("USA", new BigDecimal("337599000"));
        Country canada = new Country("Canada", new BigDecimal("38150000"));


        //When
        europe.addCountry(poland);
        europe.addCountry(ukraine);
        asia.addCountry(china);
        asia.addCountry(india);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        BigDecimal totalPopulation = world.getPeopleQuantity();


        //Then
        BigDecimal expectedPopulation = new BigDecimal("3287111000");
        Assertions.assertEquals(expectedPopulation, totalPopulation);

    }
}
