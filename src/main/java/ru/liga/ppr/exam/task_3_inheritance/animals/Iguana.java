package ru.liga.ppr.exam.task_3_inheritance.animals;

import ru.liga.ppr.exam.task_3_inheritance.abstractions.Reptile;

/**
 * Класс, представляющий игуану, являющуюся видом рептилий.
 * Игуана не умеет отбрасывать хвост.
 */
public class Iguana extends Reptile {

	/**
	 * Проверяет, может ли игуана отбросить хвост.
	 * @return false, так как игуана не может отбросить хвост.
	 */
	@Override
	public boolean canDropTheTail() {
		return false;
	}
}
