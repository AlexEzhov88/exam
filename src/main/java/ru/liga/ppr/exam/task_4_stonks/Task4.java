package ru.liga.ppr.exam.task_4_stonks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {

    /**
     * Проверяет, являются ли два портфеля акций одинаковыми.
     * Портфели считаются одинаковыми, если содержат одинаковые коды акций
     * в одинаковом количестве, независимо от порядка акций.
     *
     * @param stocks1 Список акций первого портфеля.
     * @param stocks2 Список акций второго портфеля.
     * @return true, если портфели одинаковые, иначе false.
     */
    public boolean checkEquals(List<String> stocks1, List<String> stocks2) {
        // Если размеры списков разные, портфели точно разные
        if (stocks1.size() != stocks2.size()) {
            return false;
        }

        Map<String, Integer> stockCounts = new HashMap<>();

        // Подсчет количества акций в первом портфеле
        for (String stock : stocks1) {
            stockCounts.put(stock, stockCounts.getOrDefault(stock, 0) + 1);
        }

        // Уменьшение счетчика для акций во втором портфеле
        for (String stock : stocks2) {
            if (!stockCounts.containsKey(stock)) {
                return false; // Найдена акция, которой нет в первом портфеле
            }
            stockCounts.put(stock, stockCounts.get(stock) - 1);
            if (stockCounts.get(stock) == 0) {
                stockCounts.remove(stock); // Удаляем акцию, если ее счетчик равен нулю
            }
        }

        // Проверяем, остались ли акции с ненулевым счетчиком
        return stockCounts.isEmpty();
    }
}
