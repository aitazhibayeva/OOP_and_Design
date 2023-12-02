package problem_4;

public class CheckingAccount extends Account{

	private int transaction;
	private static final int FREE_TRANSACTION = 3;
	private static final double TRANSACTION_FEE = 0.02;
	
	public CheckingAccount(int accNumber) {
		super(accNumber);
		this.transaction = 0;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		transaction++;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		transaction++;
	}

	public void deductFees() {
		if(transaction>FREE_TRANSACTION) {
			double fees = TRANSACTION_FEE * (transaction - FREE_TRANSACTION);
			if(getBalance()>=fees) {
				withdraw(fees);
			}
			else {
				return ;
			}
			transaction = 0;
		}
		else {
			return ;
		}
	}
	
	public int getTransaction() {
		return transaction;
	}

	public static int getFreeTransaction() {
		return FREE_TRANSACTION;
	}

	public static double getTransactionFee() {
		return TRANSACTION_FEE;
	}

}
