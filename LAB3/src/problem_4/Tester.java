package problem_4;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Vector;


public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee("Pakita", 54131, LocalDate.of(1083,11,17), "11-21");
		Employee e2 = new Employee("Ivan", 15465, LocalDate.of(2005,1,23), "13-45");
		Employee e3 = new Employee("Assylzhan", 75641, LocalDate.of(2002,6,2), "52-81");
		Employee e4 = new Employee("Nariman", 35132, LocalDate.of(2001,6,16), "65-45");
		Employee e5 = new Employee("Ayaulym", 65412, LocalDate.of(2018,1,1), "32-78");
		Employee e6 = new Employee("BRB", 12412, LocalDate.of(1963,10,10), "78-78");
		
		Manager m1 = new Manager("Malfoy", 305000, LocalDate.of(2018,5,2), "35-01", new Vector <Employee>(), 300);
		Manager m2 = new Manager("Ron", 305000, LocalDate.of(2014,10,9), "50-98", new Vector <Employee>(), 680);
		Manager m3 = new Manager("Harry", 305000, LocalDate.of(2003, 9, 4), "00-00" ,new Vector<Employee>(), 100);
		
		//-----------------------------------
		
		m1.employees.add(e1);
		m1.employees.add(e2);
		m1.employees.add(e3);
		System.out.println("1-Group: ");
		System.out.println(m1);
		
		for(Employee em: m1.employees) {
			System.out.println(em);
		}
		Collections.sort(m1.employees);
		System.out.println("After sorting: ");
		
		for(Employee em: m1.employees) {
			System.out.println(em);
		}
		
		//-----------------------------------
		
		m2.employees.add(e4);
		m2.employees.add(e5);
		m2.employees.add(e6);
		System.out.println("\n 2-Group: ");
		System.out.println(m2);
		
		for(Employee em: m2.employees) {
			System.out.println(em);
		}
		Collections.sort(m2.employees);
		System.out.println("After sorting: ");
		
		for(Employee em: m2.employees) {
			System.out.println(em);
		}
		
		//-----------------------------------
		
		Manager m4 = (Manager)m1.clone();
		Employee e7 = (Employee)e1.clone();
		m3.employees.add(e7);
		System.out.println("\n 3-Group");
		System.out.println(m4);
		
		for(Employee em: m4.employees) {
			System.out.println(em);
		}
		Collections.sort(m4.employees);
		System.out.println("After sorting: ");
		
		for(Employee em: m4.employees) {
			System.out.println(em);
		}
		
		//-----------------------------------
		
		Vector<Manager> managers = new Vector<Manager>();
		managers.add(m1);
		managers.add(m2);
		managers.add(m3);
		
		NameComparator nameComp = new NameComparator();
		Collections.sort(managers, nameComp);
		System.out.println("\n After sorting by name: ");
		
		for(Manager m: managers) {
			System.out.println(m);
		}
		
		//-------------------------------------
		
		HireDateComparator dateComp = new HireDateComparator();
		Collections.sort(m1.employees, dateComp);
		System.out.println("\n After sorting by hireDate: ");
		
		for(Employee em: m1.employees) {
			System.out.println(em);
		}
		
		//--------------------------------------
		
		SalaryComparator salaryComp = new SalaryComparator();
		Collections.sort(managers, salaryComp);
		System.out.println("\n After sorting by salary: ");
		
		for(Manager mg: managers) {
			System.out.println(mg);
		}
		
	}

}
