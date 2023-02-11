package dev.function.main;

import dev.function.util.NumberOperation;
import dev.function.util.RegularExpressionOperation;

import java.util.Arrays;

/**
 * Класс для запуска приложения
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    // пример 1
    private static void example1() {
        double result = NumberOperation.addingTwoNumbers(7, 8);
        System.out.printf("Результат сложения чисел %.2f и %.2f: %.2f%n", 7.0, 8.0, result);
        result = NumberOperation.addingTwoNumbers(5.5, 6.7);
        System.out.printf("Результат сложения чисел %.2f и %.2f: %.2f%n", 5.5, 6.7, result);
    }

    // пример 2
    private static void example2() {
        boolean result =
                RegularExpressionOperation.checkingString("test@test.org", "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
        System.out.printf("Подходит ли текст '%s' регулярному выражению '%s': %b%n", "test@test.org", "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$", result);
        result =
                RegularExpressionOperation.checkingString("123-12.999", "\\d{3}\\D\\d{3}\\s\\d{2}");
        System.out.printf("Подходит ли текст '%s' регулярному выражению '%s': %b%n", "123-12.999", "\\d{3}\\D\\d{3}\\s\\d{2}", result);
    }

    // пример 3
    private static void example3() {
        String[] result = RegularExpressionOperation.splittingText("cat:dog;bird:cow", ":|;");
        if (result.length == 1) {
            System.out.printf("Строка '%s' не разбилась на массив при помощи регулярного выражения '%s'%n", "cat:dog;bird:cow", ":|;");
        } else {
            System.out.printf("Массив после разбития строки '%s' при помощи регулярного выражения '%s' выглядит следующим образом: %s%n",
                    "cat:dog;bird:cow", ":|;", Arrays.toString(result));
        }
    }
}
