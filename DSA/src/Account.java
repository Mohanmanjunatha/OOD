
public class Account {
	
	private double balance;
	private String name;
	
	
	public Account() {
		this.name="Account";   //default constructor
		this.balance=0;
	}

	public Account(String accountName, double initialBalance) {
		this.balance=initialBalance;
		this.name=accountName;
	
	}
		public void adjust(double amount) {
			balance =balance+amount;
			
		}
	
	
		public String toString() {
			String output=name;
		output=output+String.format(": $%2f", balance);
			return output;
			
		}
	}
	
	



