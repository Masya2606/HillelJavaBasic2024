package com.gmail.mariasyt26.javaBasic.homework.homework10;

import java.util.Scanner;

public class MethodsHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Завдання 1

        System.out.println("1. Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.println( "Квадрат числа " +  number + " дорівнює " + square(number));

    }

    public static int square ( int a ){
        return a * a;
    }
}