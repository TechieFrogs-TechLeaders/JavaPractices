public class Operators {
    public static void main(String[] args) {
         int a=10,b=20,c=25;
         //unary operators
         //Increament -prefix
         a=a+1;
        System.out.println(++a);
         //Decreament -prefix
         a=a-1;
         System.out.println(--a);
        //Increament -postfix
        a=a+1;
        System.out.println(a++);
        System.out.println(a);
        //Decreament -postfix
        a=a-1;
        System.out.println(a--);
        System.out.println(a++ + ++a); 
        System.out.println(a-- - a++);
        System.out.println(a+ " " +b + " " +c);
        System.out.println(a++ + ++b - c++); //17+21-25=13
        System.out.println(--a);
    }
}
        

