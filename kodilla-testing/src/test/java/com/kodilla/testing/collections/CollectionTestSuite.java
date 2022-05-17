package com.kodilla.testing.collections;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Test odd numbers exterminator EMPTY LIST")
    @Test
    void testCaseEmptyList(){
        //Given
        OddNumbersExterminator oddNumEx = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<Integer>();
        //When
        List<Integer> result = oddNumEx.exterminate(testList);
        List<Integer> expectedList = Arrays.asList();
        //Then
        Assertions.assertTrue(result.isEmpty() && expectedList.isEmpty());
    }

    @DisplayName("Test odd numbers exterminator NORMAL LIST")
    @Test
    void testCaseNormalList(){
        //Given
        OddNumbersExterminator oddNumEx = new OddNumbersExterminator();
        List<Integer> testList = new ArrayList<>();
        for(int i =1; i<=10; i++){
            testList.add(i);
        }
        //When
        List<Integer> result = oddNumEx.exterminate(testList);
        List<Integer> expectedList = Arrays.asList(2,4,6,8,10);
        //Then
        Assertions.assertTrue(expectedList.containsAll(result) && result.containsAll(expectedList));
    }

}
