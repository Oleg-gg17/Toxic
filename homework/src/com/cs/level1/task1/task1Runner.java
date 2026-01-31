package com.cs.level1.task1;

/**
 * Подсчёт чётных и нечётных чисел
 * Написать программу, в которой из массива переданных целых чисел считается количество чётных и
 * нечётных элементов, а результат выводится на экран. "Четных: x, Нечётных: y"
 */

public class task1Runner {

    public static void main(String[] args) {

        int[] values = {0, 1, 2, 5, 7, 8, -35, -22, 14, 56, 10, 101};
        int evenElement = getElementEven(values);
        int oddElement = getElementOdd(values);
        System.out.println("Количество четных элементов: " + evenElement + " , количество нечетных элементов: " + oddElement);
    }

    public static int getElementEven(int[] values) {
        int countEven = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    public static int getElementOdd(int[] values) {
        int countOdd = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }
}