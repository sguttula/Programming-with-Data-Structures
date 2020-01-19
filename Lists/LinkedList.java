package hw3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class LinkedList<T extends Comparable<T>, S extends Comparable<S>, U extends Comparable<U>> {
	private Node<T, S, U> head = null;
	File file;
	private int size = 0;
	//Node<Integer> category1Label = new Node<Integer>();
	//Node<String> category2Label = new Node<String>();
	//Node<String> category3Label = new Node<String>();
	protected String category1Label;
	protected String category2Label;
	protected String category3Label;
	protected String groupingCategory;
	public LinkedList() {
		this.head = null;
		this.size = 0;
		this.category1Label = null;
		this.category2Label = null;
		this.category3Label = null;
		this.groupingCategory = null;
	}
	public LinkedList(int numbers) {
		this.head = null;
		this.size = 0;
		this.category1Label = null;
		this.category2Label = null;
		this.category3Label = null;
		this.groupingCategory = null;
	}
	public LinkedList(File file, int parameter) throws IOException {
		Scanner sc = new Scanner(file);
		this.head = null;
		this.size = 0;
		this.category1Label = (String) " " + sc.nextLine();
		this.category2Label = (String) " " + sc.nextLine();
		this.category3Label = (String) " " + sc.nextLine();
		this.groupingCategory =(String)" " + sc.nextLine();
		sc.nextLine();
		this.file = file;
		while(sc.hasNext()) {
			String space = sc.nextLine();
			String [] qwerty = space.split(",");
			add(qwerty);
		}	
	}
	public void add(T value1, S value2, U value3) {
		Node<T, S, U> newNode = new Node<T, S, U>(value1, value2, value3);
		if(size == 0) {
			this.head = newNode;
		}
		else {
			int nodeSize = 0;
			Node<T, S, U> current = this.head;
			Node<T, S, U> rightn = current.right;
			Node<T, S, U> downn = current.down;
			//			newNode.right = this.head;
			//			this.head = newNode;
			boolean categories = (current.category1.compareTo(newNode.category1) == -1);
			while(categories) {
				if(current.category1 == newNode.category1) {
					current.right = newNode;
					newNode.left = current;
					nodeSize++;
					size++;
					System.out.println("Size: " + size);
					categories = false;
				}
				else {
					current = rightn;
				}
			}
			if(nodeSize < 1) {
				while(!categories) {
					if(downn == null) {
						current.down = newNode;
						size++;
						System.out.println("Size: " + size);
						categories = true;
					}
					else {
						current = downn;
					}
				}
			}
		}
		size++;
	}
	public void clear() {
		if(size == 0) {
			System.out.print("List is empty.");
		}
		else {
			this.head = null;
			size = 0;
		}
	}
	public void deleteFirst() {
		if(size == 0) {
			System.out.print("List is empty.");
		}
		else if(size == 1) {
			clear();
		}
		else {
			Node<T, S, U> qright = this.head.right;
			Node<T, S, U> wdown = this.head.down;
			wdown.right = qright;
			qright.left = wdown;
			this.head = null;
			size--;
		}
	}
	public void deleteLast() {
		Node<T, S, U> current = this.head;
		Node<T, S, U> lefty = current.left;
		Node<T, S, U> righty = current.right;
		Node<T, S, U> downy = current.down;
		if(size == 0) {
			System.out.print("List is empty.");
		}
		else if(size == 1) {
			clear();
		}
		else if(righty == null){
			deleteFirst();
		}
		else {
			while(righty != null) {
				current = righty;
			}
			lefty.right = downy;
			downy.left = lefty;
			current = null;
			size--;
		}
	}
	public void delete(int mainIndex, int subIndex) {
		if(mainIndex == 0) {
			deleteFirst();
		}
		else if(mainIndex == size - 1) {
			deleteLast();
		}
		Node<T, S, U> prev = this.head;
		for(int i = 0 ; i < mainIndex ; i++) {
			prev = prev.right;
		}
		prev = prev.right.right;
		size--;
	}
	public int size() {
		return size;
	}
	private static void add(String[] qwerty) {}
}