package homeworkJava_1;

/**
 * Задача 3. Таблица умножения с условием
 * Написать программу, которая выводит таблицу умножения для числа 7,
 * но показывает только те строки, где результат меньше 50.
 */

public class Task3 {

    public static void main(String[] args) {
        int[] values = {0, 1, 2, 5, 7, 8, -35, -22, 14, 56, 10, 101};
        multiplicationTable(values);
    }

    public static void multiplicationTable(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int number = values[i] * 7;
            if (number < 50) {
                System.out.println(values[i] + " * 7 = " + number);
            }
        }
    }
}