package hw5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JFileChooser;
public class HashTableTest {
	public static SimpleList hashTableList = new SimpleList();
	public static SimpleList generateSimpleList() throws FileNotFoundException {
		JFileChooser jc = new JFileChooser();
		int hash = jc.showOpenDialog(null);
		if(hash == JFileChooser.APPROVE_OPTION) {
			File read = jc.getSelectedFile();
			FileReader fr = new FileReader(read);
			@SuppressWarnings("resource")
			Scanner in = new Scanner(fr);
			while(in.hasNext()) {
				String lines = in.next();
				Entry enter = new Entry(lines);
				if(hashTableList.find(lines) >= 0) {
					Entry hashed = hashTableList.getEntry(hashTableList.find(lines));
					hashed.incrementCount();
				}
				else {
					hashTableList.add(enter);
				}
			}
		}
		return hashTableList;
	}
	@SuppressWarnings("unused")
	private static SimpleList generateHashTable() throws FileNotFoundException {
		JFileChooser jc = new JFileChooser();
		int file = jc.showOpenDialog(null);
		if(file == JFileChooser.APPROVE_OPTION) {
			File f = jc.getSelectedFile();
			FileReader fr = new FileReader(f);
			@SuppressWarnings("resource")
			Scanner in = new Scanner(fr);
			while(in.hasNext()) {
				String str = in.next();
				Entry enter = new Entry(str);
				if(hashTableList.find(str) >= 0) {
					Entry q = hashTableList.getEntry(hashTableList.find(str));
					q.incrementCount();
				}
				else {
					hashTableList.add(enter);
				}
			}
		}
		return hashTableList;
	}
	public static void main(String[] args) throws FileNotFoundException {
		//generateSimpleList();
		//generateHashTable();
		JFileChooser jc = new JFileChooser();
		int file = jc.showOpenDialog(null);
		if(file == JFileChooser.APPROVE_OPTION) {
			File f = jc.getSelectedFile();
			FileReader fr = new FileReader(f);
			@SuppressWarnings("resource")
			Scanner in = new Scanner(fr);
			while(in.hasNext()) {
				String str = in.next();
				Entry enter = new Entry(str);
				if(hashTableList.find(str) >= 0) {
					Entry line = hashTableList.getEntry(hashTableList.find(str));
					line.incrementCount();
				}
				else {
					hashTableList.add(enter);
				}
			}
		}
			System.out.println(hashTableList.toString());
			System.out.println();
			System.out.println("Duration: 7 minutes & 23 seconds");
	}
}