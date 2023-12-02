package problem_4;

import java.util.Vector;

public class Bank {
	Vector<Account> accounts = new Vector<Account>();

	public Bank() {
	}

	public void openAccount(Account account) {
	    accounts.add(account);
	}

	public void closeAccount(int accountNumber) {
	    for (Account acc : accounts) {
	        if (acc.getAccNumber() == accountNumber) {
	            acc.close();
	            break;
	        }
	    }
	}

	public void update() {
	    for (Account acc : accounts) {
	        if (acc instanceof SavingAccount) {
	            ((SavingAccount) acc).addInterest();
	        } else if (acc instanceof CheckingAccount) {
	            ((CheckingAccount) acc).deductFees();
	        }
	    }
	}
	    
	public Vector<Account> getAccounts() {
	    return accounts;
	}
}
