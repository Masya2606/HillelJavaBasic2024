package com.gmail.mariasyt26.java.homework.homework13;

public class GeometricShapeRunner {
    public static void main(String[] args) {
        GeometricShape[] geometricShapes = {
                new Circle(10),
                new Square(5),
                new Triangle(10, 5)
        };

        double sumArea = 0;
        for (GeometricShape shape : geometricShapes) {
            sumArea += shape.shapeArea();
        }
        System.out.printf("Сумарна площа всіх фігур дорівнює: %.2f", sumArea);
    }
}
