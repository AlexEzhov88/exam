package ru.liga.ppr.exam.task_3_inheritance.abstractions;

import ru.liga.ppr.exam.task_3_inheritance.enums.FlyType;

/**
 * Абстрактный класс, представляющий птиц.
 * Все птицы имеют 50 позвонков и способны летать.
 */
public abstract class Bird implements Vertebrates {

	/**
	 * Возвращает способ полета птицы.
	 * @return Тип полета птицы.
	 */
	public abstract FlyType fly();

	/**
	 * Возвращает количество позвонков у птицы.
	 * @return Количество позвонков (50 для птиц).
	 */
	@Override
	public final int countOfVertebra() {
		return 50;
	}
}
