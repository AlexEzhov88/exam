package ru.liga.ppr.exam.task_9_sql;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

/**
 * Класс ComputerDAO для взаимодействия с базой данных.
 */
@Service
@RequiredArgsConstructor
public class ComputerDAO {

	private final NamedParameterJdbcTemplate jdbcTemplate;

	/**
	 * Метод для получения производителей МФУ, которые также производят системные блоки
	 * с наименьшей ценой и наибольшей частотой среди всех наименее дорогих системных блоков.
	 *
	 * @param type тип товара (МФУ)
	 * @return SqlRowSet с результатами запроса
	 */
	public SqlRowSet getMFUProducers(String type) {
		return jdbcTemplate.queryForRowSet(
				"""
						SELECT DISTINCT g.producer
						FROM Goods g
						JOIN Computer c ON g.model = c.model
						WHERE g.producer IN (
						    SELECT producer
						    FROM Goods
						    WHERE type = :type
						)
						AND c.price = (
						    SELECT MIN(price)
						    FROM Computer
						)
						AND c.frequency = (
						    SELECT MAX(frequency)
						    FROM Computer
						    WHERE price = (
						        SELECT MIN(price)
						        FROM Computer
						    )
						)
						""", Map.of("type", type));
	}
}
