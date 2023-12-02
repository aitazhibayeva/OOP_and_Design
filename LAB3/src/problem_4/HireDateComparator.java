package problem_4;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		if(e1 instanceof Manager && e2 instanceof Manager) {
			Manager m1 = (Manager)e1;
			Manager m2 = (Manager)e2;
			return m1.getHireDate().compareTo(m2.getHireDate());
		}
		return e1.getHireDate().compareTo(e2.getHireDate());
	}
}