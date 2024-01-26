package ru.liga.ppr.exam.task_6_treesum;

/**
 * Класс, представляющий узел бинарного дерева.
 */
public class SimpleTreeNode {
	private final SimpleTreeNode left;
	private final SimpleTreeNode right;
	private final int value;

	/**
	 * Конструктор для создания узла бинарного дерева.
	 *
	 * @param left  Левый дочерний узел.
	 * @param right Правый дочерний узел.
	 * @param value Целочисленное значение, хранящееся в узле.
	 */
	public SimpleTreeNode(SimpleTreeNode left, SimpleTreeNode right, int value) {
		this.left = left;
		this.right = right;
		this.value = value;
	}

	public SimpleTreeNode left() {
		return left;
	}

	public SimpleTreeNode right() {
		return right;
	}

	public int value() {
		return value;
	}
}