import java.util.Scanner;
     class Demo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter customer Name");
            String Name= sc.nextLine();
            System.out.println("Enter customer Id");
            int Id = sc.nextInt();
            System.out.println("Enter Customer Balance");
            Double Bal = sc.nextDouble();
        
        sc.close();
    }

     }