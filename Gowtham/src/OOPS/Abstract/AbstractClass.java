package OOPS.Abstract;

abstract class AbstractClass {
    AbstractClass(){
        System.out.println("this constructor is of abstract class ");
    }
    abstract void a_method();
    void normalMethod(){
        System.out.println("this is a normal method");
    }
}
class SubClass extends AbstractClass {
    void a_method() {
        System.out.println("This is abstract method");
    }
}
class Abclass {
    public static void main(String[] args) {
        SubClass subObj = new SubClass();
        subObj.a_method();
        subObj.normalMethod();
    }
}