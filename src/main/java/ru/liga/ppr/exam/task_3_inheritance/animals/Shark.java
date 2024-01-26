package ru.liga.ppr.exam.task_3_inheritance.animals;

import ru.liga.ppr.exam.task_3_inheritance.abstractions.Fish;
import ru.liga.ppr.exam.task_3_inheritance.enums.SwimType;

/**
 * Класс, представляющий акулу.
 * Акула - это вид рыбы, плавающий с помощью плавников.
 */
public class Shark extends Fish {

    /**
     * Возвращает способ плавания акулы.
     * @return Способ плавания - использование плавников.
     */
    @Override
    public SwimType swim() {
        return SwimType.FIN;
    }
}
