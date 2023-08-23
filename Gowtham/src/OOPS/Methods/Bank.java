package OOPS.Methods;

 public class Bank {
    public int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    public int getBalance() {
        return 1000;
    }
}

class BankB extends Bank {
    public int getBalance() {
        return 1500;
    }
}

class BankC extends Bank {
    public int getBalance() {
        return 2000;
    }
}

class Locker {
    public static void main(String[] args) {
        BankA obj1 = new BankA();
        BankB obj2 = new BankB();
        BankC obj3 = new BankC();

        System.out.println("Bank A balance: $" + obj1.getBalance());
        System.out.println("Bank B balance: $" + obj2.getBalance());
        System.out.println("Bank C balance: $" + obj3.getBalance());
    }
}
