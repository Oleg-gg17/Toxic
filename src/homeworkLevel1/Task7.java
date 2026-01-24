package homeworkJava_1;

public class Task7 {
    /**
     * Конвертер температур
     * Написать программу, которая принимает число и символ единицы измерения (C или F).
     * С помощью оператора switch программа должна перевести температуру из Цельсия
     * в Фаренгейты или наоборот и вывести результат.
     */

    public static void main(String[] args) {
        double celsium = 67.0;
        double temp = convertInFahrenheit(celsium);
        System.out.println(celsium + " C = " + temp + " F");
    }

    public static double convertInFahrenheit(double celsium) {
        switch (0) {
            case 0:

            default:
                System.out.println(" ");
        }
        return (celsium * 1.8) + 32;
    }
}