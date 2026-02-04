package com.cs.level1.task8;

/**
 * Сумма элементов массива по условию
 * Написать программу, которая принимает массив целых
 * чисел и считает сумму только тех элементов, которые делятся на 3 без остатка.
 */

public class task8Runner {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 6, 9, 11, 22};
        int summa = sumArray(values);
        System.out.println("Сумма элементов, которые делятся на 3 без остатка равна: " + summa);
    }

    public static int sumArray(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 3 == 0) {
                sum += values[i];
            }
        }
        return sum;
    }
}