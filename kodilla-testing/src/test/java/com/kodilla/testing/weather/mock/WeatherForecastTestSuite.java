package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    static int counter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Beginning all tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("End of all tests");
    }

    @BeforeEach
    public void beforeEachTest() {
        counter++;
        System.out.println("Test no." + counter);
    }

    @Mock
    private Temperatures temperaturesMock;
    Map<String, Double> temperaturesMap = new HashMap<>();

    @Test
    void testCalculateForecastWithMock() {
        //Given
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5,quantityOfSensors);
    }

    @Test
    void testCalculateAverageWithMock() {
        //Given
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averegeTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(25.56,averegeTemperature);
    }

    @Test
    void testCalculateMedianeWithMock() {
        //Given
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianeTemperature = weatherForecast.calculateMedianTemperatures();

        //Then
        Assertions.assertEquals(25.5,medianeTemperature);
    }
}
