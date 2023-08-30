package OOPS;

public class Nested_Class {
   // private int x = 45;
    String s = "Nested";
    protected double d = 4.6;
    static int z = 43;
    final long l = 888888l;
    static void myMethod(){
        System.out.println("Outer method" );
        //Inner innerobj = new Inner();
       // innerobj.myInner();
        System.out.println("Static inner variable :" );
    }
    private void outerMethod(){
        System.out.println("Private outer method"+Inner.e );
    }
    static class Inner{
       // private int a = 56;
        String b = "Inner (Non-Static method)"; 
        public float c = 4.87f;
        static int e = 12;
        final double y = 67; 
        void myInner(){
            System.out.println("This is a inner class "+z );
            myMethod();//only static method can be accessed in static class
            
        }
        static void display(){
            System.out.println("Private Inner class" );
            //Nested_Class.outerMethod(); //cannot access non Static fields
        }
        public static void main(String[] args) {
            display();
           System.out.println(Inner.e); 
           Inner myObj = new Inner();
           myObj.myInner();
        }
    }
    public static void main(String[] args) {
        Inner myInner = new Inner();
        Inner.display();
        myInner.myInner();
        System.out.println(myInner.b);
        Nested_Class newObj = new Nested_Class();
        newObj.outerMethod();
    }
        
}