package OOPS;

public class OuterClass1 {
   int x=10;
   static class InnerClass1{
    int y=15;
   } 
}
 class mainM{
public static void main(String[] args) {
    OuterClass1.InnerClass1 myinner=new OuterClass1.InnerClass1();
    System.out.println(myinner.y);
}
} 