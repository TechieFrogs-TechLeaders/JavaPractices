package Array_Assign;


import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 9, 22, 54, 98, 32, 67, 34, 43};

        Arrays.sort(arr);

        System.out.println("The sorted Array : " + Arrays.toString(arr));  //in array toString converts to array list


    }
}
