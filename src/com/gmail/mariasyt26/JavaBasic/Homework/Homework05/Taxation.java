package com.gmail.mariasyt26.JavaBasic.Homework.Homework05;


import java.util.Scanner;

public class Taxation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть свій дохід для розрахунку суми податків: ");
        double salary = scanner.nextFloat();
        double taxAmount;

        if (salary > 0 && salary <= 10_000) {
            taxAmount = salary * 0.025;
        } else if (salary > 10_000 && salary <= 25_000) {
            taxAmount = salary * 0.043;
        } else {
            taxAmount = salary * 0.067;
        }

        System.out.println("Сума податку складає: " + taxAmount);

    }
}
