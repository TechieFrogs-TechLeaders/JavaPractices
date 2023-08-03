import java.util.Scanner;
   class Todaycoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palindrome number");
        int num = sc.nextInt();
        int originalnum = num;
        int reversednum = 0;
        while(num!=0) {
       int remainder = 0;
       int reversed=reversednum*10+remainder;
       num = num/10;
       if (originalnum == reversednum) {
        System.out.println("Is not a palindrome");
       } else {
        System.out.println("Is a palindrome");
    }
       sc.close();
    
}
    }
}