//Author: Sudarshan Guttula
//CS 2013 HW 1
//Hexagon Problem

//	 ArrayList<Hexagon> list = new ArrayList<Hexagon>();
//	 ArrayList<String> sides = new ArrayList<String>();	
//	 int numbers = 0;

//	public boolean colorCheck(Hexagon one, Hexagon two) {
//		if(one.getColors().equals(two.getColors())) {
//			return true;
//		}
//		else {
//			two.rotate();
//		}
//		return false;
//	}
//	public ArrayList<Hexagon> swap(int number, List<Hexagon> a) {
//		int whole = a.size() - 1;
//		Hexagon starts = a.get(whole);
//		ArrayList<Hexagon> last = new ArrayList<Hexagon>();
//		for(int q = 0 ; q < number ; q++) {
//			last.add(a.get(q));
//			
//		}
//		for(int w = number ; w < whole ; w++) {
//			last.add(a.get(w));
//		}
//		return last;
//	}

//	public Hexagon[] rotateAll(ArrayList<Hexagon> allTiles) {
//	
//	Hexagon[] rotated = {allTiles.get(0), allTiles.get(1),
//	
//			allTiles.get(2), allTiles.get(3), allTiles.get(4),
//			
//			allTiles.get(5), allTiles.get(6)};
//	
//	return rotated; 
//	
//}




//		while(list.size() != 6) {
//			int recurse = 0;
//			if(number == 0) {
//				
//				if(sides.isEmpty()) {
//					solve(list, num);
//				}
//				if(numbers == 0) {
//					int color = 0;
//					list.add(new Hexagon(sides.get(color)));
//					list.add(new Hexagon(sides.get(color)));
//					numbers--;
//				}
//				if(list.get(num).getColors(0).equals(list.get(num + 1).getColors(3))) {
//					System.out.println(list.get(num) + " " + list.get(num + 1));
//					num++;
//					System.out.println(num);
//					recurse = 0;
//					numbers = 0;
//					trackColor = 0;
//					System.out.println("Matches");
//					solve(list, num);
//					
//				}
//				else {
//					list.get(num + 1).rotate();
//					trackColor++;
//					if(trackColor >= 6) {
//						trackColor = 0;
//						recurse++;
//						if(recurse > sides.size()) {
//							System.out.print("No match");
//							System.exit(1);
//						}
//						list.remove(num + 1);
//						list.add(new Hexagon(sides.get(colors)));
//						solve(list, num);
//					}
//				}
//			}
//		}
package HW1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;

public class HW1Recursion {
	static ArrayList<Hexagon> list = new ArrayList<Hexagon>();
	static  ArrayList<Hexagon> sides = new ArrayList<Hexagon>();	
	static int numbers = 0;
	private static int trackColor;

