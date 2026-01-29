package Bank;

public class BankAccount {

	public static void main(String[] args) {

		class BankAccount {
			private double balance = 0.0; // Initial balance

			// Deposit method
			public void deposit(double amount) {
				if (amount > 0) {
					balance += amount;
					System.out.println("Deposited: " + amount);
				} else {
					System.out.println("Invalid deposit amount");
				}
			}

			// Withdraw method
			public void withdraw(double amount) {
				if (amount > 0 && amount <= balance) {
					balance -= amount;
					System.out.println("Withdrew: " + amount);
				} else {
					System.out.println("Invalid withdrawal amount or insufficient balance");
				}
			}

			// Getter for balance
			public double getBalance() {
				return balance;
			}

			// Setter for balance (direct set not recommended, but included)
			public void setBalance(double balance) {
				if (balance >= 0) {
					this.balance = balance;
				}
			}

			public static void main(String[] args) {
				BankAccount account = new BankAccount();
				account.deposit(1000.0);
				account.deposit(500.0);
				account.withdraw(200.0);
				System.out.println("Current Balance: " + account.getBalance());
			}
		}

	}
}