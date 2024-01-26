package ru.liga.ppr.exam.task_5_reverse;

public class Task5 {

    /**
     * Разворачивает двусвязный список.
     * После разворота, последний элемент становится первым, и наоборот.
     *
     * @param head Начальный узел списка для разворота.
     * @return Новый начальный узел списка после разворота.
     */
    public static Node<String> reverse(Node<String> head) {
        Node<String> current = head;
        Node<String> newHead = null;

        while (current != null) {
            // Запоминаем предыдущий узел
            Node<String> prev = current.prev;
            // Меняем местами prev и next
            current.prev = current.next;
            current.next = prev;
            // Перемещаем newHead на текущий узел
            newHead = current;
            // Переходим к следующему узлу в исходном списке
            current = current.prev;
        }

        return newHead;
    }
}
