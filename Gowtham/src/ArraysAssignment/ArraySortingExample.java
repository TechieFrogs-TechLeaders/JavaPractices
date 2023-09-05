package ArraysAssignment;

import java.util.Arrays;

public class ArraySortingExample {
 public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 9, 6, 8, 3};
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nArray Sorted in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}   

