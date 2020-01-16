

import java.io.Serializable;

public class Ellipsoid implements Shape, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double radius1;
	private double radius2;
	private double radius3;
	
	public Ellipsoid(double radius1, double radius2, double radius3) {
		super();
		this.radius1 = radius1;
		this.radius2 = radius2;
		this.radius3 = radius3;
	}
//	public void getVolume(double radius1, double radius2, double radius3) {
//		this.radius1 = radius1;
//		this.radius2 = radius2;
//		this.radius3 = radius3;
//	}
	public String toString() {
		String shape = "Ellipsoid : ";
		String radius = "Radius 1: " + radius1;
		String radiuss = "Radius 2: " + radius2;
		String radiusss = "Radius 3: " + radius3;
		String volume = "Volume: " + getVolume();
		
		
		String list = "\n\n" + shape + "\r\n" + radius + "\r\n" + radiuss + "\r\n" + radiusss + "\r\n" + volume + "";
		
		return list;
	}
	@Override
	public double getVolume() {
		return 4.0/3.0 * Math.PI * radius1 * radius2 * radius3;

	}
}
