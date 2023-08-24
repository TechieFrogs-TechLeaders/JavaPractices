package OOPS;

public class Final_Demo {
    static final int a;
    final int i = 40;
    static{
        a = 10;
        System.out.println("in Static block");
    }
    final int b;
    {
        b = 20;
        System.out.println("In Final block");
    }
    int c;{
        System.out.println(c= 45);
    }
    Final_Demo(){
         System.out.println("From parent");
    }
    final void  method1(int a ,int b){
          a = 6;
          b = 5;
          System.out.println(a + "  "+b);
    }
    
}

class Final_1 extends Final_Demo{
    static final int a;
    static{
        a = 10;
        System.out.println("in child Static block");
    }
    final int b;
    {
        b = 20;
        System.out.println("In child Final block");
    }
    Final_1(){
          System.out.println("From child");
           //System.out.println(super.a+" "+super.b);
    }

    public static void main(String[] args) {
        final Final_1 myobj = new Final_1(); //cannot be assigned since final
        myobj.method1(3, 5);
       // Final_1 my = new Final_1();
       // myobj = my;
      System.out.println(myobj.i); 
        
    }
}
