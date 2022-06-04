package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class probablyIWillThrowException {
    @Test
    void testIfItThrowException() {
        //Given
        SecondChallenge sc = new SecondChallenge();

        //When

        //Then
        assertAll(
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(2, 5)),
                () -> assertDoesNotThrow(() -> sc.probablyIWillThrowException(1, 5)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(1, 1.5))
        );
    }
}
