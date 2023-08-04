import java.util.Scanner;

public class Validation_Int {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Enter the positive values");
            while(!scan.hasNextInt()){
                System.out.println("Not Int! Please enter int value");
                scan.next();
            }
            num=scan.nextInt();

        }while(num<=0);
        scan.close();
        
    }
    
}
