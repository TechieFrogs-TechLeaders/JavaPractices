public class Arithmetic {
   public static void main(String[] args) {
    //Arthimetic operators
    System.out.println("Arithmetic operators");
    int a=15, b=20;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a/b);
    System.out.println(a*b);
    //Shift operators
    int c=2<<2;
    System.out.println("left shift"+c);
    System.out.println(10<<2);// 10*2^  10*4 =40
    System.out.println(a>>b);//a/2^b  15/2^20  15/80  
   }
}
