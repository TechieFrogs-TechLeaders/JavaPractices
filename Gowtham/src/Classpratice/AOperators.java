package Classpratice;


public class AOperators {
    public static void main(String[] args) {
        int a=35,b=19;
        boolean c = true;
        boolean d = false;
        System.out.println("a+b=" + a + b);
        System.out.println(a - b);  //arthimatic operators
        System.out.println(a * b);  // ,,
        System.out.println(a / b);  // ,, 
        System.out.println(a % b);  // ,,
        System.out.println(a++ + ++b); //unary operators
        System.out.println(--a + b--); //,,
        System.out.println(++a - ++b); //,,
        System.out.println(++a - ++a); //,,
        System.out.println(--b - b++); //,,
        System.out.println(~a);  //,,
        System.out.println(~b);  // ,,
        System.out.println(!c);  //,,
        System.out.println(!d);  //,,
        System.out.println(++a + b-- * ~a / ~b % ++b);
        System.out.println(a<<2);//39*2^2
        System.out.println(b<<2);
        System.out.println(a+""+b);
        System.out.println(a>> - ++b);// 39/2^-21


    }

}
