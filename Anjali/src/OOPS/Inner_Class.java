package OOPS;

public class Inner_Class {
    private int x = 45;
    String s = "Nested";
    protected double d = 4.6;
    static int z = 43;
    final long l = 888888l;
    void myMethod(){
        System.out.println("Outer method" );
        Inner innerobj = new Inner();
        innerobj.myInner();
        System.out.println("Static inner variable :"+Inner.e  +"  "+innerobj.c +" "+innerobj.y+" "+innerobj.a);//can access inner private and static fields
    }
    private void outerMethod(){
        System.out.println("Private outer method" );
    }
    class Middle{
        void myMain(){
            System.err.println("middle class");
        }
    }
    class Inner extends Middle{
        private int a = 56;
        String b = "Inner (Non-Static method)"; 
        public float c = 4.87f;
        static int e = 12;
        final double y = 67; 
        void myInner(){
            System.out.println("This is a inner class" + x  +" "+s + " "+l);
            //myMethod();
            
        }
        public void display(){
            System.out.println("Private Inner class" +d +" "+z);
            outerMethod();//can access all kinds of outer methods
        }
    }
    public static void main(String[] args) {
        Inner_Class outerobj = new Inner_Class();
        outerobj.outerMethod();
        outerobj.myMethod();
        Inner innerobj = outerobj.new Inner();
        innerobj.myInner();
        innerobj.display();
       innerobj.myMain();
    }
}
