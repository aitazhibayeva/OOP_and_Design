package problem_3;

public class testTemperature {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature(59, "C");
		System.out.println("Almaty: " + temp1.toString());
		
		
		Temperature temp2 = new Temperature(18);
		temp2.setScale("F");
		System.out.println("Astana: " + temp2.toString());
		
		Temperature temp3 = new Temperature("C");
		temp3.setTemperatureValue(50);
		System.out.println("New York: " + temp3.toString());
	
		Temperature temp4 = new Temperature();
		temp4.setTempScale(10, "F");
		System.out.println("Tokyo: " + temp4.toString());

	}
}
