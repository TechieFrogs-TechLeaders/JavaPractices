package Basic_Assignment;

import java.util.Scanner;

public class New_Demo {
    public static void main(String[] args) {
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.println("no of rows:");
        r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
