package HW_6;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Тесты для ListComparator")
public class ListComparatorTest {

    @Test
    @DisplayName("Тест сравнения списков")
    public void testCompareLists() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        ListComparator comparator = new ListComparator(list1, list2);
        Assert.assertEquals("Второй список имеет большее среднее значение", comparator.compareLists());

        list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        comparator = new ListComparator(list1, list2);
        Assert.assertEquals("Средние значения равны", comparator.compareLists());

        list1 = new ArrayList<>();
        list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        comparator = new ListComparator(list1, list2);
        Assert.assertEquals("Второй список имеет большее среднее значение", comparator.compareLists());

        list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list2 = new ArrayList<>();
        comparator = new ListComparator(list1, list2);
        Assert.assertEquals("Первый список имеет большее среднее значение", comparator.compareLists());
    }
}