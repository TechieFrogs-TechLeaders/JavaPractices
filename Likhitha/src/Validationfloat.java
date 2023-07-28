import java.util.Scanner;
    class Validationfloat {
        public static void main(String[] args) {
            float num;
        Scanner sc = new Scanner(System.in);
        
        do {
        System.out.println("Enter a float value:");

        while (!sc.hasNextFloat()) {

                 System.out.println(" Not float!please enter the float value:" );
                 sc.next();
        }
        num = sc.nextFloat();
    }
    while(num<=0);
            System.out.println("it is a value of float"); 
        sc.close();
   }
}
    

