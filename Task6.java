package homework;

/**
 * Задача 6. Среднее значение массива
 * Написать программу, которая в массиве целых чисел, вычисляет их среднее арифметическое и выводит результат.
 * Дополнительно программа должна определить, сколько элементов массива больше среднего значения.
 */

public class Task6 {

    public static void main(String[] args) {
        int[] values = {2, 3, 4, 5};
        int num = 0; // Счетчик для элементов массива больше среднего значения
        int sum = 0; // Переменная для хранения суммы
        int count = values.length; // Количество элементов
        // Суммируем все числа в массиве
        for (int number : values) {
            sum += number;
        }
        double average = (double) sum / count; // Вычисляем среднее
        for (int i = 0; i < values.length; i++) {
            if (values[i] > average)
                num++;
        }
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Количество элементов массива больше среднего значения: " + num);
    }
}


