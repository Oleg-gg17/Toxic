package homeworkJava_1;

public class Task8 {
    /** Сумма элементов массива по условию
     Написать программу, которая принимает массив целых
     чисел и считает сумму только тех элементов, которые делятся на 3 без остатка. */

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 6, 9, 11, 22};
        int sum = 0;
        for (int i = 0; i < values.length ; i++) {
            if (values[i] % 3 == 0){
                sum += values[i];
            }
        }
        System.out.println("Сумма элементов, которые делятся на 3 без остатка равна: " + sum);
    }
}
