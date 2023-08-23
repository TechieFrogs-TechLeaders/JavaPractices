package Method_Assign;


class Customer{
    String name;
}

class Account {
    String acc;
}
class RBI{
    String Customer ; //hasA relationship
    String Account ; 

    public RBI(String Customer, String Account) {
        this.Customer = Customer;
        this.Account = Account;
    }
    public double getInterestRate() {
        return 0.0; // Base implementation
    }

    public double getWithdrawalLimit() {
        return 0.0; // Base implementation
    }

}
class SBI extends RBI {
    public SBI(String Customer, String Account) {
        super(Customer, Account);
    }

    //Override
    public double getInterestRate() {
        return 4.0; // SBI's specific interest rate
    }

    //Override
    public double getWithdrawalLimit() {
        return 50000.0; // SBI's specific withdrawal limit
    }
}
class ICICI extends RBI {
    public ICICI(String Customer,String Account) {
        super(Customer, Account);
    }

    //Override
    public double getInterestRate() {
        return 4.5; // ICICI's specific interest rate
    }

    //Override
    public double getWithdrawalLimit() {
        return 75000.0; // ICICI's specific withdrawal limit
    }
}
public class Diff_Banks {
    public static void main(String[] args) {
      //  Customer customer = new Customer();
       // Account account = new Account();

        SBI sbi = new SBI("john", "dfjsdfjkfkfk");
        ICICI icici = new ICICI("Ravi", "dshfjvjxscn");

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");

        System.out.println("SBI Withdrawal Limit: $" + sbi.getWithdrawalLimit());
        System.out.println("ICICI Withdrawal Limit: $" + icici.getWithdrawalLimit());
    }
}
