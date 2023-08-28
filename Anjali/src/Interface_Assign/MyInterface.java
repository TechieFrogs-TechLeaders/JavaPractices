package Interface_Assign;

public interface MyInterface {
    int CONSTANT_VALUE = 42;
}

class MyClass implements MyInterface{
    public static void main(String[] args) {
       //MyClass myClass  = new MyClass();
       System.out.println("Constant value: " + MyInterface.CONSTANT_VALUE); //accessed by class name
    }
}
