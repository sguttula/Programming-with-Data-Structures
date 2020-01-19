package hw3;

public class Node<T, S, U> {
	protected T category1;
	protected S category2;
	protected U category3; 

	protected Node<T, S, U> right = null;
	protected Node<T, S, U> left = null;
	protected Node<T, S, U> down = null;

/*	Node<Integer, String, Double> category1 = new Node<Integer, String, Double>();
	Node<Integer, String, Double> category2 = new Node<Integer, String, Double>();
	Node<Integer, String, Double> category3 = new Node<Integer, String, Double>();*/

	public Node(T category11, S category22, U category33) {
		super();
		this.category1 = category11;
		this.category2 = category22;
		this.category3 = category33;
	}

	public T getCategory1() {
		return category1;
	}

	public S getCategory2() {
		return category2;
	}

	public U getCategory3() {
		return category3;
	}

	public Node<T, S, U> getRight() {
		return right;
	}

	public Node<T, S, U> getLeft() {
		return left;
	}

	public Node<T, S, U> getDown() {
		return down;
	}
}
