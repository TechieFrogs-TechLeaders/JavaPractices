import java.util.Scanner;
public class Nextlong{
  public static void main(String[] args)  {
    Scanner Scanobj = new Scanner(System.in);
    System.out.print("enter the number you want");
  long num = Scanobj.nextLong();
  System.out.println("output:"+(num*(num+2))/2);
    Scanobj.close();

  }
}