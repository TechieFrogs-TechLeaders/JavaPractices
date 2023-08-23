package OOPS.Redo;

import java.util.Scanner;
public class AverageNew {

    public void myAverage(double n1, double n2, double n3){
       double avg = (n1 + n2 + n3) / 3;
       System.out.println("Average:"+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a value:");
        int n1 = sc.nextInt();

        System.out.println("Enter the b value:");
        int n2 = sc.nextInt();

        System.out.println("Enter the c value:");
        int n3 = sc.nextInt();

        AverageNew obj = new AverageNew();
        obj.myAverage(n1, n2, n3);
        sc.close();
    }
}

