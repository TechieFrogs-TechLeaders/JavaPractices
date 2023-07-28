import java.util.Scanner;

public class validation_Float {
    public static void main(String[] args) {
        Double f;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("Enter the positive value");
            while(!scan.hasNextDouble()){
                System.out.println("You entered wrong value! Enter the decimal Value");
                scan.next();
            }
            f=scan.nextDouble();
        }while(f<=0);

    scan.close();
    }
    
}
