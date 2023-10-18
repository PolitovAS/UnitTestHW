package HW_3.EvenOddNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class EvenOddNumberTest {
    private EvenOddNumber number;
    @BeforeEach
    public void setUp(){
        number = new EvenOddNumber();
    }

    // Тест на четное число
    @Test
    @DisplayName("Тест на четное число")
    public void testEvenNumber() {
        boolean result = number.evenOddNumber(4); // Вызываем метод evenOddNumber с аргументом 4 и сохраняем результат в переменную result
        assertTrue(result); // Проверяем, что результат равен true (ожидаемое значение для четного числа)
    }

    // Тест на нечетное число
    @DisplayName("Тест на нечетное число")
    @Test
    public void testOddNumber() {
        boolean result = number.evenOddNumber(7); // Вызываем метод evenOddNumber с аргументом 7 и сохраняем результат в переменную result
        assertFalse(result); // Проверяем, что результат равен false (ожидаемое значение для нечетного числа)
    }

    // Тест на ноль
    @DisplayName("Тест на ноль")
    @Test
    public void testZero() {
        boolean result = number.evenOddNumber(0); // Вызываем метод evenOddNumber с аргументом 0 и сохраняем результат в переменную result
        assertTrue(result); // Проверяем, что результат равен true (ожидаемое значение для нуля)
    }
    // Тест на отрицательное четное число
    @DisplayName("Тест на отрицательное четное число")
    @Test
    public void testNegativeEvenNumber() {
        boolean result = number.evenOddNumber(-6); // Вызываем метод evenOddNumber с аргументом -6 и сохраняем результат в переменную result
        assertTrue(result); // Проверяем, что результат равен true (ожидаемое значение для отрицательного четного числа)
    }
    // Тест на отрицательное нечетное число
    @DisplayName("Тест на отрицательное нечетное число")
    @Test
    public void testNegativeOddNumber() {
        boolean result = number.evenOddNumber(-9); // Вызываем метод evenOddNumber с аргументом -9 и сохраняем результат в переменную result
        assertFalse(result); // Проверяем, что результат равен false (ожидаемое значение для отрицательного нечетного числа)
    }
}