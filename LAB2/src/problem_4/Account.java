package problem_4;

public class Account {
	
	private double balance;
	private int accNumber;
	private boolean condition;
	
	public double getBalance() {
		return balance;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public boolean getCondition() {
		return condition;
	}

	public Account(int accNumber) {
		this.balance = 0;
		this.accNumber = accNumber;
		this.condition = true;
	}
	
	public void deposit(double sum) {
		if(condition) {
			balance += sum;
		}
		else {
			return ;
		}
	}
	
	public void withdraw(double sum) {
		if(condition && balance >= sum) {
			balance -= sum;
		}
		else {
			return ;
		}
	}
	
	public void transfer(double amount, Account other) {
		if(amount>0 && balance<=amount && condition && other.condition) {
			withdraw(amount);
			other.deposit(amount);
		}
		else {
			return ;
		}
	}
	
	public void close() {
		condition = false;
	}
	
	public String toString() {
		return "Account number" + accNumber + ": "+"balance: "+ balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
