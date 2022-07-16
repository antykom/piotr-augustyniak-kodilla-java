package com.kodilla.patterns.singelton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void getLastLog(){
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("System not found");

        //When
        String result = logger.getLastLog();

        //Then
        assertEquals("System not found", result);
    }
}
