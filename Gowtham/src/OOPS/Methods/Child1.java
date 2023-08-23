package OOPS.Methods;

class B extends A {
    public static void print() {
        System.out.println("Child");
    }
}

class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.print(); 
        B.print();
    }
}