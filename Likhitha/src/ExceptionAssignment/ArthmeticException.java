package ExceptionAssignment;

public class ArthmeticException {
    public static void main(String[] args) {
        int a = 12;
        int b = 15/0;
        System.out.println(a);
        try{
            System.out.println(b);
        }
        catch(ArithmeticException ee){
            System.out.println(ee);
    }
    }
}
