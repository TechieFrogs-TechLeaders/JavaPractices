package OOPS.Methods;

class Customer {
    private String name;
    private String address;

    // Constructor
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Account {
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class RBI {
    private double interestRate;
    private double withdrawalLimit;

    // Constructor
    public RBI(double interestRate, double withdrawalLimit) {
        this.interestRate = interestRate;
        this.withdrawalLimit = withdrawalLimit;
    }

    // Getter methods
    public double getInterestRate() {
        return interestRate;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
}

class SBI extends RBI {
    // Constructor
    public SBI() {
        super(4.6, 55000); 
    }
}

class ICICI extends RBI {
    // Constructor
    public ICICI() {
        super(5.0, 60000);
    }
}

 class Acc {
    public static void main(String[] args) {
        Customer customer1 = new Customer("stephen strange", "177 bleecker St");
        Account account1 = new Account(609, 5000);

        RBI rbi1 = new SBI();
        System.out.println("Bank: SBI");
        System.out.println("Customer: " + customer1.getName());
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Interest Rate: " + rbi1.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: $" + rbi1.getWithdrawalLimit());
        System.out.println("Balance: $" + account1.getBalance());
        System.out.println();

        Customer customer2 = new Customer("christine palmer", "106 Elm St");
        Account account2 = new Account(501, 8000);

        RBI rbi2 = new ICICI();
        System.out.println("Bank: ICICI");
        System.out.println("Customer: " + customer2.getName());
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Interest Rate: " + rbi2.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: $" + rbi2.getWithdrawalLimit());
        System.out.println("Balance: $" + account2.getBalance());
    }
}
