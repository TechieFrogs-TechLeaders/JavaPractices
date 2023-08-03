import java.util.Scanner;

public class Example {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter row value");
        
       // int r,n;
           int r = scan.nextInt();
         System.out.println("Enter n values");
       int n = scan.nextInt();
        for(int i =1;i<=r;++i){
            for(int j = 1; j<=i; ++j){
                System.out.print(n+ " ");
               //int i= scan.nextInt();
               n++;

            }
            
            System.out.println();
            
        }
        scan.close();

        }
    
}
