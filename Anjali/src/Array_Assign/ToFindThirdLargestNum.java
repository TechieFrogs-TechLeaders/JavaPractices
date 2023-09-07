package Array_Assign;

import java.util.Arrays;

public class ToFindThirdLargestNum {
    public static void main(String[] args) {
        int arr[] = new int[]{ 4, 6, 10, 98, 67, 65 , 100 , 34};    // 4 6 10 34 65 67 98 100

        if(arr.length < 3){
            System.out.println("There is no Third largest number");
        }
        else{
            Arrays.sort(arr); //it will sort in descinding  order
            int thridLargest = arr[arr.length-3];
            System.out.println("The 3rd largest number in the array is: " + thridLargest);
        }
    }
}
