package com.gmail.mariasyt26.javaBasic.homework.homework07;

import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {
        int [] array = new int [10];

        for(int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
    }
    public static void print(int[] someArray){
        for(int i = 0; i < someArray.length; i++){ //індексація починається з нуля, отже пятий елемент масива має індекс чотири, тому строга нерівність
            System.out.print(someArray[i] + "\t");
        }
    }
    public static void sumNegatives (int [] someArray){
        int negativeSum = 0;
        for(int i = 0; i < someArray.length; i++){
            if (someArray[i] < 0) {
                negativeSum += someArray[i];
            }
        }
        System.out.println(negativeSum);
    }

    public static void oddNumbersCount (int [] someArray){
        int countEvenNumbers = 0;
        int countOddNumbers = 0;

        for(int i = 0; i < someArray.length; i++){
            if (someArray[i] % 2 == 0) {
                countEvenNumbers += 1;
            }
            else {
                countOddNumbers += 1;
            }
        }
        System.out.println("Even Numbers " + countEvenNumbers);
        System.out.println("Odd Numbers " + countOddNumbers);
    }

    public static void min (int [] someArray){
        int min = someArray[0];
        int minPosition = 0;
        for (int i = 0; i < someArray.length; i++){
            if (someArray[i] < min){
                min = someArray[i];
                minPosition = i;
            }
        }
        System.out.println("Min " + min);
        System.out.println("Min Position " + minPosition);
    }

    public static void max (int [] someArray){
        int max = someArray[0];
        int maxPosition = 0;
        for (int i = 0; i < someArray.length; i++){
            if (someArray[i] > max){
                max = someArray[i];
                maxPosition = i;
            }
        }
        System.out.println("Max " + max);
        System.out.println("Max Position " + maxPosition);
    }

    public static void averageAfterNegative (int [] someArray) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] < 0) {
                ++i;
                for (int j = i; j < someArray.length; j++) {
                    sum += someArray[j];
                    count += 1;
                }
                break;
            }
        }
        if (sum > 0) {
            System.out.println(sum / count);
        } else {
            System.out.println("No negatives found");
        }
    }
}

