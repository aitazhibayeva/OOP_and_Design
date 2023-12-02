package problem_1;

import java.util.Vector;

public class Cart {

	public static void main(String[] args) {
		
		Products p1 = new Products("Sam", 4546, 5456);
		Products p2 = new Products("Sam", 4546, 5456);
		Products p3 = new Products("Sam", 4546, 5456);
		Products p4 = new Products("Sam", 4546, 5456);
		
		Vector<Products> cart = new Vector<Products>();
		cart.add(p1);
		cart.add(p2);
		cart.add(p3);
		cart.add(p4);

		
		for(Products p: cart) {
			System.out.println(p);
		}
		
		cart.remove(p1);
		cart.remove(p2);
		cart.remove(p3);
		cart.remove(p4);
		
		for(Products p: cart) {
			System.out.println(p);
		}
	}

}
