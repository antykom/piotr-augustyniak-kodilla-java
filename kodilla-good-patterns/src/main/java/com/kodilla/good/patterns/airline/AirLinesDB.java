package com.kodilla.good.patterns.airline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirLinesDB {

    public static Map<String, List<String>> getAirLines() {
        List<String> firstConnection = new ArrayList<>();
        firstConnection.add("Warsaw");
        firstConnection.add("Frankfurt");
        firstConnection.add("New York");

        List<String> secondConnection = new ArrayList<>();
        secondConnection.add("Gdansk");
        secondConnection.add("");
        secondConnection.add("Cracow");

        List<String> thirdConnection = new ArrayList<>();
        thirdConnection.add("Warsaw");
        thirdConnection.add("Milano");
        thirdConnection.add("Madrid");

        Map<String, List<String>> airLines = new HashMap<>();
        airLines.put("1", firstConnection);
        airLines.put("2", secondConnection);
        airLines.put("3", thirdConnection);

        return airLines;
    }
}
