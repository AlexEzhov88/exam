package ru.liga.ppr.exam.task_7_sql;

import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

/**
 * Класс DAO для работы с данными товаров.
 */
@Service
@RequiredArgsConstructor
public class GoodsDAO {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    /**
     * Получает производителей системных блоков с частотой не менее указанной.
     *
     * @param frequency Минимальная частота системных блоков для поиска.
     * @return SqlRowSet с результатами запроса, содержащими производителей.
     */
    public SqlRowSet getComputerWithFrequencyMoreThen(int frequency) {
        return jdbcTemplate.queryForRowSet(
                """
                         SELECT DISTINCT g.producer
                         FROM computer c
                         INNER JOIN goods g ON c.model = g.model
                         WHERE c.frequency >= :frequency
                           AND g.type = 'Computer'
                         ORDER BY g.producer DESC
                        """,
                Map.of("frequency", frequency));
    }
}
