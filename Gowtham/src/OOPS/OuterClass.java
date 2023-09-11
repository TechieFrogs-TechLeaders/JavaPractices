package OOPS;

public class OuterClass{
    static int outerx=10;
    int outery=20;
    private int outerPrivate=30;
    class InnerClass{
        void display(){
            System.out.println("outerx="+outerx);
            System.out.println("outery="+outery);
            System.out.println("outerprivate"+outerPrivate);
      
        }
    }
    public void outerMethod() {
    }
}
 class InnerClass {
    public static void main(String[] args) {
        
    OuterClass outerObject=new OuterClass();
    OuterClass.InnerClass innerObject=outerObject.new InnerClass();
    innerObject.display();
}
}