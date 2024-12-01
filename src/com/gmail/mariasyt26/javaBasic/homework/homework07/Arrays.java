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
}

