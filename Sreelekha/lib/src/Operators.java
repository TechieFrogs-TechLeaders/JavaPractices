public class Operators {
    public static void main(String[] args) {
     int a=12, b=13, c=18;
     //unary operators
     //Increment = prefix;
     a=a+1;
     System.out.println(++a);
     //Decrement = prefix;
     a=a-1;
     System.out.println(--a);
     //Increment = postfix;
     a=a+1;
     System.out.println(a++);
     //Decrement = postfix;
     a=a-1;
     System.out.println(a--);
     System.out.println(a++ - a-- + b++ - a++ + c-- - a++);
     System.out.println(a+ " "+b + " "+c);

    }
}