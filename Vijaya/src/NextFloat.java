 import java.util.Scanner;
 public class NextFloat{
    public static void main(String[] args){
    Scanner Scanobj = new Scanner(System.in) ;
    Float num1,num2,sum;
    System.out.println("please enter the first number");
    num1 = Scanobj.nextFloat();
    num2 = Scanobj.nextFloat();
    sum = num1+num2;
    System.out.println("sum of "+num1+"and"+num2+"is"+ sum );
    Scanobj.close();
    }

 }
    

