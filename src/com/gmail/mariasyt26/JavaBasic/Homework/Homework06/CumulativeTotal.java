package com.gmail.mariasyt26.JavaBasic.Homework.Homework06;

public class CumulativeTotal {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += i;
            System.out.println("Num is " + i + ", sum is " + sum );
        }

        sum = 0; //overloading the variable
        int i = 1;
        while (i <= num){
            sum += i;
            System.out.println("Num is " + i + ", sum is " + sum);
            i++;
        }

        sum = 0; //overloading the variable
        i = 1; //overloading the variable
        do {
            sum += i;
            System.out.println("Num is " + i + ", sum is " + sum);
            i++;
        } while (num >= i);

        for (int j = 0; j <= 18; j++){
            System.out.print("-");
        }
        System.out.println(" \nSum of numbers is " + sum );
    }
}
