import java.util.Scanner;

public class EvenOdd{  
    public static void main (String args[])  
    {     
    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Enter the number: ");    
        int num=scan.nextInt();   
        findEvenOdd(num);
    }  
    }   
    public static void findEvenOdd(int num)  
    {   
    if(num%2==0)   
    System.out.println(num+" is even");   
    else   
    System.out.println(num+" is odd");  
    }  
    }  
