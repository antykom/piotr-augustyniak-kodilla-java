package com.kodilla.testing.shape;

public class Square implements Shape{
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getField() {
        return sideLength * sideLength;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }
}
