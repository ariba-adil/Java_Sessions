package JavaStaticMembers;

public class StaticMembersInDifferentContexts {
	// Instance variables
    private String accountNumber;
    private double balance;
    
 // Static variables
    private static String bankName;
    private static double interestRate;
    
 // Constructor to initialize instance variables
    public StaticMembersInDifferentContexts(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Static method to get the bank name
    public static String getBankName() {
        return bankName;
    }

    // Static method to set the bank name
    public static void setBankName(String name) {
        bankName = name;
    }

    // Static method to get the interest rate
    public static double getInterestRate() {
        return interestRate;
    }

    // Static method to set the interest rate
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Method to print the details of the BankAccount object
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set static variables
		StaticMembersInDifferentContexts.setBankName("National Bank");
		StaticMembersInDifferentContexts.setInterestRate(3.5);

        // Create StaticMembersInDifferentContexts objects
		StaticMembersInDifferentContexts account1 = new StaticMembersInDifferentContexts("123456789", 1000.00);
		StaticMembersInDifferentContexts account2 = new StaticMembersInDifferentContexts("987654321", 2000.00);

        // Print details of each BankAccount object
        account1.printDetails();
        System.out.println();
        account2.printDetails();

	}

}
