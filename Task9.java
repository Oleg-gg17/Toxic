package homeworkJava_1;

public class Task9 {
    /**
     * Определение сезона по номеру месяца
     * Написать программу, которая принимает число от 1 до 12 и с помощью оператора switch
     * определяет сезон (зима, весна, лето, осень). Если число не входит в диапазон,
     * вывести сообщение об ошибке: "Неверно указан номер месяца"
     */

    public static void main(String[] args) {
        int month = 76;
        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Неверно указан номер месяца");
        }
    }
}
