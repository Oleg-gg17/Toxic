package homework;

/**
 * Задача 4. Сумма положительных и отрицательных чисел
 * Написать программу, которая из массива целых чисел считает отдельно сумму
 * положительных и сумму отрицательных элементов. Результат вывести на экран.
 */

public class Task4 {

    public static void main(String[] args) {

        int[] values = {0, 1, 2, -35, -5};
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > 0) {
                positiveSum += values[i];
            }
            if (values[i] < 0) {
                negativeSum += values[i];
            }

        }
        System.out.println("Сумма положительных чисел: " + positiveSum + " Сумма отрицательных чисел: " + negativeSum);
    }
}
