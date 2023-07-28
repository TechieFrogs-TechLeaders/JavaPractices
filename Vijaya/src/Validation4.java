import java.util.Scanner;
public class Validation4{

public static void main(String[] args) {
           // Scanner scanObj = new Scanner(System.in);
                     float num;
                    Scanner Scanobj = new Scanner(System.in);
                    do{
                        System.out.println("enter the number");
                        while(!Scanobj.hasNextFloat()) {
                            System.out.println("not float! please enter the float values ");
                            Scanobj.next();
                        }
                        num= Scanobj.nextFloat();
                    }while(num<=0);
      System.out.println("it is a value of integer");
      Scanobj.close();
            }
        }
    
