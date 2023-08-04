import java.util.Scanner;

public class Bigdecimal{
 public static void main(String[] args) {
   System.out.println("enter the two decimal values");
   Scanner scan = new Scanner(System.in);
    BigDecimal bg1 = scan.nextBigDecimal();  
    BigDecimal bg2 = scan.nextBigDecimal(); 
   System.out.println("result is:"+ bg1.add(bg2));
   scan.close();
 }
}