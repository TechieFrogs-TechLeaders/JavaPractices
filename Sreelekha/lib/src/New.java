import java.util.Scanner;

public class New {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter  value");
      
        
       int a= input.nextInt();
       int factorial =1;
    
        for(int i = 1;i<=a;i++){
            factorial = factorial*i;
            
            
        }
        System.out.println("factorial value "  +factorial);
        input.close();

    
}
}
