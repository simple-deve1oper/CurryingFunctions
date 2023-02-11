package dev.function.util;

import java.util.function.Function;

/**
 * Класс для описания методов с помощью каррирования для сложения чисел
 * @version 1.0
 */
public class NumberOperation {
    /**
     * Метод для описания сложения чисел
     * @param a - первое число
     * @param b - второе число
     * @return возвращает результат сложения двух чисел
     */
    public static double addingTwoNumbers(double a, double b) {
        Function<Double, Function<Double, Double>> adding = x -> y -> (x + y);
        return adding.apply(a).apply(b);
    }
}
