package OOPS;

public class BankAccount {
    private int balance = 1000;
    public void withdraw(int amount) {
        class AccountManager {
            void processWithdraw() {
                if (amount > balance) {
                    System.out.println("Insufficient funds!");
                } else {
                    balance -= amount;
                    System.out.println( " withdrawn amount: " +  amount + " | Remaining balance: " + balance);
                }
            }
        }
        AccountManager manager = new AccountManager();
        manager.processWithdraw();
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.withdraw(11000);
        account.withdraw(900);
        account.withdraw(100);
        account.withdraw(1);
    }
}

