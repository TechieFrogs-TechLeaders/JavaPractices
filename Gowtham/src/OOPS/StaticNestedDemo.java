package OOPS;

public class StaticNestedDemo {
    static int outer_x=20;
    int outer_y=40;
    private static int outer_private=60;
    static class StaticNestedD{
        void display(){
            System.out.println("outer_x = "+outer_x);
            System.out.println("outer_private = "+outer_private);
           //System.out.println("outer_y="+outer_y);
        }
    }
}
 class NestedInnerClass {
    public static void main(String[] args) {
        
    StaticNestedDemo.StaticNestedD nestedObject=new StaticNestedDemo.StaticNestedD();
    nestedObject.display();
    }
}
