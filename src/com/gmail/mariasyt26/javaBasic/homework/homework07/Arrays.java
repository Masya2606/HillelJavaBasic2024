package com.gmail.mariasyt26.javaBasic.homework.homework07;

import java.util.concurrent.ThreadLocalRandom;

public class Arrays {
    public static void main(String[] args) {
        int [] array = new int [10];

        for(int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
    }
}

