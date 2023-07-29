import java.util. Scanner;
    public class Validation3{
       
        public static void main(String[] args) {
             int num;
            Scanner Scanobj = new Scanner(System.in);
            do{
                System.out.println("enter the number");
                while(!Scanobj.hasNextInt()) {
                    System.out.println("not int! please enter the int values ");
                    Scanobj.next();
                }
                num= Scanobj.nextInt();
            }while(num<=0);
            System.out.println("it is a integer");
          Scanobj.close();
        }
    }