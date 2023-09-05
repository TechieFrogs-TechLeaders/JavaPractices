package ArraysAssignment;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
   public static void main(String[] args) {
        int[] arr = {5, 2, 7, 2, 4, 7, 8, 2, 3};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int length = arr.length;
        int newSize = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        arr[newSize] = arr[length - 1];
        newSize++;
        int[] uniqueArray = Arrays.copyOf(arr, newSize);
        System.out.println("Array after removing duplicates:");
        System.out.println(Arrays.toString(uniqueArray));
    }
}  

