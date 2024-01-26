package ru.liga.ppr.exam.task_3_inheritance.abstractions;

/**
 * Абстрактный класс, представляющий рептилий.
 * Все рептилии имеют 40 позвонков.
 */
public abstract class Reptile implements Vertebrates {

	/**
	 * Проверяет, может ли рептилия отбросить хвост.
	 * @return true, если рептилия может отбросить хвост, иначе false.
	 */
	public abstract boolean canDropTheTail();

	/**
	 * Возвращает количество позвонков у рептилии.
	 * @return Количество позвонков (40 для рептилий).
	 */
	@Override
	public int countOfVertebra() {
		return 40;
	}
}
