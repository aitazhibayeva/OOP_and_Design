package problem_5;

import week2.Time;
import problem_4.Employee;
import java.time.LocalDate;

public class Tester {

	public static void main(String[] args) {
		
		Chocolate[] chocolates = new Chocolate[6];
		
		chocolates[0] = new Chocolate(91, "Kazakhstan");
		chocolates[1] = new Chocolate(2, "Twix");
		chocolates[2] = new Chocolate(20, "Merci");
		chocolates[3] = new Chocolate(5, "Albeni");
		chocolates[4] = new Chocolate(10, "Snikers");
		chocolates[5] = new Chocolate(3, "KitKat");
		
		System.out.println("Before sorting: ");
		for(Chocolate choco: chocolates) {
			System.out.println(choco);
		}
		
		Sort.BubbleSort(chocolates);
		System.out.println("\n After sorting: ");
		
		for(Chocolate choco: chocolates) {
			System.out.println(choco);
		}
		
		//---------------------------------------
		
		Time[] times = new Time[4];
		
		times [0] = new Time(21, 15, 33);
		times [1] = new Time(10, 58, 3);
		times [2] = new Time(4, 24, 11);
		times [3] = new Time(21, 15, 13);
		
		System.out.println("\n Before sorting: ");
		for(Time ti: times) {
			System.out.println(ti);
		}
		
		Sort.SelectionSort(times);;
		System.out.println("\n After sorting: ");
		
		for(Time ti: times) {
			System.out.println(ti);
		}
		
		//---------------------------------------
		
		Employee[] employees = new Employee[6];
		
		employees [0] = new Employee("Pakita", 54131, LocalDate.of(1083,11,17), "11-21");
		employees [1] = new Employee("Ivan", 15465, LocalDate.of(2005,1,23), "13-45");
		employees [2] = new Employee("Assylzhan", 75641, LocalDate.of(2002,6,2), "52-81");
		employees [3] = new Employee("Nariman", 35132, LocalDate.of(2001,6,16), "65-45");
		employees [4] = new Employee("Ayaulym", 65412, LocalDate.of(2018,1,1), "32-78");
		employees [5] = new Employee("BRB", 12412, LocalDate.of(1963,10,10), "78-78");
	
		System.out.println("\n Before sorting: ");
		for(Employee em: employees) {
			System.out.println(em);
		}
		
		Sort.BubbleSort(employees);
		System.out.println("\n After sorting: ");
		
		for(Employee em: employees) {
			System.out.println(em);
		}
	}

}
