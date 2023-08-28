package OOPS.Interface;

public interface MyInterface {
    int Const = 69;
}

class MyClass implements MyInterface{
    public static void main(String[] args) {
       System.out.println(" The Constant value is: " + MyInterface.Const);
    }
}