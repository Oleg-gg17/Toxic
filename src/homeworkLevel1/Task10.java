package homeworkJava_1;

public class Task10 {

    /**
     * Сумма чисел до N
     * Написать программу, которая принимает число N и с помощью цикла считает сумму всех чисел от 1 до N.
     */

    public static void main(String[] args) {
        int mean = 7;
        int result = sumArray(mean);
        System.out.println("Сумма всех чисел от 1 до " + mean + " равна: " + result);
    }

    public static int sumArray(int mean) {
        int summa = (mean * (mean + 1)) / 2;
        return summa;
    }
}