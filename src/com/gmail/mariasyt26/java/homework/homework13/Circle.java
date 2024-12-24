package com.gmail.mariasyt26.java.homework.homework13;

public class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void shapeArea() {
        System.out.printf("The area of the circle with radius of " + radius + " cm = %.2f", Math.PI * Math.pow(radius, 2));
    }
}
