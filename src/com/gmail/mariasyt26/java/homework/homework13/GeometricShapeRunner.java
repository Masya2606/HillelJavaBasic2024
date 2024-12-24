package com.gmail.mariasyt26.java.homework.homework13;

public class GeometricShapeRunner {
    public static void main(String[] args) {
        GeometricShape[] geometricShapes = {
                new Circle(10),
                new Square(5),
                new Triangle(10, 5)
        };
        for (GeometricShape shape : geometricShapes) {
            shape.shapeArea();
            System.out.println();
        }
    }
}
