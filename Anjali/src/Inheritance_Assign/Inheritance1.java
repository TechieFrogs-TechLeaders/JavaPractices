package Inheritance_Assign;

public class Inheritance1 {
    public void parentMethod(){
        System.out.println("This is a parent class");
    }

    public static void main(String[] args) {
        Inheritance1 myobj = new Inheritance1();
        myobj.parentMethod();
        
    }
}

 class Inheritance2 extends Inheritance1{
     public void childMethod(){
        System.out.println("This is child class");
     }
     public static void main(String[] args) {
        Inheritance2 myobj1 = new Inheritance2();
        myobj1.childMethod();
        myobj1.parentMethod();
     }
}