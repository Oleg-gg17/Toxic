package homeworkJava_1.task4;

/**
 * Задача 4. Сумма положительных и отрицательных чисел
 * Написать программу, которая из массива целых чисел считает отдельно сумму
 * положительных и сумму отрицательных элементов. Результат вывести на экран.
 */

public class Task4 {

    public static void main(String[] args) {

        int[] values = {0, 1, 2, -35, -5};
        int positive = positiveSum(values);
        int negative = negativeSum(values);
        System.out.println("Сумма положительных чисел: " + positive + " Сумма отрицательных чисел: " + negative);
    }

    public static int positiveSum(int[] values) {
        int countPositive = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > 0) {
                countPositive += values[i];
            }
        }
        return countPositive;
    }

    public static int negativeSum(int[] values) {
        int countNegative = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] < 0) {
                countNegative += values[i];
            }
        }
        return countNegative;
    }
}