package OOPS;

abstract class MyClass {
    static int b = 67; 
    final int c = 45 ;
    static final int f ;
    static{
        f = 56;
    }
    void super_Method(){
        System.out.println("Super method");
    }

    abstract void myAbstractMethod();
}

public abstract class Abstract_Class extends MyClass {
    int a = 4; 
   /*  final int c;
    {
        c = 89;
    }*/
    //static final int f = 34;
    void myAbstractMethod(){
        System.out.println("GrandParent class Abstract method in Parent class");
    }
    abstract void abstractMethod(); //Abstract method contains no body

    void default_Demo(){
        System.out.println("Default method");
    }

    void myMethod(){
        System.out.println("A method in Abstract class");
    } 
}
class NewClass extends Abstract_Class{

    @Override
    void abstractMethod() {
       
       // throw new UnsupportedOperationException("Unimplemented method 'abstractMethod'");
        //super.abstractMethod(); //Abstract mrthod cannot be directly invoked
        System.out.println("Abstract method in child method");
    }
    
    void childMethod(){
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        NewClass myNewClass = new NewClass();
        myNewClass.a = 40 ;
       // MyClass.f = 20;
       // myNewClass.c = 11;
        System.out.println(myNewClass.a);
       
        myNewClass.abstractMethod();
        myNewClass.super_Method();
        myNewClass.myAbstractMethod();
       // System.out.println(myNewClass.b);
        System.out.println(myNewClass.c);
       // System.out.println(myNewClass.f);


    }

    
}
