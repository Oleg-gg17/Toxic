package homeworkJava_1.task9;

public class Task9 {
    /**
     * Определение сезона по номеру месяца
     * Написать программу, которая принимает число от 1 до 12 и с помощью оператора switch
     * определяет сезон (зима, весна, лето, осень). Если число не входит в диапазон,
     * вывести сообщение об ошибке: "Неверно указан номер месяца"
     */

    public static void main(String[] args) {
        int month = 6;
        System.out.println(getSeason(month));
    }

    public static String getSeason(int month) {

        switch (month) {
            case 12, 1, 2:
                return "Winter";
            case 3, 4, 5:
                return "Spring";
            case 6, 7, 8:
                return "Summer";
            case 9, 10, 11:
                return "Autumn";
            default:
                return "Неверно указан номер месяца";
        }
    }
}