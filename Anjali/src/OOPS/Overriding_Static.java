package OOPS;

public class Overriding_Static {
    public static void myMethod(){
         System.out.println("hello");
    }
}

class Overloading1 extends Overriding_Static{
    public static void myMethod(){
         System.out.println("hello world");
    }
    public static void main(String[] args) {
        Overloading1.myMethod();
        //Overloading1 myobj = new Overloading1();
        //myobj.myMethod();
        //Overriding_Static.myMethod();
    }
} 
