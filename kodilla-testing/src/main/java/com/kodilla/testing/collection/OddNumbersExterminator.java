package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> newNumbers = new ArrayList<Integer>();

        for(Integer num : numbers){
            if(num%2==0){
                newNumbers.add(num);
            }
        }
        return newNumbers;
    }
}
