import java.util.Scanner;
  class Factcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num;
        long fact=1;
        num = sc.nextInt();
        for(int i =1;i<=num;i++) {
            System.out.println("Factorial of number"  +fact);
        }
        fact = fact*num;
    }
    // sc.close();
  }

 

