package OOPS.Interface;

public interface DemoInterface {
    void method1();
    void method2();
    void method3();
}

class MyImplementation implements DemoInterface {
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    public void method2() {
        System.out.println("Method 2 implementation");
    }

    public void method3() {
        System.out.println("Method 3 implementation");
    }
}
class MainMeth {
    public static void main(String[] args) {
        MyImplementation myObj = new MyImplementation();
        myObj.method1();
        myObj.method2();
        myObj.method3();
    }
}