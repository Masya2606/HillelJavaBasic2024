package com.gmail.mariasyt26.javaBasic.homework.homework08;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraySort {
    public static void main(String[] args) {
        int [] array = new int [15];

        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }

        System.out.print("Початковий вигляд масиву: ");
        print(array);

        insertionSort(array);
        System.out.print("\nBідсортований масив: ");
        print(array);


        System.out.println("\nБудь ласка вкажіть число, яке Ви шукаєте: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(binarySearch(array, number));


    }
    public static void print(int[] someArray) {
        for (int i = 0; i < someArray.length; i++) { //індексація починається з нуля, отже пятий елемент масива має індекс чотири, тому строга нерівність
            System.out.print(someArray[i] + "\t");
        }
    }


    public static void insertionSort(int[] someArray) {
        for (int i = 1; i < someArray.length; i++) {
            int currentValue = someArray[i];
            int j = i - 1;
            while (j >= 0 && someArray[j] > currentValue) {
                // Переміщення елементів, які більше за currentValue, на одну позицію вперед
                someArray[j + 1] = someArray[j];
                j--;
            }
            // Вставлення currentValue на правильну позицію у відсортованій частині масиву
            someArray[j + 1] = currentValue;
        }
    }

        //як можна змінити код, аби якщо число не знайдено, не друкувало -1?
        //пробувала за допомогою void аби без return, а воно пише "can't resolve method" :((
        public static int binarySearch(int[] someArray, int searchedNumber){
            int left = 0;//індекс
            int right = someArray.length - 1;
            do{
                int middle = (left + right)/2;
                if (someArray[middle] > searchedNumber){ //якщо то шо ми шукаємо менше за мідл, то ми переміщуємося вліво
                    right = middle -1 ; //-1 бо ми виключиємо мідл = звужуємо пошук бо число шо ми шукаємо не може бути мідл
                } else if (someArray[middle] < searchedNumber) {
                    left = middle + 1;
                } else {
                    System.out.println("Число, яке Ви шукали знаходиться в позиції: " + middle);
                    return middle;
                }

            }while (left<=right);//поки ліва межа лівіша ніж права
            System.out.println("Нажаль шукаємого числа в масиві не знайдено");
            return -1; //нічого не знайдено
        }
    }
