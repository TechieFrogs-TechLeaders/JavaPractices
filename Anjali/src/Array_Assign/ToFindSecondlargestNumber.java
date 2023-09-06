package Array_Assign;

import java.util.Arrays;

public class ToFindSecondlargestNumber {
    public static void main(String[] args) {
            int arr[] = new int[]{ 4, 6, 10, 98, 67, 65 , 100 , 34};    // 4 6 10 34 65 67 98 100
    
            if(arr.length < 2){
                System.out.println("There is no Second largest number");
            }
            else{
                Arrays.sort(arr); //it will sort in descinding  order
                int secondLargest = arr[arr.length-2];
                System.out.println("The 3rd largest number in the array is: " + secondLargest);
            }
        
    }
}