	public static void solve(ArrayList<Hexagon> list) {
		solve(list, 0);
	}
	public static void solve(ArrayList<Hexagon> list, int number){
		int num = number;
		while(list.size() != 6) {
			if(number == 0) {
				if(numbers == 0) {
					for(int q = 0 ; q < sides.size() ; q++) {
						int color = 0;
						int recurse = 0;
						if(numbers == 0) {
							Hexagon s = new Hexagon();
							list.add(new Hexagon(sides.get(color)));
							list.add(new Hexagon(sides.get(color)));
							list.add(s);
							if(list.get(q).getColors(recurse).equals(list.get(q+1).getColors(recurse))) {
								q++;
								numbers++;
								solve(list, 0);
								recurse = 0;
							}
							else {
								list.get(q + 1).rotate();
								recurse++;
								if(recurse > 0) {
									list.remove(q + 1);
									list.add(new Hexagon(sides.get(color++)));
								}
								solve(list, 0);
							}
						}
					}
				}
			}
			if(number == 1) {
				if(numbers == 1) {
					for(int q = 0 ; q < sides.size() ; q++) {
						int color = 0;
						int recurse = 0;
						if(numbers == 0) {
							Hexagon s = new Hexagon();
							list.add(new Hexagon(sides.get(color)));
							list.add(new Hexagon(sides.get(color)));
							list.add(s);
							if(list.get(q).getColors(recurse).equals(list.get(q+1).getColors(recurse))) {
								q++;
								numbers++;
								solve(list, 0);
								recurse = 0;
							}
							else {
								list.get(q + 1).rotate();
								recurse++;
								if(recurse > 0) {
									list.remove(q + 1);
									list.add(new Hexagon(sides.get(color++)));
								}
								solve(list, 0);
							}
						}
					}
				}
			}
			if(number == 2) {
				if(numbers == 2) {
					for(int q = 0 ; q < sides.size() ; q++) {
						int color = 0;
						int recurse = 0;
						if(numbers == 0) {
							Hexagon s = new Hexagon();
							list.add(new Hexagon(sides.get(color)));
							list.add(new Hexagon(sides.get(color)));
							list.add(s);
							if(list.get(q).getColors(recurse).equals(list.get(q+1).getColors(recurse))) {
								q++;
								numbers++;
								solve(list, 0);
								recurse = 0;
							}
							else {
								list.get(q + 1).rotate();
								recurse++;
								if(recurse > 0) {
									list.remove(q + 1);
									list.add(new Hexagon(sides.get(color++)));
								}
								solve(list, 0);
							}
						}
					}
				}
			}
			if(number == 3) {
				if(numbers == 3) {
					for(int q = 0 ; q < sides.size() ; q++) {
						int color = 0;
						int recurse = 0;
						if(numbers == 0) {
							Hexagon s = new Hexagon();
							list.add(new Hexagon(sides.get(color)));
							list.add(new Hexagon(sides.get(color)));
							list.add(s);
							if(list.get(q).getColors(recurse).equals(list.get(q+1).getColors(recurse))) {
								q++;
								numbers++;
								solve(list, 0);
								recurse = 0;
							}
							else {
								list.get(q + 1).rotate();
								recurse++;
								if(recurse > 0) {
									list.remove(q + 1);
									list.add(new Hexagon(sides.get(color++)));
								}
								solve(list, 0);
							}
						}
					}
				}
			}
			if(number == 4) {
				if(numbers == 4) {
					for(int q = 0 ; q < sides.size() ; q++) {
						int color = 0;
						int recurse = 0;
						if(numbers == 0) {
							Hexagon s = new Hexagon();
							list.add(new Hexagon(sides.get(color)));
							list.add(new Hexagon(sides.get(color)));
							list.add(s);
							if(list.get(q).getColors(recurse).equals(list.get(q+1).getColors(recurse))) {
								q++;
								numbers++;
								solve(list, 0);
								recurse = 0;
							}
							else {
								list.get(q + 1).rotate();
								recurse++;
								if(recurse > 0) {
									list.remove(q + 1);
									list.add(new Hexagon(sides.get(color++)));
								}
								solve(list, 0);
							}
						}
					}
				}
			}
			if(number == 5) {
				if(numbers == 5) {
					for(int q = 0 ; q < sides.size() ; q++) {
						int color = 0;
						int recurse = 0;
						if(numbers == 0) {
							Hexagon s = new Hexagon();
							list.add(new Hexagon(sides.get(color)));
							list.add(new Hexagon(sides.get(color)));
							list.add(s);
							if(list.get(q).getColors(recurse).equals(list.get(q+1).getColors(recurse))) {
								q++;
								numbers++;
								solve(list, 0);
								recurse = 0;
							}
							else {
								list.get(q + 1).rotate();
								recurse++;
								if(recurse > 0) {
									list.remove(q + 1);
									list.add(new Hexagon(sides.get(color++)));
								}
								solve(list, 0);
							}
						}
					}
				}
			}
			if(number == 6) {
				if(numbers == 6) {
					for(int q = 0 ; q < sides.size() ; q++) {
						int color = 0;
						int recurse = 0;
						if(numbers == 0) {
							Hexagon s = new Hexagon();
							list.add(new Hexagon(sides.get(color)));
							list.add(new Hexagon(sides.get(color)));
							list.add(s);
							if(list.get(q).getColors(recurse).equals(list.get(q+1).getColors(recurse))) {
								q++;
								numbers++;
								solve(list, 0);
								recurse = 0;
							}
							else {
								list.get(q + 1).rotate();
								recurse++;
								if(recurse > 0) {
									list.remove(q + 1);
									list.add(new Hexagon(sides.get(color++)));
								}
								solve(list, 0);
							}
						}
					}
				}
			}
		}
	}
	public boolean compare1(ArrayList<Hexagon> sides, ArrayList<Hexagon> list) {
		if (sides.get(0).getColors(0).equals(list.get(1).getColors(3))) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean compare2(ArrayList<Hexagon> sides, ArrayList<Hexagon> list) {
		if (sides.get(1).getColors(2).equals(list.get(2).getColors(5)) && sides.
				get(0).getColors(1).equals(list.get(2).getColors(4))) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean compare3(ArrayList<Hexagon> sides, ArrayList<Hexagon> list) {
		if (sides.get(2).getColors(3).equals(list.get(3).getColors(0)) && sides.
				get(0).getColors(2).equals(list.get(3).getColors(5))) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean compare4(ArrayList<Hexagon> sides, ArrayList<Hexagon> list) {
		if (sides.get(3).getColors(4).equals(list.get(4).getColors(1)) && sides.
				get(0).getColors(3).equals(list.get(4).getColors(0))) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean compare5(ArrayList<Hexagon> sides, ArrayList<Hexagon> list) {
		if (sides.get(4).getColors(5).equals(list.get(5).getColors(2)) && sides.
				get(0).getColors(4).equals(list.get(5).getColors(1))) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean compare6(ArrayList<Hexagon> sides, ArrayList<Hexagon> list) {
		if (sides.get(5).getColors(0).equals(list.get(6).getColors(3)) && sides.
				get(0).getColors(5).equals(list.get(6).getColors(2))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public List<Hexagon> recurse(List<Hexagon> hexs) {	
		Hexagon[] arrays = { hexs.get(6), hexs.get(0), hexs.get(1), hexs.get(2),
							hexs.get(3), hexs.get(4), hexs.get(5)};
		List<Hexagon> hexagon = new ArrayList<Hexagon>();
		for(int i = 0 ; i <= 6 ; i++) {
			hexagon.add(arrays[i]);
		}
		return hexagon;
	}
	
	public void fileAndFinish() throws Exception {
		FileReader reader = new FileReader("C:/Users/Sidgu_000/"
				+ "Desktop/college/year2/springsemester2017/"
				+ "cs2013/test.txt");
		BufferedReader buff = new BufferedReader(reader);
		String qwerty = "";
		String read = buff.readLine();
		//		String occ;
		//		int count = 0;
		//		int i = 5;
		while (read != null) {
			qwerty += read;
			read = buff.readLine();
		}
		Hexagon h1 = new Hexagon(qwerty.substring(5, 11));
		Hexagon h2 = new Hexagon(qwerty.substring(16, 22));
		Hexagon h3 = new Hexagon(qwerty.substring(27, 33));
		Hexagon h4 = new Hexagon(qwerty.substring(38, 44));
		Hexagon h5 = new Hexagon(qwerty.substring(49, 55));
		Hexagon h6 = new Hexagon(qwerty.substring(60, 66));
		Hexagon h7 = new Hexagon(qwerty.substring(71, 77));

		Hexagon[] allHexs = {h1, h2, h3, h4, h5, h6, h7};
		List<Hexagon> tiles = new ArrayList<Hexagon>();
		List<Integer> tileArray = new ArrayList<Integer>();
		for(int i = 0 ; i <= 6 ; i++) {
			tiles.add(allHexs[i]);
			tileArray.add(i);
		}
		System.out.println(tiles);
		
		list.add(h1);
		list.add(h2);
		list.add(h3);
		list.add(h4);
		list.add(h5);
		list.add(h6);
		list.add(h7);	

		System.out.print(list.subList(0, 1));
		System.out.print(list.subList(1, 2));
		System.out.print(list.subList(2, 3));
		System.out.print(list.subList(3, 4));
		System.out.print(list.subList(4, 5));
		System.out.print(list.subList(5, 6));
		System.out.print(list.subList(6, 7));

		System.out.println();
		System.out.println();
		System.out.println("Rotations:");
		System.out.println();

		h1.rotate();
		h2.rotate();
		h3.rotate();
		h4.rotate();
		h5.rotate();
		h6.rotate();
		h7.rotate();
		System.out.println(list);

		solve(list);
	}
	public void solve() {
		solve(list);
	}	
}