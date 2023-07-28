package Classpractice;
import java.util.Scanner;
public class Scan2 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("enter the values:");
        boolean b1=sc.nextBoolean();
        System.out.println("the values are "+ b1);
        System.out.println("enter the values of the integer :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=n1+n2;
        System.out.println("the sum of the values are:"+sum);
        sc.close(); 
        //next example
        
        Scanner scan= new Scanner(" Integer 21 number 31 is 41 hi");
        while(scan.hasNext()){
            if(scan.hasNextInt()){
                System.out.println("found Int values:"+scan.next());
            }
            else{
                scan.next();
            }
        }
        scan.close();
    }
}

