package ex1;

public class MainMetod {

	public static void main(String[] args) {
		Animal lion = new Animal("carnivore", 
				"yellow", 4);

		lion.setColor("deep-yellow");
		
		System.out.println(lion.getColor());
		System.out.println(lion.eat("Green grass!"));
		System.out.println(lion);
	}
	

}
