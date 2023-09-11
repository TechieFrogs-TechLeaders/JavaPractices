package Array_Assign;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        
        System.out.println("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            numbers[i] = sc.nextInt();
        }

        double sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += numbers[i] ;
        }

        double average = sum/n ;

        System.out.println("The average is: " + average);

        sc.close();

    }
}
