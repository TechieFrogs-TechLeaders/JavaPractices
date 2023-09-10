package Classpractice;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=35/2;
        }
        catch(ArithmeticException e){
            System.out.println("Arthimatic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out");
            System.out.println("exception message"+e);
      //      e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("rest of the code");
    }
}
