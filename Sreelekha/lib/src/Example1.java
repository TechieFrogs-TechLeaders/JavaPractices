import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num value");
        
        int num = scan.nextInt();
        int sum=0;
        
        for(int i=1;i<=num;i++)
        sum+= i;
    

        System.out.println("natural numbers=" +sum);

        
   
    }  
}  

