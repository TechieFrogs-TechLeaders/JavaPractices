package Abstract_Assign;

abstract public class AbstractClass {
   AbstractClass(){ //only normal constroctor no abstract
        System.out.println("This is constructor of abstract class");
    }
    
    abstract void a_method();
    void myMethod(){
        System.out.println("This is a normal method of abstract class");
    }
}
class SubClass extends AbstractClass{
    void a_method(){
        System.out.println("This is abstract method");
    }
    public static void main(String[] args) {
        SubClass mySubClass = new SubClass();
        mySubClass.a_method();
        mySubClass.myMethod();
    }
}
