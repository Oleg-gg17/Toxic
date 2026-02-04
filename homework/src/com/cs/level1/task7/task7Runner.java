package com.cs.level1.task7;

/**
 * Конвертер температур
 * Написать программу, которая принимает число и символ единицы измерения (C или F).
 * Перевести температуру из Цельсия в Фаренгейты или наоборот и вывести результат.
 */

public class task7Runner {

    public static void main(String[] args) {
        double celsium = 69.0;
        double temp = convertInFahrenheit(celsium);
        System.out.println(celsium + " C = " + temp + " F");
    }

    public static double convertInFahrenheit(double celsium) {
        return (celsium * 1.8) + 32;
    }
}