package problem_1a;

import java.util.Vector;

public class Tester {

	public static void main(String[] args) {
		Kbtu kbtu = new Kbtu();
		Narxoz narxoz = new Narxoz();
		
		Vector<University> uni = new Vector<University>();
		uni.add(kbtu);
		uni.add(narxoz);
		
		for(University univ: uni) {
			System.out.println(univ);
			univ.getDiploma();
			univ.haveRetake();
			System.out.println();
		}
	}

}
