package problem_4;

import java.time.LocalDate;
import java.util.Vector;

public class Manager extends Employee{
	
	private int bonus;

	Vector<Employee> employees = new Vector<Employee>();
	
	public Manager() {
		super();
	};
	
	public Manager(String name, double salary, LocalDate hireDate, String insuranceNumber, Vector <Employee> employees) {
		super(name, salary, hireDate, insuranceNumber);
		this.employees = employees;
	}
	
	public Manager(String name, double salary, LocalDate hireDate, String insuranceNumber, Vector <Employee> employees, int bonus) {
		super(name, salary, hireDate, insuranceNumber);
		this.employees = employees;
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Manager m = (Manager)o;
		
		return this.employees.equals(m.employees); 
	}
	
	public int compareTo(Employee e) {
		if(super.compareTo(e)!=0) return super.compareTo(e);
		if(e instanceof Manager) {
			Manager m = (Manager)e;
			if(this.bonus > m.bonus) return 1;
			if(this.bonus < m.bonus) return -1;
		}
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public Object clone() throws CloneNotSupportedException{
		Manager m = (Manager)super.clone();
		m.employees = (Vector<Employee>)employees.clone();
		return m; 
	}
	
	public String toString() {
		return super.toString() + ".\n Employees: " + this.employees+
				", bonus:" + bonus;
	}
}
