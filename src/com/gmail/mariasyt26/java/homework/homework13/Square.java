package com.gmail.mariasyt26.java.homework.homework13;

public class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double shapeArea() {
        return side * side;
    }
}
