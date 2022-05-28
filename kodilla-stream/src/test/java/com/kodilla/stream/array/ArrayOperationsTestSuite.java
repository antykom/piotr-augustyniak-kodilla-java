package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] arrayTest = {1, 40, 21, 44, 12, 53, 5, 3, 100, 54,22, 67, 41, 89, 394, 44, 69, 90, 39, 2};

        //When
        double resultTest = ArrayOperations.getAverage(arrayTest);

        //Then
        Assertions.assertEquals(59.5, resultTest);
    }
}
