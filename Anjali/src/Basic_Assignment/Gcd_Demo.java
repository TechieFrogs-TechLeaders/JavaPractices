package Basic_Assignment;

import java.util.Scanner;

public class Gcd_Demo {
    public static void main(String[] args) {
       /*  int num1=45,num2=78,gcd=0;//gcd can be 0 or 1 it is just to initialize
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }System.out.println("the gcd of "+num1 +" and  "+ num2 +" is " +gcd);*/
        int gcd=1;
        System.out.println("Enter the Values:");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }

        }System.out.println("The Gcd of num1:"+num1+"  num2:"+num2+"  is "+gcd);

    scan.close();
    }
    
}
