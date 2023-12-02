package problem_1A;

import java.util.Vector;

public class testShapes {

	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(3.0, 7.0);
		Sphere sphere = new Sphere(4.0);
		Cube cube = new Cube(5.0);
		
		Vector<Shapes> shapes = new Vector<Shapes>();
		shapes.add(cylinder);
        shapes.add(sphere);
        shapes.add(cube);
		
        for(Shapes shape: shapes) {
        	System.out.println(shape);
        }
	
	}

}
