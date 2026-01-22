package homeworkJava_1;

public class Task7 {
    /**
     * Конвертер температур
     * Написать программу, которая принимает число и символ единицы измерения (C или F).
     * С помощью оператора switch программа должна перевести температуру из Цельсия
     * в Фаренгейты или наоборот и вывести результат.
     */

    public static void main(String[] args) {
        double celsium = 67;
        double fahrenheit;
        switch (0){
            case 0:
                fahrenheit = (celsium * 1.8) + 32;
                System.out.println(celsium + " C = " + fahrenheit + " F");
                break;
            default:
                System.out.println(" ");
        }
    }
    }

