package homeworkJava_1;
public class Task10 {

/**
 * Сумма чисел до N
 * Написать программу, которая принимает число N и с помощью цикла считает сумму всех чисел от 1 до N.
 */

    public static void main(String[] args) {
        int N = 7;
        int S = SumArray(N);
        System.out.println("Сумма всех чисел от 1 до " + N + " равна: " + S);
    }

    public static int SumArray(int N) {
        int Summa = (N * (N + 1)) / 2;
        return Summa;
    }
}

