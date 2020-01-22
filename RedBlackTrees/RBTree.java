package hw4trees;
import java.util.Stack;
import hw4trees.RBTree.Node;
public class RBTree<K extends Comparable<K>> {
	Stack<Node<K>> stack = new Stack<Node<K>>();
	protected Node<K> rootNode;
	protected Node<K> currNode;
	protected int size = 0;
	public RBTree() { }	
	public void printGrandparents(Node<K> node) {
		if(node == null) {
			System.out.println("No root node exists!");
		}
		else if(node.parent.parent == null) {
			System.out.println("Grandparent does not exist!");
		}
		else if((node.parent.parent) != null) {
			System.out.print(node.parent.parent + " ");
		}
		else {
			return;
		}
	}
	public void printUncles(Node<K> node) {
		if(node == null) {
			System.out.println("No root node exists!");
		}
		else if((node.parent.parent.right) != null) {
			System.out.print(node.parent.right + " ");
		}
		else if((node.parent.parent.left) != null) {
			System.out.print(node.parent.left + " ");
		}
		else if(node.parent.parent.right == null || node.parent.parent.left == null) {
			System.out.println("Uncle does not exist!");
		}
		else {
			return;
		}
	}
	public boolean insert(K currentNode) {
		if (rootNode == null)
			rootNode = createNewNode(currentNode); 
		else {
			Node<K> pNode = null;
			Node<K> cNode = rootNode;
			while (cNode != null)
				if (currentNode.compareTo(cNode.node) < 0) {
					pNode = cNode;
					cNode = cNode.left;
				}
				else if (currentNode.compareTo(cNode.node) > 0) {
					pNode = cNode;
					cNode = cNode.right;
				}
				else
					return false;
			if (currentNode.compareTo(pNode.node) < 0)
				pNode.left = createNewNode(currentNode);
			else
				pNode.right = createNewNode(currentNode);
		}
		size++;
		return true;
	}

	public boolean delete(K currentNode) {
		Node<K> pNode = null, current = rootNode;
		while (current != null) {
			if (currentNode.compareTo(current.node) < 0) {
				pNode = current;
				current = current.left;
			}
			else if (currentNode.compareTo(current.node) > 0) {
				pNode = current;
				current = current.right;
			}
			else
				break; 
		}
		if (current == null)
			return false;
		if (current.left == null) {
			if (pNode == null) {
				rootNode = current.right;
			}
			else {
				if (currentNode.compareTo(pNode.node) < 0)
					pNode.left = current.right;
				else
					pNode.right = current.right;
			}
		}
		else {
			Node<K> parentOfRightMost = current, rightMost = current.left;
			while (rightMost.right != null) {
				parentOfRightMost = rightMost;
				rightMost = rightMost.right;
			}
			current.node = rightMost.node;
			if (parentOfRightMost.right == rightMost)
				parentOfRightMost.right = rightMost.left;
			else
				parentOfRightMost.left = rightMost.left;
		}
		return true;
	}

	public boolean search(K currentNode) {
		Node<K> current = rootNode;
		while (current != null) {
			if (currentNode.compareTo(current.node) < 0) {
				current = current.left;
			}
			else if (currentNode.compareTo(current.node) > 0) {
				current = current.right;
			}
			else 
				return true; 
		}
		return false;
	}
	
	public void inorder() {
		inorder(rootNode);
	}
	public void inorder(Node<K> root) {
		Node<K> current = root;
		while(!stack.empty() || current != null) {
			if(current != null) {
				stack.push(current);
				current = current.left;
			}
			else {
				current = stack.pop();
				current = current.right;
			}
		}
		if (root == null) return;
		inorder(root.left);
		System.out.print(root.node + " ");
		inorder(root.right);
	}

	public void postorder() {
		postorder(rootNode);
	}
	public void preorder(Node<K> root) {
		stack.push(root);
		while(!stack.empty()) {
			currNode = stack.pop();
			if(root.right != null) {
				stack.push(root.right);
			}
			if(root.left != null) {
				stack.push(root.left);
			}
		}
		if (root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.node + " ");
	}

	public void preorder() {
		preorder(rootNode);
	}
	public void postorder(Node<K> root) {
		stack.push(root);
		while(!stack.empty()) {
			currNode = stack.peek();
			if(currNode.left != null) {
				stack.push(currNode.left);
			}
			else if (currNode.right != null) {
				stack.push(currNode.right);
			}
			else {
				stack.pop();
			}
		}
		if (root == null) return;
		System.out.print(root.node + " ");
		preorder(root.left);
		preorder(root.right);
	}
	protected Node<K> createNewNode(K e) {
		return new Node<>(e);
	}
	public static class Node<K extends Comparable<K>> {
		protected K key;
		protected K node;
		protected Node<K> left;
		protected Node<K> right;
		protected Node<K> parent;

		public Node(K currentNode) {
			node = currentNode;
		}
	}
	public int getSize() {
		return size;
	}
	public Node<K> getRoot() {
		return rootNode;
	}
	public java.util.ArrayList<Node<K>> path(K e) {
		java.util.ArrayList<Node<K>> list =
				new java.util.ArrayList<>();
		Node<K> current = rootNode;
		while (current != null) {
			list.add(current);
			if (e.compareTo(current.node) < 0) {
				current = current.left;
			}
			else if (e.compareTo(current.node) > 0) {
				current = current.right;
			}
			else
				break;
		}
		return list;
	}
	public java.util.Iterator<K> iterator() {
		return new InorderIterator();
	}
	private class InorderIterator implements java.util.Iterator<K> {
		private java.util.ArrayList<K> list =
				new java.util.ArrayList<>();
		private int current = 0;
		public InorderIterator() {
			inorder();
		}
		private void inorder() {
			inorder(rootNode);
		}
		private void inorder(Node<K> root) {
			if (root == null) return;
			inorder(root.left);
			list.add(root.node);
			inorder(root.right);
		}
		@Override
		public boolean hasNext() {
			if (current < list.size())
				return true;
			return false;
		}
		@Override
		public K next() {
			return list.get(current++);
		}
		@Override
		public void remove() {
			delete(list.get(current)); 
			list.clear();
			inorder(); 
		}
	}
	public void clear() {
		rootNode = null;
		size = 0;
	}
}