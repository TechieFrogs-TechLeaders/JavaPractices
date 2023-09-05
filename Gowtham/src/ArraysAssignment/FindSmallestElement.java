package ArraysAssignment;

public class FindSmallestElement {
    
    public static void main(String[] args) {
        int[] arr =new int[]{1, 45, 67, -2, 34, 23, 56, 0, -3};
        int smallest = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
