package BasicAssignment;
public class Swapping {
    public static void main(String[] args) {
   int a1=15,a2=20;

         System.out.println("Before swap");
         System.out.println("a1=" +a1);
         System.out.println("a2=" +a2);
         //Tempaorary value is assign with a1 variable
         int temp=a1;
         //first variable is assign with a2 variable
         a1=a2;
         //second variable is assign with a1 variable
         a2=temp;
                System.out.println("After swap");
                System.out.println("a1=" +a1);
                System.out.println("a2=" +a2);
    }
}
        