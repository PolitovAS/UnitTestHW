package HW_3.NumberInInterval;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты для метода numberInInterval")
public class NumberInIntervalTest {

    @Test
    @DisplayName("Число в интервале (25;100)")
    void numberInInterval() {
        //Подготовка данных
        int n = 50;

        //Выполнение теста
        boolean result = NumberInInterval.numberInInterval(n);

        //Проверка результата
        assertTrue(result, "Число не попадает в интервал (25;100)");
    }

    @Test
    @DisplayName("Число меньше 25")
    void numberLessThan25() {
        //Подготовка данных
        int n = 20;

        //Выполнение теста
        boolean result = NumberInInterval.numberInInterval(n);

        //Проверка результата
        assertFalse(result, "Число попадает в интервал (25;100)");
    }

    @Test
    @DisplayName("Число больше 100")
    void numberGreaterThan100() {
        //Подготовка данных
        int n = 110;

        //Выполнение теста
        boolean result = NumberInInterval.numberInInterval(n);

        //Проверка результата
        assertFalse(result, "Число попадает в интервал (25;100)");
    }
}
