import java.util.Scanner;
public class NextInt {
 public static void main(String[] args)  {
   Scanner Scanobj = new Scanner(System.in);
   System.out.print("please value of an integer");
   int num = Scanobj.nextInt();
   System.out.println("the number you enterdis:"+num);
   Scanobj.close();
 }
}