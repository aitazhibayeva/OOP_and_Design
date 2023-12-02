package problem_1;

import java.util.Vector;

public class testShape {

	public static void main(String[] args) {
		
		Vector<Shape> shapes = new Vector<Shape>();
		
		Circle circle = new Circle(Color.RED, 10, 2);
		Rectange rectange = new Rectange(Color.BLACK, 15, 5);
		Triangle triangle = new Triangle(Color.BLACK, 40, 2);
		
		shapes.add(circle);
		shapes.add(rectange);
        shapes.add(triangle);
        
        for (Shape s : shapes) {
            s.draw();
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        

//        for (Shape s : shapes) {
//        	if(s instanceof Circle) {
//        		Circle c = (Circle)s;
//        		c.draw(5);
//        		System.out.println();
//        	}
//        	else if(s instanceof Rectange) {
//        		Rectange r = (Rectange)s;
//        		r.draw(9);
//        		System.out.println();
//        	}
//            else if (s instanceof Triangle) {
//                Triangle t = (Triangle)s;
//                t.draw(12);
//            }
//        }

	}

}
