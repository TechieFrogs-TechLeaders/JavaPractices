package Abstract_Assign;

abstract public class Parent {
   abstract void message();
        
}
class Subclass1 extends Parent{
    //override
    void message(){
        System.out.println("This is first subclass ");
    }
}
class Subclass2 extends Parent{
    //override
    void message(){
        System.out.println("This is Second subclass ");
    }
   public static void main(String[] args) {
        Subclass1 myobj = new Subclass1();
        Subclass2 myobj1 = new Subclass2();
        myobj.message();
        myobj1.message();
   }
}

