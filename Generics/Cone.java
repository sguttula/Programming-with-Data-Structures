

import java.io.Serializable;

public class Cone implements Shape, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double height;
	private double radius;

	public Cone(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
	}
//	public void getVolume(double height, double radius) {
//		this.height = height;
//		this.radius = radius;
//		
//	}
	public String toString() {
		String shape = "Cone : ";
		String radius1 = "Radius: " + radius;
		String height1 = "Height: " + height;
		String volume = "Volume: " + getVolume();
		
		String list = "\n\n" + shape + "\r\n" + radius1 +"\r\n" + height1 + "\r\n" + volume + "";
		
		return list;
	}
	@Override
	public double getVolume() {
		return 1.0/3.0 * Math.PI * Math.pow(radius, 2.0) * height;
		
	}
}
