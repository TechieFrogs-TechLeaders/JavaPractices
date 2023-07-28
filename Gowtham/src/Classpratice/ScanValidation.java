package Classpratice;
import java.util.Scanner;

public class ScanValidation {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         /*  int n1;
         do
         {
            System.out.println("enter the positive numbers:");
            while(!scan.hasNextInt()){                                //will check whether it is a int or not ,if not next line.
                System.out.println("this is not a number -enter a real number:");
                scan.next();                                            
                
            }
           n1=scan.nextInt();        //stores the value in n1
         }while(n1<=0);
    System.out.println("my value is"+n1);
         scan.close(); */

/* float f;
do
{
    System.out.println("enter the float num");
    while(!scan.hasNextFloat()){
        System.out.println("this is not a float num - enter the float num:");
        scan.next();
    }
    f=scan.nextFloat();
}while(f<=0);
System.out.println("my value is "+f);
scan.close(); */

/* boolean b;
   System.out.println("enter the boolean num");
    while(!scan.hasNextBoolean()){ 
     System.out.println("this is not boolean - enter the boolean value:");
        scan.next();       
}
b=scan.nextBoolean();
 System.out.println("my value is"+b);  
 scan.close(); */
 
 long l;
         do
         {
            System.out.println("enter the long numbers:");
            while(!scan.hasNextLong()){
                System.out.println("this is not a long number -enter a long number:");
                scan.next();
                
            }
           l=scan.nextLong();
         }while(l<=0);
    System.out.println("my value is"+l);
         scan.close(); 
}
}

