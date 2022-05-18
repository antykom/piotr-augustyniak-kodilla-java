package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private int baseLength;
    private int height;

    public Triangle(int baseLength, int height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double getField() {
        return 0.5 * baseLength * height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "baseLength=" + baseLength +
                ", height=" + height +
                '}';
    }
}
