package hw5;

import java.time.Duration;
import java.time.Instant;

public class HashTable {
	private static int size = 11;
	public Entry[] hashTable;
	final double loadF = 0.75;
	double load;
	static int n = 0;

	public HashTable() {

		this.hashTable = new Entry[size];
		for (int i = 0; i < hashTable.length; i++) {
			hashTable[i] = null;
		}
		load++;
	}

	public int hash(String character) {
		int duplicate = 0;
		while (hashTable[duplicate] != null && hashTable[duplicate].getWord() != character) {
			duplicate = (duplicate + 1) % size;
		}
		for (int j = 0; j < character.length(); j++) {
			duplicate = (int) (Math.pow(31, character.length() - 1)) * character.charAt(j);
		}
		return duplicate;
	}

	public int doubleHash(Entry q, int i) {
		int hash = 7 - (q.hashCode() % 7);
		return hash;
	}

	public void calculateLF() {
		load = n / size;
	}

	public void add(Entry w) {
		n = n + 1;
		calculateLF();
		if (load > 0.75) {
			// n = n - 1;
			this.resize();
			load = n / size;
		} else {
			//System.out.println(n);
			hashTable[hashCode() % size] = w;
			size++;
		}
	}

	private void resize() {
		Entry[] newList = new Entry[hashTable.length * 2];
		for (int i = 0; i < size; i++) {
			newList[i] = hashTable[i];
		}
		hashTable = newList;
	}

	public String toString() {
		Instant start = Instant.now();
		methodYouWantToTime();
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end));
		String print = "Duration : " + Duration.between(start, end);
		return print;
	}

	private void methodYouWantToTime() {
	}
}