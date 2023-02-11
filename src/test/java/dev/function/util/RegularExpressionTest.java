package dev.function.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegularExpressionTest {
    @Test
    @DisplayName("Проверка строки по регулярному выражению")
    public void tryString() {
        boolean result =
                RegularExpressionOperation.checkingString("test@test.org", "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
        Assertions.assertTrue(result);
        result =
                RegularExpressionOperation.checkingString("123-12.999", "\\d{3}\\D\\d{3}\\s\\d{2}");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Проверка разбиения строки по регулярному выражению")
    public void trySplittingString() {
        String[] array =
                RegularExpressionOperation.splittingText("cat:dog;bird:cow", ":|;");
        Assertions.assertEquals("cat", array[0]);
        Assertions.assertEquals("dog", array[1]);
        Assertions.assertEquals("bird", array[2]);
        Assertions.assertEquals("cow", array[3]);

        array =
                RegularExpressionOperation.splittingText("blue.red@green-white", "!|,");
        Assertions.assertEquals("blue.red@green-white", array[0]);
    }
}
