package hw4trees;

public class Node<K> {
	protected K key;
	protected K node;
	protected Node<K> left = null;
	protected Node<K> right = null;
	protected Node<K> parent = null;
	
	public Node(K currentNode) {
		node = currentNode;
	}
}
