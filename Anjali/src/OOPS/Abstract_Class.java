package OOPS;

 abstract  class MyClass {
    static int b = 67; 
    final int c = 45 ;
    static final int f ;
    static{
        f = 56;
    }
    /*private void super_Method(){ //we can put the method private but is of no use because we can only use it in the abstract class only but we cant initialize/no obj so waste to put it in private
        System.out.println("Super method");
    }*/
    MyClass(){
        System.out.println("I am a grand-parent constructor");
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
    Abstract_Class(){
        System.out.println("I am parent constructor");
    }
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
       // myNewClass.super_Method();
        myNewClass.myAbstractMethod();
       // System.out.println(myNewClass.b);
        System.out.println(myNewClass.c);
       // System.out.println(myNewClass.f);


    }

    
}
