package problem_4;

public class testAccount {

	public static void main(String[] args) {
		
		Bank bank = new Bank();

        SavingAccount s = new SavingAccount(1, 10);
        CheckingAccount c = new CheckingAccount(2);

        bank.openAccount(s);
        bank.openAccount(c);

        s.deposit(1000);
        c.deposit(2000);

        bank.update();
        s.transfer(1000, c);
        
        s.print();
        c.print();
	}

}
