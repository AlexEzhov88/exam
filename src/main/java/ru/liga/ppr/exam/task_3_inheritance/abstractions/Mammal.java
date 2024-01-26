package ru.liga.ppr.exam.task_3_inheritance.abstractions;

/**
 * Абстрактный класс, представляющий млекопитающих.
 * Все млекопитающие имеют 33 позвонка.
 */
public abstract class Mammal implements Vertebrates {

	/**
	 * Возвращает количество позвонков у млекопитающего.
	 * @return Количество позвонков (33 для млекопитающих).
	 */
	@Override
	public int countOfVertebra() {
		return 33;
	}
}
