package ru.liga.ppr.exam.task_6_treesum;

public class Task6TreeSum {

    /**
     * Вычисляет сумму всех элементов в бинарном дереве.
     *
     * @param node Корень дерева для вычисления суммы.
     * @return Сумма всех элементов дерева.
     */
    public int treeSum(SimpleTreeNode node) {
        if (node == null) {
            // Базовый случай: пустой узел вносит вклад 0 в сумму
            return 0;
        }

        // Рекурсивно суммируем значения из левого и правого поддеревьев
        int leftSum = treeSum(node.left());
        int rightSum = treeSum(node.right());

        // Возвращаем сумму значений поддеревьев и значения текущего узла
        return node.value() + leftSum + rightSum;
    }
}
