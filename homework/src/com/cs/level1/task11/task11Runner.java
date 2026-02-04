package com.cs.level1.task11;

/**
 * Поиск минимального элемента массива
 * Написать программу, которая принимает массив целых чисел и находит минимальный элемент.
 */

public class task11Runner {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6};
        int min1 = minElement(values);
        System.out.println("Минимальный элемент из массива целых чисел равен: " + min1);
    }

    public static int minElement(int[] values) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }
}