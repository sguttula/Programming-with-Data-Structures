

import java.io.Serializable;

public class Sphere implements Shape, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double radius;
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}
//	public void getVolume(double radius) {
//		this.radius = radius;
//	}
	public String toString() {
		String shape = "Sphere : ";
		String radius1 = "Radius 1: " + radius;
		String volume = "Volume: " + getVolume();
		
		String list = "\n\n" + shape + "\r\n" + radius1 + "\r\n" + volume + "";
		
		return list;
	}
	@Override
	public double getVolume() {
		return 4.0/3.0 * Math.PI * Math.pow(radius, 3.0);
	}
}
