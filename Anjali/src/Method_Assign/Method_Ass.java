package Method_Assign;

class A{
    public static void parent_Demo(){
        System.out.println("Parent");
    }
}
class B extends A{
    public static void parent_Demo(){
        System.out.println("Child");
    }
}

public class Method_Ass {
    public static void main(String[] args) {
        //A myobj = new A();
       // A myobj1 = new B();
       // A.parent();
        B.parent_Demo();
    }
}
