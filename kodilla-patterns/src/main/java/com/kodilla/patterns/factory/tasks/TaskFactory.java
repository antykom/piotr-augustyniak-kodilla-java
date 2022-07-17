package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task createTask(final String taskClass) {
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("Grocery", "Bread", 2.0);
            case DRIVING:
                return new DrivingTask("Holiday", "Rome", "Bus");
            case PAINTING:
                return new PaintingTask("Bedroom", "White", "Walls");
            default:
                return null;
        }
    }
}
