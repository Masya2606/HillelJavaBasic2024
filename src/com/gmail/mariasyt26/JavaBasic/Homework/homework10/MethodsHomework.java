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


        //Завдання 3

        int [] intArray = new int [] { 10, 20, 30, 40, 50};
        System.out.println("3. Масив чисел: [10, 20, 30, 40, 50] \nСума всіх елементів масиву дорівнює " + arraySum(intArray) );


        //Завдання 4
        //чому метод видає помилку, якщо не створювати новий об'єкт scanner?
        System.out.println("4. Введіть рядок: ");
        Scanner scannedLine = new Scanner(System.in);
        String line = scannedLine.nextLine();
        System.out.println( "Рядок в зворотньому порядку: " + reverseString(line));

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

    public static int arraySum (int [] numbers ){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static String reverseString(String string){
        String reversedString = "";
        int i = string.length() - 1;
        do{
            reversedString = reversedString + string.charAt(i);
            i--;
        } while ( i >= 0);
        return reversedString;
    }
}