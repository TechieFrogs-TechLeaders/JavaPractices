package Interface_Assign;

// First interface
interface Interface1 {
    void method1a();
    void method1b();
}

// Second interface
interface Interface2 {
    void method2a();
    void method2b();
}

// Third interface
interface Interface3 {
    void method3a();
    void method3b();
}

// Inherited interface with a new method
interface InheritedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

// Concrete class
public class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete class method");
    }
}

// Class implementing InheritedInterface and inheriting from ConcreteClass
class MyClass1 extends ConcreteClass implements InheritedInterface {
    @Override
    public void method1a() {
        System.out.println("Method 1a");
    }

    @Override
    public void method1b() {
        System.out.println("Method 1b");
    }

    @Override
    public void method2a() {
        System.out.println("Method 2a");
    }

    @Override
    public void method2b() {
        System.out.println("Method 2b");
    }

    @Override
    public void method3a() {
        System.out.println("Method 3a");
    }

    @Override
    public void method3b() {
        System.out.println("Method 3b");
    }

    @Override
    public void newMethod() {
        System.out.println("New method");
    }

    /*public static void main(String[] args) {
        MyClass1 myObj = new MyClass1();

        myObj.method1a();
        myObj.method1b();
        myObj.method2a();
        myObj.method2b();
        myObj.method3a();
        myObj.method3b();
        myObj.newMethod();
        myObj.concreteMethod();
    }*/
}
 class Main {
    // Methods that take different interfaces as arguments
    static void methodForInterface1(Interface1 obj) {
        obj.method1a();
        obj.method1b();
    }

    static void methodForInterface2(Interface2 obj) {
        obj.method2a();
        obj.method2b();
    }

    static void methodForInterface3(Interface3 obj) {
        obj.method3a();
        obj.method3b();
    }

    static void methodForInheritedInterface(InheritedInterface obj) {
        obj.newMethod();
    }

    public static void main(String[] args) {
        MyClass1 myObj = new MyClass1();

        methodForInterface1(myObj);
        methodForInterface2(myObj);
        methodForInterface3(myObj);
        methodForInheritedInterface(myObj);
    }
}

 