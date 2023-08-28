package OOPS;

public interface Interface_2 {
    void interfaceMethod1();
    default void defaultMethod(){
        System.out.println("The first Default method");
    }
}
interface Interface3{
    void interfaceMethod3();
    default void defaultMethod(){ //can extened only if there is a IS-A relationship between two interfaces
        System.out.println("The first Default method");
       
    }
    static void staticMethod(){
        System.out.println("Static method");
    }
}

class InterfaceClass implements Interface_2,Interface3{
    public void interfaceMethod1(){
        System.out.println("First method");
    }
    public  void defaultMethod(){
        System.out.println("The Second Default method");
        Interface3.super.defaultMethod();
        Interface_2.super.defaultMethod();
    } //can only be overriden in class no in interface
    public void interfaceMethod3(){
        System.out.println("This is Second method");
    }
    public static void main(String[] args) {
        InterfaceClass myClass = new InterfaceClass();
        myClass.interfaceMethod1();
        myClass.interfaceMethod3();
        myClass.defaultMethod();
        Interface3.staticMethod();
    }
}