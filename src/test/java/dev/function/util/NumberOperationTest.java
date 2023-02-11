package dev.function.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberOperationTest {
    @Test
    @DisplayName("Проверка сложения чисел")
    public void tryAddNumbers() {
        double result = NumberOperation.addingTwoNumbers(7, 8);
        Assertions.assertEquals(15, result);
        result = NumberOperation.addingTwoNumbers(5.5, 6.7);
        Assertions.assertEquals(12.2, result);
    }
}
