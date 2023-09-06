package OOPS;

import java.util.Scanner;

public class Array_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements, one per line:");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("You entered the following array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
            
        sc.close();
    }
}
