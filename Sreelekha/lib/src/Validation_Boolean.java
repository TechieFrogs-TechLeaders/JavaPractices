import java.util.Scanner;
public class Validation_Boolean {
    public static void main(String[] args){
        Scanner Scan= new Scanner(System.in);
        
        System.out.println("enter  positive value");
        while(!Scan.hasNextBoolean()){
            System.out.println("wrong value! entered next value");
            Scan.next();
            Scan.close();

        }
    }
    
}


