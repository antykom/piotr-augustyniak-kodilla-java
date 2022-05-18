package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double result =0;
        int counter = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            result += temperature.getValue();
            counter++;
        }
        return result / counter;
    }

    public double calculateMedianTemperatures() {
        Map<String, Double> map1 = new HashMap<String, Double>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            map1.put(temperature.getKey(), temperature.getValue());
        }

        List<Map.Entry<String, Double> > list =
                new LinkedList<Map.Entry<String, Double> >(map1.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Double> >() {
            public int compare(Map.Entry<String, Double> o1,
                               Map.Entry<String, Double> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        int listSize = list.size();

        if (listSize % 2 == 0) {
            return ( list.get(listSize / 2).getValue() + list.get(listSize /2 - 1).getValue()) / 2;
        } else {
            return list.get(listSize / 2 ).getValue();
        }

    }
}
