package Classpractice;

public class CatchExample {
    public static void main(String[] args) {
        int i=69,j=0,div;
        try{
            div=i/j;
        }
        catch(ArithmeticException a){
            System.out.println(i/(j+2));
        }
    }
}
