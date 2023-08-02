import java.util.Scanner;
    class Palindromecoding {
        public static void maib(String[] args) {
            Scanner sc = new Scanner(System.in);
       System.out.println("Enter palindrome number");
        int num = sc.nextInt();
        int originalnum = num;
        int reversednum = 0;
        while(num!=0) {
            int remainder = num%10;
            reversednum = reversednum*10+remainder;
            num=num/10;
        }
        if (originalnum == reversednum) {
            System.out.println("Is a palimdrome number");
        } else {
            System.out.println("Not a palindrome");
        }
         sc.close();
    }
}





