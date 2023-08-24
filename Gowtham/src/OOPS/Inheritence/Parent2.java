package OOPS.Inheritence;

class Parent2 {
   // private
    public void print() {
        System.out.println("This is parent class");
    }
}

class Child2 extends Parent2 {
    public void print() {
        System.out.println("This is child class");
    }
}

class private_Parent2 {
    public static void main(String[] args) {
        Parent2 parentObj2 = new Parent2();
        Child2 childObj2 = new Child2();
        parentObj2.print();     
        childObj2.print();      
        Parent2 parentRefToChild2 = new Child2();
        parentRefToChild2.print(); 
    }
}
