package problem_4;

import java.time.LocalDate;

public class Employee extends Person implements Cloneable, Comparable<Employee>{
	
	private double salary;
	private LocalDate hireDate;
	private String insuranceNumber;
	
	public Employee() {
		super();
	}
	
	public Employee (String name, double salary, LocalDate hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		
		Employee e = (Employee)o;
		
		return this.salary == e.salary 
				&& this.hireDate.equals(e.hireDate) 
				&& this.insuranceNumber.equals(e.insuranceNumber);
	}	
	
	public int compareTo(Employee e) {
		if(this.salary > e.salary) return 1;
		if(this.salary < e.salary) return -1;
		
		return this.getName().compareTo(e.getName());
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); 
	}
	
	public String toString() {
		return super.toString() + ", salary: " + salary + 
				", hireDate: " + hireDate + 
				", insuranceNumber: "+ insuranceNumber;
	}
	
}
