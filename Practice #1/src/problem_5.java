import java.util.Scanner;

public class problem_5 {

	public static void calculate(int balance, float percent, int month) {
		if(month == 1) {
			float saving_account = balance + balance * (float)(percent / 100);
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 2) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 3) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 4) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 5) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 6) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 7) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 8) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 9) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 10) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 11) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}else if(month == 12) {
			float saving_account = balance + balance * (float)(month*(percent / 100));
			System.out.println("After "+month+ "month: " + saving_account);
		}
	}
	
	public static void bank(int balance, float percent, int month) {
		calculate(balance,percent,month);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Your initial balance: ");
		int balance = in.nextInt();
		System.out.println("Percent: ");
		float percent = in.nextInt();
		System.out.println("Which month do you want to know?");
		int month = in.nextInt();
		
		bank(balance,percent,month);
		
		in.close();
	}

}
