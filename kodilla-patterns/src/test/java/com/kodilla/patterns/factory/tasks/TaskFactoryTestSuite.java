package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testTaskShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Grocery", shopping.getTaskName());
        assertFalse(shopping.isTaskExecuted());
    }

    @Test
    void testTaskPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Bedroom", painting.getTaskName());
        assertFalse(painting.isTaskExecuted());
    }

    @Test
    void testTaskDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Holiday", driving.getTaskName());
        assertFalse(driving.isTaskExecuted());
    }
}
