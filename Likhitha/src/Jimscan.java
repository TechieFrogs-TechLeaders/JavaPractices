import java.util.Scanner;
    class Jimscan {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        int i = input.nextInt();
        System.out.println("Enter boolean");
        boolean b = input.nextBoolean();
        System.out.println("Enter string token");
        String s = input.next();
        input.nextLine();
        System.out.println("Enter sentence");
        String s1 = input.nextLine();
        input.close();
        System.out.println("My input values "+i+"   "+b+"  "+s+"   "+s1);
    }
}
        