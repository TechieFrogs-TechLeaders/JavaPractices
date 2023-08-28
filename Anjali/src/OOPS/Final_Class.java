package OOPS;

final public class Final_Class {
    Final_Class(){
        System.out.println("The final class cannot be extended ");
    }
}

class Final_2 extends Final_1{
    final void myMethod(){
        System.out.println("Final method");
    }
}

class Final_3 extends Final_2{
   // void myMethod(){ }   //cannot override the final method
    public static void main(String[] args) {
        Final_3 myobj = new Final_3();
        myobj.myMethod(); //can call the final method
    }
}
