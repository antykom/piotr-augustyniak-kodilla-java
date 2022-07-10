package com.kodilla.good.patterns.challenges;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MovieStore {
    public static Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public static void main(String[] args) {
        Map<String, List<String>> movieList;
        movieList = getMovies();
        List<String> list = new ArrayList<>();


        movieList.values().stream()
                .forEach(e -> {
                    for (int i = 0; i < e.size(); i++) {
                        list.add(e.get(i));
                    }
                });

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(list.get(list.size() - 1))) {
                System.out.print(list.get(i));
                return;
            }
            System.out.print(list.get(i) + " ! ");
        }


    }
}
