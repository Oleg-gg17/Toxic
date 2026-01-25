package homeworkJava_1.task6;

/**
 * Задача 6. Среднее значение массива
 * Написать программу, которая в массиве целых чисел, вычисляет их среднее арифметическое и выводит результат.
 * Дополнительно программа должна определить, сколько элементов массива больше среднего значения.
 */

public class Task6 {

    public static void main(String[] args) {
        int[] values = {2, 3, 4, 5};
        meanNumber(values);
        numberOfElements(values);
        System.out.println("Среднее арифметическое: " + meanNumber(values));
        System.out.println("Количество элементов массива больше среднего значения: " + numberOfElements(values));
    }

    public static double meanNumber(int[] values) {
        double sum = 0; // Переменная для хранения суммы
        int count = values.length; // Количество элементов
        // Суммируем все числа в массиве
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        double average = sum / count; // Вычисляем среднее
        return average;
    }

    public static int numberOfElements(int[] values) {
        int num = 0; // Счетчик для элементов массива больше среднего значения

        for (int i = 0; i < values.length; i++) {
            if (values[i] > meanNumber(values)) {
                num++;
            }
        }
        return num;
    }
}