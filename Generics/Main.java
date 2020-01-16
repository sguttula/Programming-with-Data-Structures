import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//	Cone c1 = new Cone(2, 4);
//	Ellipsoid e1 = new Ellipsoid(1, 2, 3);
//	Sphere s1 = new Sphere(3);
//	Cone c2 = new Cone(2, 3); 
//	Ellipsoid e2 = new Ellipsoid(4, 2, 3);
//	Sphere s2 = new Sphere(4);
//	Cone c3 = new Cone(2, 9); 
//	Ellipsoid e3 = new Ellipsoid(1, 2, 6);
//	Sphere s3 = new Sphere(5);	
	File in = new File("C:\\Users\\Sidgu_000\\Desktop\\ellipsoids.dat");
	ObjectSaver<Shape> obj1 = new ObjectSaver<Shape>(in);
	
	File in2 = new File("C:\\Users\\Sidgu_000\\Desktop\\spheres.dat");
	ObjectSaver<Shape> obj2 = new ObjectSaver<Shape>(in2);
	
	File in3 = new File("C:\\Users\\Sidgu_000\\Desktop\\cones.dat");
	ObjectSaver<Shape> obj3 = new ObjectSaver<Shape>(in3);
	System.out.println("Shape: Ellipsoid");
	System.out.println(obj1.readAllObjects());
	System.out.println();
	System.out.print("Min: ");
	System.out.println(ShapeUtilities.min(obj1.readAllObjects()));
	System.out.print("Max: ");
	System.out.println(ShapeUtilities.max(obj1.readAllObjects()));
	System.out.println();
	System.out.print("Recursive Sort: -----------------> ");
	System.out.println("Writing All Objects");
	System.out.println();
	obj1.writeAllObjects(ShapeUtilities.recursiveSort(obj1.readAllObjects()), false); //reading all objects, sorting it out, writes all object; in out out
	System.out.print(obj1.readAllObjects());
	System.out.println();
	
	System.out.println();
	System.out.println("-------------------------------");
	System.out.println("Shape: Sphere");
	System.out.println(obj2.readAllObjects());
	System.out.println();
	System.out.print("Min: ");
	System.out.println(ShapeUtilities.min(obj2.readAllObjects()));
	System.out.print("Max: ");
	System.out.println(ShapeUtilities.max(obj2.readAllObjects()));
	System.out.println();
	System.out.print("Recursive Sort: -----------------> ");
	System.out.println("Writing All Objects");
	System.out.println();
	obj2.writeAllObjects(ShapeUtilities.recursiveSort(obj2.readAllObjects()), false); //reading all objects, sorting it out, writes all object; in out out
	System.out.print(obj2.readAllObjects());
	System.out.println();
	
	System.out.println();
	System.out.println("-------------------------------");
	System.out.println("Shape: Cone");
	System.out.println(obj3.readAllObjects());
	System.out.println();
	System.out.print("Min: ");
	System.out.println(ShapeUtilities.min(obj3.readAllObjects()));
	System.out.print("Max: ");
	System.out.println(ShapeUtilities.max(obj3.readAllObjects()));
	System.out.println();
	System.out.print("Recursive Sort: -----------------> ");
	System.out.println("Writing All Objects");
	System.out.println();
	obj3.writeAllObjects(ShapeUtilities.recursiveSort(obj3.readAllObjects()), false); //reading all objects, sorting it out, writes all object; in out out
	System.out.print(obj3.readAllObjects());
	System.out.println();
	}

	
}
