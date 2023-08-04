import java.util.Scanner;
public class NewScan {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter int value");
            while(!Scan.hasNextInt()){  // it checks the next int is there are not
                System.out.println("not int! please enter int value");
                Scan.next();
            }
            num=Scan.nextInt();// int value is stored
        }while(num<=0);
        System.out.println("it is a integer");
        
        
        Scan.close();
        

        }

    }
    

