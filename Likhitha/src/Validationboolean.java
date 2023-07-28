import java.util.Scanner;
    class Validationboolean{
        public static void main(String[] args) {
            boolean b;
        Scanner sc = new Scanner(System.in);
        
        do {
        System.out.println("Enter a boolean value:");

        while (!sc.hasNextBoolean()) {

                 System.out.println(" Not boolean!please enter the boolean value:" );
                 sc.next();
        }
        b= sc.nextBoolean();
    } while (b>0) {
    
            System.out.println("it is a value of boolean"); 
        sc.close();
      
    }
}

}   

