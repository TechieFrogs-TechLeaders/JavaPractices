package Abstract_Assign;

abstract public class Bank {
    abstract int getBalance();
}
class BankA extends Bank{
    int balance = 100;
    //override
    int getBalance(){
        return balance;
       // System.out.println("$100");
    }
}
class BankB extends Bank{
    int balance = 150;
    //override
    int getBalance(){
        return balance;
    }
}
class BankC extends Bank{
    int balance = 200;
    //override
    int getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}
