package com.gmail.mariasyt26.java.homework.homework13;

public class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double shapeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
