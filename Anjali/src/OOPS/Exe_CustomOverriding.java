package OOPS;

import java.io.IOException;

class Parent{
    void display() throws RuntimeException,ClassNotFoundException, IOException{
        System.out.println("Parent Class");
    }
}

class Middle extends Parent{
    void display() throws ClassNotFoundException {
        
        System.out.println("ArithmeticException");
        try {
            super.display();
        } catch (RuntimeException | IOException e) {
            
            e.printStackTrace();
        }
    }
}


public class Exe_CustomOverriding extends Middle{
    void display() throws NullPointerException{
        System.out.println("overriding");
        try {
            super.display();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Exe_CustomOverriding obj = new Exe_CustomOverriding();
        obj.display();
    }
}
