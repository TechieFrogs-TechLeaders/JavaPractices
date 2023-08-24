package Method_Assign;

class A{
     static void parent(){
        System.out.println("Parent");
    }
}

class B {
     static void parent1(){
        System.out.println("Child");
    }
}

public class Method_Ass {
    public static void main(String[] args) {
        //A myobj = new A();
       // B myobj1 = new B();
        A.parent();
        B.parent1();
        //myobj1.parent1();
    }
}
