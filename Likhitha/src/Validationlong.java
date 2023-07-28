import java.util.Scanner;
    class Validationlong {
        public static void main(String[] args) {
            long num;
        Scanner sc = new Scanner(System.in);
        
        do {
        System.out.println("Enter a long value:");

        while (!sc.hasNextLong()) {

                 System.out.println(" Not float!please enter the long value:" );
                 sc.next();
        }
        num = sc.nextLong();
    }
    while(num<=0);
            System.out.println("it is a value of long"); 
        sc.close();
   }
}
    



    

