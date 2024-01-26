package ru.liga.ppr.exam.task_1_gooseduck;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /**
     * Генерирует список строк от 1 до n, заменяя числа на строки
     * "Goose" для чисел, кратных трем, "Duck" для чисел, кратных пяти,
     * и "GooseDuck" для чисел, кратных и трем, и пяти.
     *
     * @param n Верхний предел диапазона чисел.
     * @return Список строк, соответствующих правилам "Goose" и "Duck".
     */
    public List<String> gooseDuck(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("GooseDuck");
            } else if (i % 3 == 0) {
                result.add("Goose");
            } else if (i % 5 == 0) {
                result.add("Duck");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
