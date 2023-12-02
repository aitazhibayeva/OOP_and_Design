package problem_4;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		if(e1 instanceof Manager && e2 instanceof Manager) {
			Manager m1 = (Manager)e1;
			Manager m2 = (Manager)e2;
			if(m1.getSalary() > m2.getSalary()) return 1;
			if(m1.getSalary() < m2.getSalary()) return -1;
			if(m1.getBonus() > m2.getBonus()) return 1;
			if(m1.getBonus() < m2.getBonus()) return -1;
		}
		if(e1.getSalary() > e2.getSalary()) return 1;
		if(e1.getSalary() < e2.getSalary()) return -1;
		return 0;
	
	}
}
