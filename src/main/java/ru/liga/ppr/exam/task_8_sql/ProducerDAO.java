package ru.liga.ppr.exam.task_8_sql;

import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

/**
 * Класс DAO для получения информации о производителях и их продукции.
 */
@Service
@RequiredArgsConstructor
public class ProducerDAO {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    /**
     * Получает производителей и количество моделей системных блоков, выпускающих не менее заданного числа моделей.
     *
     * @param minModels минимальное количество моделей, которое должен выпускать производитель
     * @return SqlRowSet с результатами запроса, включая производителя и количество моделей
     */
    public SqlRowSet getProducerAndStatsHavingMoreThen3Models(int minModels) {
        return jdbcTemplate.queryForRowSet(
                """
                        SELECT
                            producer,
                            COUNT(model)
                        FROM
                            Goods
                        WHERE
                                type = 'Computer'
                        GROUP BY
                            producer
                        HAVING
                                COUNT(model) >= :minModels
                        ORDER BY
                            producer DESC;

                                                """, Map.of("minModels", minModels));
    }
}
