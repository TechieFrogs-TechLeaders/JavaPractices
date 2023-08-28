package OOPS;

public interface Interface_1 {
    int a = 56; //variables are considered as final static so can be accessied by class name
    String S = "Hello";
    void myMethod();
}
interface Interface2 extends Interface_1{
    public default void myMethod(){
        System.out.println("Overriden method");
    }

    void interfaceMethod();
}

class Interface_Class implements Interface2{
    /*public  void myMethod(){
        System.out.println("Overriden method");
    }*/
    public void interfaceMethod(){
        System.out.println("This is a Interface2 method");   
    }
    public static void main(String[] args) {
        Interface_Class myOby = new Interface_Class();
        myOby.myMethod();
        myOby.interfaceMethod();
        System.out.println(Interface_1.a);

        
    }
}

