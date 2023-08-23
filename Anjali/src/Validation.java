import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        //int num;
        Scanner sc=new Scanner(System.in);
        //while (sc.hasNext()) {
            
           /*  if(sc.hasNextInt()){
                System.out.println("found int value:"+sc.nextInt());*/
                System.out.println("Enter the value:");
                  while(!sc.hasNextInt()){
                    System.out.println("Not Int!Please enter int values ");
                    sc.next();
                   
                }
                /*num=sc.nextInt();
                if(num<=0){
                    System.out.println("negative value");
                     System.out.println("Enter the value:");
                      while(!sc.hasNextInt()){
                    System.out.println("Not Int!Please enter int values ");
                    sc.next();
                
                }*/
            

            sc.close();

        }
        
    }
    
    
    

