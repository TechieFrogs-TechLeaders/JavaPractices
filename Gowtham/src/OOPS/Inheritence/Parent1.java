package OOPS.Inheritence;

class Parent1 {
    public void print() {
        System.out.println("This is parent class");
    }
}

class Child1 extends Parent1 {
    public void print() {
        System.out.println("This is child class");
    }
}

 class Pasrchi {
    public static void main(String[] args) {
        Parent1 parentObj1 = new Parent1();
        Child1 childObj1 = new Child1();
        parentObj1.print();     
        childObj1.print();   
        Parent1 parentRefToChild1 = new Child1();
        parentRefToChild1.print();
    }
}