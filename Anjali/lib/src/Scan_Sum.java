import java.util.Scanner;

public class Scan_Sum {
    public static void main(String[] args) {
        /* Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value:");
        boolean b1=sc.nextBoolean();
        System.out.println("The values are: "+b1);
        System.out.println("Enter the integer values :");
        int num1=sc.nextInt();
    
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum value :"+sum);
        sc.close();
*/
int num;
Scanner scan = new Scanner(System.in);  
        //Iterate through the tokens  
        
        
            do{
                 System.out.println("enter the positive values:");
                while(!scan.hasNextInt()){
                    System.out.println("Not Int!Please enter int values ");
                    scan.next();//it only checks if the next value is present or not
                    //if the value is int then the while loop will be closed 

                }
                num=scan.nextInt();//if the next value is int it will be stored in num
            }while(num<=0); //The condition is true if negative value then the loop continuous
            //System.out.println("is a integer");
            //return num;
           
              
    
        scan.close();  
    }
    
}

