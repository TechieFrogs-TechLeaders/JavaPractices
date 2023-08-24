package Method_Assign;

class Bank{
    public int getBalance(){
        return 0;
    }
}
class BankA{
    public int getBalance(){
        return 1000;
    }
}
class BankB{
    public int getBalance(){
        return 1500;
    }
}

class BankC{
    public int getBalance(){
        return 2000;
    }
}
public class Bank1 {
    public static void main(String[] args) {
        BankA myBankA = new BankA();
        BankB myBankB = new BankB();
        BankC myBankC = new BankC();
        System.out.println("Balance in Bank A: $" + myBankA.getBalance());
        System.out.println("Balance in Bank B: $" + myBankB.getBalance());
        System.out.println("Balance in Bank C: $" + myBankC.getBalance());
    }
}
