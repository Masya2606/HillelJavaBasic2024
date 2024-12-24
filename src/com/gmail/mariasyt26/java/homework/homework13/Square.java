package com.gmail.mariasyt26.java.homework.homework13;

public class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void shapeArea() {
        System.out.printf("The area of the square with the side" + side + " cm = %.2f", side * side);
    }
}
