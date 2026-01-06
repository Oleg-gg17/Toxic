package homework;

/**
 * Подсчёт чётных и нечётных чисел
 * Написать программу, в которой из массива переданных целых чисел считается количество чётных и
 * нечётных элементов, а результат выводится на экран. "Четных: x, Нечётных: y"
 */

public class Task1 {

    public static void main(String[] args) {

        int[] values = {0, 1, 2, 5, 7, 8, -35, -22, 14, 56, 10, 101};
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Количество четных элементов: " + countEven + " , количество нечетных элементов: " + countOdd);
    }

}
