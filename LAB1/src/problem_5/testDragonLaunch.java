package problem_5;

public class testDragonLaunch {

	public static void main(String[] args) {
		DragonLaunch dragon = new DragonLaunch();
		
		Person p1 = new Person(Gender.BOY);
		Person p2 = new Person(Gender.GIRL);
		Person p3 = new Person(Gender.BOY);
		Person p4 = new Person(Gender.GIRL);
		Person p5 = new Person(Gender.GIRL);
		Person p6 = new Person(Gender.BOY);
		Person p7 = new Person(Gender.BOY);
		Person p8 = new Person(Gender.BOY);
		
		dragon.kidnap(p1);
		dragon.kidnap(p2);
		dragon.kidnap(p3);
		dragon.kidnap(p4);
		dragon.kidnap(p5);
		dragon.kidnap(p6);
		dragon.kidnap(p7);
		dragon.kidnap(p8);
		
		if(dragon.willDragonEatOrNot()) {
			System.out.println("He will eat");
		}
		else {
			System.out.println("He will not eat");
		}
		
	}

}
