import java.util.Scanner;
public class ValidationDouble{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        Double h;
        do{
            System.out.println("Enter the decimal  value");

            while(!Scan.hasNextDouble()){
                System.out.println("wrong value! enter  decimal value");
                Scan.next();
            }
                h=Scan.nextDouble();
            
            }while(h<=0);
            Scan.close();
        }
    
}

    

