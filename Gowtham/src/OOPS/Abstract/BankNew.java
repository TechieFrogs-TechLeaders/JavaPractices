package OOPS.Abstract;

abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int getBalance() {
        return 100; 
    }
}

class BankB extends Bank {
    int getBalance() {
        return 150; 
    }
}

class BankC extends Bank {
    int getBalance() {
        return 200; 
    }
}

class AbstractBankExample {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
        
        System.out.println("Balance in Bank A: $" + bankA.getBalance()); 
        System.out.println("Balance in Bank B: $" + bankB.getBalance()); 
        System.out.println("Balance in Bank C: $" + bankC.getBalance()); 
    }
}

