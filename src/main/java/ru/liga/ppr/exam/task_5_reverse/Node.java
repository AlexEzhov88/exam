package ru.liga.ppr.exam.task_5_reverse;

/**
 * Класс представляет узел двусвязного списка.
 *
 * @param <V> Тип данных, хранящихся в узле.
 */
class Node<V> {
    public V value;
    public Node<V> next;
    public Node<V> prev;

    /**
     * Создает новый узел двусвязного списка.
     *
     * @param value Значение, хранящееся в узле.
     * @param next Ссылка на следующий узел в списке.
     * @param prev Ссылка на предыдущий узел в списке.
     */
    public Node(V value, Node<V> next, Node<V> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
