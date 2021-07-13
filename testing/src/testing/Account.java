package testing;

public class Account {
	
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(double balance) {
		this.balance=balance;
	}
	
	public double deposit(double amount) {
		if(amount<0)
			throw new NumberFormatException("megative amount");
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount) throws BalanceException{
		if(amount<0)
			throw new NumberFormatException("negative amount");
		if(amount>balance)
			throw new BalanceException("insuf balance");
		balance-=amount;
		return balance;
	}

}
