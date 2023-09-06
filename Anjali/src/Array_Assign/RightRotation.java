package Array_Assign;

import java.util.Scanner;

public class RightRotation {

    static void rightRotation(int arr[] , int rotation){
        
        int temp[] = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            temp[( i + rotation ) % arr.length] = arr[i];
        }
 
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = temp[i];
        }

    }

    static void display(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[]{ 1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of numbers to be rotated : ");
        int rotation = sc.nextInt();

        System.err.println("Original array : ");
        display(arr);

        System.out.println("Right rotated array : ");
        rightRotation(arr , rotation);
        display(arr);
    sc.close();
    }
}
