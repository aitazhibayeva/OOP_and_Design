package problem_1;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Student student = new Student("Aizada", 18);
		
		Restaurant r = new Restaurant();
		University uni = new University();
		
		//1
		CanHavePizza eater = cat;
		r.servePizza(eater);
		
		System.out.println();
		
		eater = student;
		r.servePizza(eater);
		System.out.println();
		
		//2
		CanHaveRetake dumb = student;
		uni.haveRetake(dumb);
		System.out.println();
		
		student.move();
		student.dance();
	}
	
}
