package ExceptionAssignment;
import java.util.Scanner;
public class SumExceptions {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        System.out.println("Type Two Numbers");
        Scanner sc = new Scanner(System.in);
        try{
        a = sc.nextInt();
         b = sc.nextInt();
        } catch(Exception ex){
            System.out.println(ex);
        }
    }
}


