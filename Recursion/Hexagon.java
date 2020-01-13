//Author: Sudarshan Guttula
//CS 2013 HW 1
//Hexagon Problem
package HW1;
import java.util.Arrays;
public class Hexagon {

	private int a = 6;
	private int b = a;
	private int c = b;
	private int d = c;
	String[] colors = new String[d];
	
	public Hexagon(String tiles) {
		super();
		String[] qwerty = tiles.split("");
		this.colors = qwerty;
	}
	public Hexagon(){
		
	}
	public Hexagon(Hexagon hexagon) {
		
	}
	public void rotate() {
		String a = colors[0];
		String b = colors[1];
		String c = colors[2];
		String d = colors[3];
		String e = colors[4];
		String f = colors[5];
		
		colors[0] = f;
		colors[1] = a;
		colors[2] = b;
		colors[3] = c;
		colors[4] = d;
		colors[5] = e;
	}
	public String[] getColors(int i) {
		return colors;
	}
	public void setColors(String[] colors) {
		this.colors = colors;
	}
	@Override
	public String toString() {
		return Arrays.toString(colors);
	}	
	
}
