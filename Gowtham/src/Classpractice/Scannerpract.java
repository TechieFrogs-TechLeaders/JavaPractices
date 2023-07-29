package Classpractice;
import java.util.Scanner;

public class Scannerpract {
    public static void main(String[] args) {
        //int
        Scanner scaObj =new Scanner(System.in);
       System.out.println("enter the values:");

       int n1=scaObj.nextInt();
       int n2=scaObj.nextInt();
       System.out.println("the int values are:"+n1+" "+n2);
       //float
       System.out.println("enter the values:");
       float f1=scaObj.nextFloat();
       float f2=scaObj.nextFloat();
       System.out.println("the float values are:"+f1+" "+f2);
       //double
       System.out.println("enter the values:");
       double d1=scaObj.nextDouble();
       double d2=scaObj.nextDouble();
       double d3=scaObj.nextDouble();
       System.out.println("the double values are:"+ d1 +" "+ d2+" " + d3);
       //boolean
       System.out.println("enter the value");
       boolean b1=scaObj.nextBoolean();
       System.out.println("the boolean values are:"+b1);
       //long
       System.out.println("enter the value");
       long l1=scaObj.nextLong();
       long l2=scaObj.nextLong();
       System.out.println("long values:"+l1+" "+l2);
       scaObj.close();
       



    }
}
