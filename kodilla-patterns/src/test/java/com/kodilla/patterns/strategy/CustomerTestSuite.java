package com.kodilla.patterns.strategy;

import com.kodilla.patterns.stategy.CorporateCustomer;
import com.kodilla.patterns.stategy.Customer;
import com.kodilla.patterns.stategy.IndividualCustomer;
import com.kodilla.patterns.stategy.IndividualYoungCustomer;
import com.kodilla.patterns.stategy.predictores.Aggresivepredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTestSuite {

    @Test
    void testDefaultInvestingStrategies() {
        //Given
        Customer steve = new IndividualCustomer("Steven Links");
        Customer john = new IndividualYoungCustomer("John Hemerald");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //When
        String stevenShouldBuy = steve.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);

        //Then
        assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenShouldBuy);
        assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
    }

    @Test
    void testIndividualInvestingStrategy() {
        //Given
        Customer steve = new IndividualCustomer("Steven Links");

        //When
        String stevenShouldBuy = steve.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steve.setBuyingStrategy(new Aggresivepredictor());
        stevenShouldBuy = steve.predict();
        System.out.println("Steven now should: " + stevenShouldBuy);

        //Then
        assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);
    }
}
