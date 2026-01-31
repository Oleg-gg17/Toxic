package homeworkJava_1.task2;

/**
 * Задача 2. Поиск максимального элемента массива
 * Написать программу, которая из массива целых чисел находит
 * максимальный элемент и выводит его значение.
 */

public class Task2 {

    public static void main(String[] args) {
        int[] values = {0, 1, 2, 5, 7, 8, -35, -22, 14, 135, 56, 10, 101};
        int mean = maxElement(values);
        System.out.println("Максимальный элемент: " + mean);
    }

    public static int maxElement(int[] values) {
        int max = values[0]; // предполагаем, что первый элемент максимальный
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}