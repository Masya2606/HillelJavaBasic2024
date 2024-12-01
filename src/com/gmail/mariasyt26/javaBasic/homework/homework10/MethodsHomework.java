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

        //Завдання 5

        System.out.println("5. Введіть а: ");
        int a  = scanner.nextInt();
        System.out.println("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println( "Результат " +  a + "^" + b + " дорівнює " + power(a,b));

        // Завдання 6

        System.out.println("6. Введіть ціле число n: ");
        int n  = scanner.nextInt();
        System.out.println("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        stringMultiplicator(n, text);
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

    public static int power (int a, int b){
        for (int i = 0; i <= b; i++){
            a *= a;
        }
        return a;
    }

    public static void stringMultiplicator ( int n, String text ){
        for (int i = 1; i <= n; i++) {
            System.out.println(text + "\n");
        }
    }
}
