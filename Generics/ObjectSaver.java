

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSaver<T> {
	File file;
	public ObjectSaver(File file) {
		this.file = file;
	}
	@SuppressWarnings("unchecked")
	public final T readOneObject(int specific) throws IOException{
		T number = null;
		try {
			ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file));
			for(int i = 0 ; i < specific ; i++) {
				number = (T) obj.readObject();
			}
			obj.close();
		} catch(FileNotFoundException q) {
			q.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return number;
	}
	
	public ArrayList<T> readAllObjects() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(this.file);
		ObjectInputStream out = new ObjectInputStream(fileInputStream);
		ArrayList<T> in = new ArrayList<>();
		try {
				while(true) {
					Object saver = out.readObject();
					in.add((T) saver);
				}
			} catch (EOFException e) {
				return in;
			}
	}
	public void writeOneObject(T obj, boolean check) throws NotSerializableException {
		FileOutputStream q1 = null;
		try {
			q1 = new FileOutputStream(this.file, check);
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		ObjectOutputStream q2 = null;
		try {
			q2 = new ObjectOutputStream(q1);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try{
			q2.writeObject(obj);
			q2.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void writeAllObjects(ArrayList<T> qwerty, boolean check) throws NotSerializableException{
		FileOutputStream q3 = null;
		try {
			q3 = new FileOutputStream(this.file, check);
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		ObjectOutputStream q4 = null;
		try {
			q4 = new ObjectOutputStream(q3);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try{
			for(int i = 0 ; i < qwerty.size() ; i++) {
				q4.writeObject(qwerty.get(i));
			}
			q4.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
