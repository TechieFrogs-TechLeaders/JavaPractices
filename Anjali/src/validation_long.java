import java.util.Scanner;

public class validation_long {
    
    public static void main(String[] args) {
        long g;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("enter the values");
            while(!scan.hasNextLong());
            {
                System.out.println("Wrong value!Enter correct value");
                scan.next();
            }
            g=scan.nextLong();
        }while(g<=0);
        scan.close();
        }
}
