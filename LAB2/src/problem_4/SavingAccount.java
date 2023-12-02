package problem_4;

public class SavingAccount extends Account {

	private double interestRate;
	
	public SavingAccount(int accNumber, double interestRate) {
		super(accNumber);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		if(getCondition()) {
			double interest = getBalance() * (interestRate/100);
			deposit(interest);
		}
		else {
			return ;
		}
	}

	public double getInterestRate() {
		return interestRate;
	}
	

}
