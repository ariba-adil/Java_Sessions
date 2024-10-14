package JavaConstructor;
//constructor with validation

public class Account {
	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance =  balance;
		
		if(accountNumber == null || accountNumber.isEmpty()) {
			System.err.println("Error: Account number cannot be null or empty.");
		    return;
		}
		
		if(balance<0) {
			System.err.println("Error: Balance cannot be negative.");
            return;
		}
		
		
	}

	public static void main(String[] args) {
		Account account1 = new Account("12340009", 1000.00);
        System.out.println("Account 1 Number: " + account1.accountNumber);
        System.out.println("Account 1 Balance: " + account1.balance);

        // Test with invalid accountNumber
        Account account2 = new Account("", 400.00);

        // Test with invalid balance
        Account account3 = new Account("1230000873", -200.00);

	}

}
