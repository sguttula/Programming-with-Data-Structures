
import java.util.ArrayList;
public class ShapeUtilities<T extends Shape> {
	public static <T extends Shape>ArrayList<T> recursiveSort(ArrayList<T> list) {
		ArrayList<T> rightList = new ArrayList<T>();
		ArrayList<T> leftList = new ArrayList<T>();
		T middle;
		if(list.size() <= 1) {
			return list;
		}
		else {
			int o = ((list.size() - 1) - (list.size() / 2));
			middle = list.get(o);
			list.remove(middle);
			for(T i : list) {
				if(i.getVolume() < middle.getVolume()) {
					rightList.add(i);
				}
				else {
					leftList.add(i);
				}
			}
			rightList = recursiveSort(rightList);
			leftList = recursiveSort(leftList);
	
		}
		ArrayList<T> finalList = new ArrayList<T>();
		finalList.addAll(rightList);
		finalList.add(middle);
		finalList.addAll(leftList);
		return finalList;
	}
	public static <T extends Shape> double min (ArrayList<T> getList) {
		getList = recursiveSort(getList);
		return getList.get(0).getVolume();
	}
	public static <T extends Shape> double max (ArrayList<T> getList) {
		getList = recursiveSort(getList);
		return getList.get(getList.size() - 1).getVolume();
	}
}