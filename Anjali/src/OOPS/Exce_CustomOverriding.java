package OOPS;

import java.io.IOException;

class Parent{
    void display() throws ClassNotFoundException,IOException,Exception{
        System.out.println("Class not fount");
    }
}

class Middle extends Parent{
    void display() throws ClassNotFoundException,IOException,Exception{
        System.out.println("Middle class");
    }
}

public class Exce_CustomOverriding extends Middle{
    void display()  throws Exception,ArithmeticException{
        System.out.println("Child class");
    }
    public static void main(String[] args) throws ArithmeticException, Exception {
        Exce_CustomOverriding obj  = new Exce_CustomOverriding();
        obj.display();
    }
}
