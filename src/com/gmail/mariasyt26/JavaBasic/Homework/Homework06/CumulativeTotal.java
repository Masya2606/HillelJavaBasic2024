package com.gmail.mariasyt26.JavaBasic.Homework.Homework06;

public class CumulativeTotal {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += i;
            System.out.println("Num is " + i + ", sum is " + sum );
        }
    }
}
