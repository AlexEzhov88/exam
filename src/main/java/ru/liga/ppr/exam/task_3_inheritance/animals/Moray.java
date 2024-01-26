package ru.liga.ppr.exam.task_3_inheritance.animals;

import ru.liga.ppr.exam.task_3_inheritance.abstractions.Fish;
import ru.liga.ppr.exam.task_3_inheritance.enums.SwimType;

/**
 * Класс, представляющий мурену.
 * Мурена - это вид рыбы, плавающий с помощью изгибания тела.
 */
public class Moray extends Fish {

    /**
     * Возвращает способ плавания мурены.
     * @return Способ плавания - изгибание тела.
     */
    @Override
    public SwimType swim() {
        return SwimType.BODY_BENDING;
    }
}
