package OOPS;



class Parent{
    void display() throws RuntimeException{
        System.out.println("Parent Class");
    }
}

class Middle extends Parent{
    void display() {
        
        System.out.println("ArithmeticException");
        super.display();
    }
}

public class Exce_CustomeExceptionOverriding extends Middle{
    void display() throws NullPointerException{
        System.out.println("overriding");
        super.display();
    }
    public static void main(String[] args) {
        Exce_CustomeExceptionOverriding obj = new Exce_CustomeExceptionOverriding();
        obj.display();
    }
}
