package HW_6;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ListComparator {

    private List<Integer> list1;
    private List<Integer> list2;

    public ListComparator(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double calculateAverage(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum / list.size();
    }

    public String compareLists() {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}