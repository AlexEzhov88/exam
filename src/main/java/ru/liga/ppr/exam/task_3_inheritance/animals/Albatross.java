package ru.liga.ppr.exam.task_3_inheritance.animals;

import ru.liga.ppr.exam.task_3_inheritance.abstractions.Bird;
import ru.liga.ppr.exam.task_3_inheritance.enums.FlyType;

/**
 * Класс, представляющий альбатроса.
 * Альбатрос - это вид птицы, летающий с помощью взмаха крыльев.
 */
public class Albatross extends Bird {

    /**
     * Возвращает способ полета альбатроса.
     * @return Способ полета - взмах крыльев.
     */
    @Override
    public FlyType fly() {
        return FlyType.FLAPPING_OF_WINGS;
    }
}
