package com.gmail.mariasyt26.javaBasic.homework.homework08;

import java.util.concurrent.ThreadLocalRandom;

public class ArraySort {
    public static void main(String[] args) {
        int [] array = new int [15];

        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
    }
}
