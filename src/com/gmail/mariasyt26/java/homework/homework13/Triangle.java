package com.gmail.mariasyt26.java.homework.homework13;

public class Triangle implements GeometricShape {
    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public void shapeArea() {
        System.out.printf("The are of the triangle = %.2f", 0.5 * height * base);
    }
}
