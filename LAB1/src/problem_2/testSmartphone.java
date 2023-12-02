package problem_2;

import java.util.Scanner;

public class testSmartphone {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		Smartphone phone1 = new Smartphone();
		System.out.println(phone1);
		
		Smartphone phone2 = new Smartphone(Brand.SAMSUNG, "black", 64, Size.MB, 3000, "Korea");
		System.out.println(phone2);
		
		Smartphone phone3 = new Smartphone(Brand.NOKIA, "blue", 1, Size.TB, 1500, "Vietnam");
		System.out.println(phone3);
		
		System.out.println();
		Smartphone phone = new Smartphone();
		System.out.println("How many pieces do you want to buy?");
		System.out.println(phone.sumOfSale(phone2.brand, in.nextInt()));
		
		in.close();
	}

}
