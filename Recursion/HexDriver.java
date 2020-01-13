package HW1;

public class HexDriver {	
	
	public static void main(String[] args) throws Exception {
	
		HW1Recursion file = new HW1Recursion();
		
		file.fileAndFinish();
		file.recurse(null);
		file.solve();
	}
}