package OOPS;

public class Overriding_Static {
    public static void myMethod(){
         System.out.println("hello");
    }
    protected Overriding_Static(){
         System.out.println("Con");
    }
}

class Overloading1 extends Overriding_Static{
    public static void myMethod(){
         System.out.println("hello world");
    }

    Overloading1(){
        super(); //constructor super can only used in constructor only
    }
    public static void main(String[] args) {
        Overloading1.myMethod();
        //Overloading1 myOverloading1 = new Overloading1();
        //Overriding_Static();
        //Overloading1 myobj = new Overloading1();
        //myobj.myMethod();
        //Overriding_Static.myMethod();
    }
} 
