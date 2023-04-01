package two.txt;

public class Account {
	int balance;
	
	public int deposit(int money) {
		return this.balance + money;
	}
	
	public int withdraw(int money) {
		return this.balance - money;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
