package dev.function.util;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс для описания методов с помощью каррирования для работ с регулярными выражениями
 * @version 1.0
 */
public class RegularExpressionOperation {
    /**
     * Метод для описания проверки строки по регулярному выражению
     * @param text - текст, который необходимо проверить
     * @param regExp - регулярное выражение, по которому проверяется текст
     * @return возвращает результат проверки текста по регулярному выражению
     */
    public static boolean checkingString(String text, String regExp) {
        Function<String, Function<String, Boolean>> function = a -> b -> {
            Pattern pattern = Pattern.compile(b);
            Matcher matcher = pattern.matcher(a);
            return matcher.matches();
        };
        return function.apply(text).apply(regExp);
    }
    /**
     * Метод для описания проверки разбиения строки по регулярному выражению
     * @param text - текст, который необходимо разбить
     * @param regExp - регулярное выражение, по которому будет разббиваться строка
     * @return возвращает массив с элементами, которые получены в результате разбиения строки по регулярному выражению
     */
    public static String[] splittingText(String text, String regExp) {
        Function<String, Function<String, String[]>> function = a -> b -> {
            Pattern pattern = Pattern.compile(b);
            String[] arrayStr = pattern.split(a);
            return arrayStr;
        };
        return function.apply(text).apply(regExp);
    }
}
