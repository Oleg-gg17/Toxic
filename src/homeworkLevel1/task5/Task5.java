package homeworkJava_1.task5;

/**
 * Задача 5. Подсчёт гласных и согласных
 * Написать программу, которая в строке подсчитывает количество гласных и согласных букв.
 * Для проверки использовать цикл и условные операторы if-else.
 */

public class Task5 {

    public static void main(String[] args) {

        String[] words = {"Hello", "World", "Java"}; // Пример массива строк
        numberOfLatter(words);

    }

    public static void numberOfLatter(String[] words) {

        int vowelsLetter = 0;
        int consonantsLetter = 0;

        for (String word : words) { // Проходим по каждому слову в массиве
            word = word.toLowerCase(); // Приводим к нижнему регистру для удобства

            for (int i = 0; i < word.length(); i++) { // Проходим по каждому символу в слове
                char ch = word.charAt(i);

                if (Character.isLetter(ch)) { // Проверяем, является ли символ буквой
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                        vowelsLetter++; // Увеличиваем счетчик гласных
                    } else {
                        consonantsLetter++; // Увеличиваем счетчик согласных
                    }
                }
            }
        }
        System.out.println("Гласных: " + vowelsLetter);
        System.out.println("Согласных: " + consonantsLetter);
    }
}