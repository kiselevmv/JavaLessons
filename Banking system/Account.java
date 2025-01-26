public class Account {
	private String accountName;
	private double balance;

	Account (String setName, double setBalance) {
		this.accountName = setName;
		this.balance = setBalance;
	}

	public void deposit(double sum) throws InvalidOperation {
		try {
			if (sum < 0) { 
				throw new InvalidOperation("Deposit amount could not be negative.\nOperation calnceled."); 
			} else { 
				this.balance = this.balance + sum; 
			}
		} catch (InvalidOperation e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

	public void withdraw(double sum) {
		try {
			if ( (this.balance - sum) < 0) { 
				throw new InvalidOperation("Not enougth money at balance"); 
			} else {
				this.balance = this.balance - sum;
			}
		} catch (InvalidOperation e) {
			e.printStackTrace();
			e.getMessage();
		} finally { System.out.println("Cleaning resources"); }
	}

	public double getBalance() {
		return this.balance;
	}
		
}
