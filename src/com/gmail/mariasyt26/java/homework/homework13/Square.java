package com.gmail.mariasyt26.java.homework.homework13;

public class Square implements GeometricShape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void shapeArea(){
        System.out.println("The area of the square with the side" + side + " cm = " + side*side);
    }
}
