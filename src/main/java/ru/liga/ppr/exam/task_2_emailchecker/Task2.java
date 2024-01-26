package ru.liga.ppr.exam.task_2_emailchecker;

import java.util.regex.Pattern;

public class Task2 {

	private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9]{1,15}@(teta|tetaent|tetacomp)\\.(ru|org|com)$");

	/**
	 * Проверяет, соответствует ли входящий email заданным требованиям.
	 *
	 * @param address Адрес электронной почты для проверки.
	 * @return true, если адрес соответствует требованиям, иначе false.
	 */
	public boolean checkEmail(String address) {
		if (address == null || address.isEmpty()) {
			return false;
		}
		return EMAIL_PATTERN.matcher(address).matches();
	}
}
