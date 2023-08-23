import java.util.Scanner;

public class validation_Boolean {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value");
        while(!scan.hasNextBoolean()){
            System.out.println("The value is not Boolean! Enter correct value");
            scan.next();
        }
        scan.close();
    }
    
}
