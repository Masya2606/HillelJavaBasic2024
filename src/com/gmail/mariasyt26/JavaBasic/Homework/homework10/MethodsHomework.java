package com.gmail.mariasyt26.javaBasic.homework.homework10;

import java.util.Scanner;

public class MethodsHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Завдання 1

        System.out.println("1. Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.println( "Квадрат числа " +  number + " дорівнює " + square(number));


        //Завдання 2

        System.out.println("2. Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.println("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        System.out.println( "Об'єм циліндра радіусом " +  radius + " та висотою " + height + " дорівнює " + cylinderVolume(radius, height));

    }

    public static int square ( int a ){
        return a * a;
    }

    public static double square ( double a ){
        return a * a;
    }

    public static double cylinderVolume (double radius, double height){
        return Math.PI * square(radius) * height;
    }
}