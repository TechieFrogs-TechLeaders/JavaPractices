import java.util. Scanner;
public class Validation1 {
    public static void main(String[] args) {
        Scanner Scanobj = new Scanner(System.in);
            System.out.println("enter your number");
            if(Scanobj.hasNextInt()){
                int numbrEnterd = Scanobj.nextInt();
                System.out.println("you enterd an integer");
            }else{
                System.out.println("you dont enterd an integer");
          Scanobj.close();
        }
    }
}
    
