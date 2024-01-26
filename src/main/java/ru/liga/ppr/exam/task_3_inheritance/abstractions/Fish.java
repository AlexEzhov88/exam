package ru.liga.ppr.exam.task_3_inheritance.abstractions;

import ru.liga.ppr.exam.task_3_inheritance.enums.SwimType;

/**
 * Абстрактный класс, представляющий рыб.
 * Все рыбы имеют 20 позвонков и способны плавать.
 */
public abstract class Fish implements Vertebrates {

	/**
	 * Возвращает способ плавания рыбы.
	 * @return Тип плавания рыбы.
	 */
	public abstract SwimType swim();

	/**
	 * Возвращает количество позвонков у рыбы.
	 * @return Количество позвонков (20 для рыб).
	 */
	@Override
	public final int countOfVertebra() {
		return 20;
	}
}
