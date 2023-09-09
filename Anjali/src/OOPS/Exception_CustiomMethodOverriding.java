package OOPS;

public class Exception_CustiomMethodOverriding {
    void display(){
        System.out.println("Custom Exception Overriding");
    }
}


class Child1 extends Exception_CustiomMethodOverriding {
    void display() throws ArithmeticException{
        System.out.println("Child class");
        super.display();
    }
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.display();
    }
}
