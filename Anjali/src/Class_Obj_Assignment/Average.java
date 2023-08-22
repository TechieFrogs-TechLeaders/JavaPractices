package Class_Obj_Assignment;

import java.util.Scanner;

public class Average {

    public void myAverage(double num1, double num2, double num3){
       double avg = (num1 + num2 + num3) / 3;
       System.out.println("Average:"+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value:");
        int num1 = sc.nextInt();
        System.out.println("Enter the b value:");
        int num2 = sc.nextInt();
        System.out.println("Enter the c value:");
        int num3 = sc.nextInt();
        Average averagecalculate = new Average();
        averagecalculate.myAverage(num1, num2, num3);
        sc.close();
    }
}
