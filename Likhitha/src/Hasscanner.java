import java.util.Scanner;  
    class Hasscanner {    
    public static void main(String args[]){       
           String s = ("Hello, This is Likhitha");  
      
         Scanner scan = new Scanner(s);  
         
         System.out.println("Result: " +scan.hasNext());  

         System.out.println("String: " +scan.nextLine());  
        
         System.out.println("Final Result: " +scan.hasNext());  
        
         scan.close();  
       }    
    } 



